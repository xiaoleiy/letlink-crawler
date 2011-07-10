/**
 * Script name: 	letlink_webcrawler.sql
 * Revision: 		0.1
 * Created Date: 	2011-07-10
 * Revised Date: 	2011-04-13
 * Author: 			Jerry Joe
 * 
 * MySQL version: 	MySQL 5.1.5+
 * Usage: 			mysql < letlink_webcrawler.sql
 * Note:			If the database will be hosted at a remote MySQL server,
 *+ 				follow the steps below in MySQL server to gain required privileges 
 *+ 				1) make sure user is created, with password being set. 
 *+ 				2) execute the command: 
 *					   GRANT ALL PRIVILEGES ON *.* TO '<user>'@'<client_server_ip>' IDENTIFIED BY '<user>' WITH GRANT OPTION;
 */

/**
 * Database creation
 * Note: all tables has the same characterset: UTF8
 */
DROP DATABASE IF EXISTS letlink_webcrawler;
CREATE DATABASE IF NOT EXISTS letlink_webcrawler DEFAULT CHARACTER SET = UTF8;
USE letlink_webcrawler;
SET AUTOCOMMIT=0;

/**
 * Domains
 * */
create table if not exists domain_category(
	domaincategory_id int not null auto_increment primary key,
	name varchar(255) not null unique,
	comment varchar(512)				# TODO: add alert on text length limit in web page
);

insert into domain_category values(-1, "default", 
	"The default domain category. The domains created without given category will belong to this one. Note: Not allow to delete!");

-- -----------------------------------------------------------------------------
create table if not exists domains(
	domain_id int unsigned not null auto_increment primary key,
	name varchar(255) not null unique,
	alias varchar(255) unique,
	ref_category_id int not null default -1,	# Foreign key to domain_category (id)
	isCrawling boolean default false,
	comment varchar(512)				# 2048 2-byte characters(i.e. CJK) at most
);

create index domains_nameid_idx on domains(domain_id, name);
create index domains_alias_idx on domains(alias);

-- -----------------------------------------------------------------------------
-- Note: This table contains the owner information on domains
create table ownerinfo (
    ownerinfo_id int unsigned not null primary key,
    ref_domain_id int unsigned not null,	#-- FK to domains(domain_id)	
    created_time datetime not null,
    info varchar(1024) not null 			#-- actual owner info, e.g., WHOIS information
);

create index ownerinfo_domainid_idx on ownerinfo(ref_domain_id);

-- -----------------------------------------------------------------------------
create table if not exists excluded_urls(
	excludedurl_id int unsigned not null auto_increment primary key,
	name varchar(255) not null,
	ref_domain_id int unsigned not null,	# Foreign key to domain (domain_id)
	isActive boolean not null default false,
	comment varchar(512)				# TODO: add alert on text length limit in web page
);

create index excludedurls_domainid_idx on excluded_urls (ref_domain_id);


/**
 * Seedlist
 * */
create table if not exists seedlist(
	seedlist_id int unsigned not null auto_increment primary key,
	name varchar(255) not null,
	ref_domain_id int not null, 			# Foreign key to domain (domain_id), the domain that seedlist belongs to
	seeds mediumtext not null, 			# max bytes: 2^24
	comment varchar(512)
);

create index seedlist_name_idx on seedlist (name);
create index seedlist_domainid_idx on seedlist (ref_domain_id);


/**
 * Crons
 * */
create table if not exists crons(
	cron_id int unsigned not null auto_increment primary key,
	name varchar(255) not null unique,
	minute varchar(128) comment "minute, 0-59",
	hour varchar(64) comment "hour, 0-23",
	dom varchar(64) comment "day of month, 1-31",
	month varchar(32) comment "month, 1-12",
	dow varchar(20) comment "day of week, 0-7 (Sunday: 0 or 7)",
	repeats int unsigned default 1,		# -- max repeat of the crawler task. NULL for endless cron
	comment varchar(512)
);

insert into crons(name, minute, hour, dom, month, dow, repeats, comment) 
	values("default", null, null, null, null, null, 1,    "Default cron: just execute the crawling task one time as soon as it's activiated.");
insert into crons(name, minute, hour, dom, month, dow, repeats, comment)
	values("hourly",  "1",  null, null, null, null, null, "Hourly cron: execute the crawling task once per hour at the 1st minute, and continue forever.");
insert into crons(name, minute, hour, dom, month, dow, repeats, comment)
	values("daily",   "1",  "0",  null, null, null, null, "Daily cron: execute the crawling task once per day at time 00:01, and continue forever.");
insert into crons(name, minute, hour, dom, month, dow, repeats, comment)
	values("weekly",  "1",  "0",  null, null, "0",  null, "Weekly cron: execute the crawling task once per week at Sunday 00:01, and continue forever.");
insert into crons(name, minute, hour, dom, month, dow, repeats, comment)
	values("monthly", "1",  "0",  "1",  null, null, null, "Monthly cron: execute the crawling task once per month at time 00:01, 1st day of every month, and continue forever.");
insert into crons(name, minute, hour, dom, month, dow, repeats, comment)
	values("every 3 months", "1", "0",  "1", "1,3,6,9", null, null, 
		"Every 3 months cron: execute the crawling task once every 3 months at 1-Jan 00:01, 1-Mar 00:01, 1-Jun 00:01, and 1-Sep 00:01, and continue forever." );
insert into crons(name, minute, hour, dom, month, dow, repeats, comment)
	values("half a year", "1", "0", "1", "1,6", null, null, "Half a year cron: execute the crawling task once half a year at 1-Jan 00:01 and 1-Jun 00:01, and continue forever.");
insert into crons(name, minute, hour, dom, month, dow, repeats, comment)
	values("yearly", "1", "0", "1", "1", null, null, "Yearly cron: execute the crawling task once a year at 1-Jan 00:01, and contiue forever.");


/**
 * Crawlers
 * */
create table if not exists crawlers(
	crawler_id int unsigned not null auto_increment primary key,
	name varchar(255) not null unique,
	ref_domain_id int unsigned not null,	#-- FK to domains (domain_id). TODO: to confirm this field.
	ref_cron_id int unsigned not null,		#-- FK to crons (cron_id). 
	max_bytes_download int unsigned,			
	max_images_download int unsigned,
	max_time_sec int unsigned,
	max_threads int unsigned,
	isActiviated boolean not null default false,
	comment varchar(512)
);

create index crawlers_name_idx on crawlers(name);

-- -----------------------------------------------------------------------------
-- Description:  This table contains historical information about domains
create table historyinfo (
    historyinfo_id int unsigned not null primary key,
    stopreason int not null,        		#-- Reason for stopping is defined and documented in StopReason.java
    objectcount int unsigned not null,    	#-- Count of collected objects
    bytecount int unsigned not null,      	#-- Count of collected bytes
    ref_crawler_id int unsigned not null,   #-- Identification of harvest the
                                    		#--+  information origins from - must be the
                                    		#--+  same as the one given via the jobs table
    ref_job_id int unsigned,                  	#-- Identification of job the information origins from
    crawled_time timestamp not null 		#-- Time when the harvest was done
);

create index historyinfo_crawlerid_idx on historyinfo (ref_crawler_id);
create index historyinfo_jobid_idx on historyinfo(ref_job_id);
create index historyinfo_jobid_crawlerid_idx on historyinfo (ref_job_id, ref_crawler_id);

 
/**
 * Jobs
 * */
create table if not exists jobs(
	job_id int unsigned not null auto_increment primary key,
	name varchar(255) not null,
	priority int default 0, 				#-- Job priority where valid values are defined in JobPriority.java
	status varchar(20) not null,			#-- Job status where valid values are defined in JobStatus.java
	ref_crawler_id int unsigned not null,	#-- FK to cralwers (cralwer_id)
	ref_seedlist_id int not null,			#-- FK to seedlist (seedlist_id)
	submit_date datetime not null,
	start_date datetime not null,
	end_date datetime,
    forcemaxbytes int unsigned,				#-- null for no max download bytes limit defined
    forcemaxcount int unsigned,
    forcemaxrunningtime int unsigned not null default 0,
    crawling_num int unsigned not null,
    crawling_errors varchar(255),
    crawling_error_details varchar(4096),
    upload_errors varchar(255),
    upload_error_details varchar(4096),
    resubmitted_as_job int unsigned,
    alt_col01 varchar(255),
    alt_col03 varchar(255),
    alt_col02 int,
    alt_col04 int
);

create index jobs_refcrawlerid_idx on jobs(ref_crawler_id);
create index jobs_status_idx on jobs(status);


/**
 * Images
 * */
create table if not exists imageinfo(
	imageinfo_id int unsigned not null auto_increment primary key,
	filename varchar(255) not null,			#-- raw filename, included as last part of image url
	storage_path varchar(2048) not null,	#-- filepath in FTP server
	image_url varchar(2048) not null,
	page_url varchar(2048) not null,
	pixels_width int,
	pixels_height int,
	size_bytes int unsigned,
	file_format varchar(32)
);

create index imageinfo_filename_idx on imageinfo(filename);

-- -----------------------------------------------------------------------------
create table if not exists imagestat(
	imagestat_id int unsigned not null, 	#-- FK to imageinfo(imageinfo_id)
	ref_crawler_id int unsigned not null,	#-- FK to crawlers(crawler_id)
	ref_job_id int unsigned not null, 		#-- FK to jobs(job_id)
	ref_domain_id int unsigned,				#-- FK to domains(domain_id). Note: in case of deep-link crawling, this field may be inserted as null
	ref_seedlist_id int unsigned, 			#-- FK to seedlist(seedlist_id)
	crawled_date datetime					#-- date when this record of image was crawled  
);

create index imagestat_imagestatid_idx on imagestat(imagestat_id);
create index imagestat_crawlerid_idx on imagestat(ref_crawler_id);
create index imagestat_jobid_idx on imagestat(ref_job_id);
create index imagestat_domainid_idx on imagestat(ref_domain_id);
create index imagestat_seedlist_idx on imagestat(ref_seedlist_id);


/**
 * Running Jobs Progress History
 * */

-- -----------------------------------------------------------------------------
-- Description: This table contains the archived progress information reported by the running
-- jobs, controlled by a sample rate
CREATE TABLE runningJobsHistory (
     jobId bigint NOT NULL,
     harvestName varchar(255) NOT NULL,
     hostUrl varchar(255) NOT NULL,
     progress numeric NOT NULL,
     queuedFilesCount bigint NOT NULL,
     totalQueuesCount bigint NOT NULL,
     activeQueuesCount bigint NOT NULL,
     retiredQueuesCount bigint NOT NULL,
     exhaustedQueuesCount bigint NOT NULL,
     elapsedSeconds bigint NOT NULL,
     alertsCount bigint NOT NULL,
     downloadedFilesCount bigint NOT NULL,
     currentProcessedKBPerSec int NOT NULL,
     processedKBPerSec int NOT NULL,
     currentProcessedDocsPerSec numeric NOT NULL,
     processedDocsPerSec numeric NOT NULL,
     activeToeCount integer NOT NULL,
     status integer NOT NULL,
     tstamp timestamp NOT NULL,
     PRIMARY KEY (jobId, harvestName, elapsedSeconds, tstamp)
);

CREATE INDEX runningJobsHistoryCrawlJobId on runningJobsHistory (jobId);
CREATE INDEX runningJobsHistoryCrawlTime on runningJobsHistory (elapsedSeconds);
CREATE INDEX runningJobsHistoryHarvestName on runningJobsHistory (harvestName);

GRANT SELECT,INSERT,UPDATE,DELETE ON TABLE runningJobsHistory TO root;

-- -----------------------------------------------------------------------------
-- Description: This table contains the latest progress information reported by the job,
-- for every job
CREATE TABLE runningJobsMonitor (
     jobId bigint NOT NULL,
     harvestName varchar(255) NOT NULL,
     hostUrl varchar(255) NOT NULL,
     progress numeric NOT NULL,
     queuedFilesCount bigint NOT NULL,
     totalQueuesCount bigint NOT NULL,
     activeQueuesCount bigint NOT NULL,
     retiredQueuesCount bigint NOT NULL,
     exhaustedQueuesCount bigint NOT NULL,
     elapsedSeconds bigint NOT NULL,
     alertsCount bigint NOT NULL,
     downloadedFilesCount bigint NOT NULL,
     currentProcessedKBPerSec integer NOT NULL,
     processedKBPerSec integer NOT NULL,
     currentProcessedDocsPerSec numeric NOT NULL,
     processedDocsPerSec numeric NOT NULL,
     activeToeCount integer NOT NULL,
     status integer NOT NULL,
     tstamp timestamp NOT NULL,
     PRIMARY KEY (jobId, harvestName)
);

CREATE INDEX runningJobsMonitorJobId on runningJobsMonitor (jobId);
CREATE INDEX runningJobsMonitorHarvestName on runningJobsMonitor (harvestName);

-- -----------------------------------------------------------------------------
-- Description: This table contains frontier report data
CREATE TABLE frontierReportMonitor (
     jobId bigint NOT NULL,
     filterId varchar(200) NOT NULL,
     tstamp timestamp NOT NULL,
     domainName varchar(255) NOT NULL,
     currentSize bigint NOT NULL,
     totalEnqueues bigint NOT NULL,
     sessionBalance bigint NOT NULL,
     lastCost numeric NOT NULL,
     averageCost numeric NOT NULL,
     lastDequeueTime varchar(100) NOT NULL,
     wakeTime varchar(100) NOT NULL,
     totalSpend bigint NOT NULL,
     totalBudget bigint NOT NULL,
     errorCount bigint NOT NULL,
     lastPeekUri varchar(1000) NOT NULL,
     lastQueuedUri varchar(1000) NOT NULL,
     UNIQUE (jobId, filterId(100), domainName(100))  #-- NB see http://bugs.mysql.com/bug.php?id=6604 about index key length.
);

COMMIT;