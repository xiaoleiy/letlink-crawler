package com.letlink.common.datamodel;

import java.io.Serializable;
import java.sql.Timestamp;

public class Job implements Serializable {
	
	private static final long serialVersionUID = 4118571298233469176L;
	private int jobID;
	private String name;
	private int priority;	//Refer to JobPriority.java for valid priority code
	private String status;	//Refer to JobStatus.java for valid job status.
	private int refCrawlerID;
	private int refSeedlistID;
	private Timestamp submitDate;
	private Timestamp startDate;
	private Timestamp endDate;
	private int forceMaxbytes;
	private int forceMaxcount;
	private int forceMaxrunningtime;
	private int crawlingNum;	//The sequential no of this job in its contained crawler
	private int resubmittedAsJob;
	private String crawlingErrors;
	private String crawlingErrorDetails;
	private String uploadErrors;
	private String uploadErrorDetails;
	private String altCol01;	//Alternative column definition. TODO: If useless, delete these 4 columns.
	private String altCol02;
	private int altCol03;
	private int altCol04;
	
	public Job(){}

	public Job(String name, int priority, String status, int refCrawlerID,
			int refSeedlistID, Timestamp submitDate, Timestamp startDate,
			Timestamp endDate, int forceMaxbytes, int forceMaxcount,
			int forceMaxrunningtime, int crawlingNum, String crawlingErrors,
			String crawlingErrorDetails, String uploadErrors,
			String uploadErrorDetails, int resubmittedAsJob, String altCol01,
			String altCol02, int altCol03, int altCol04) {
		super();
		this.name = name;
		this.priority = priority;
		this.status = status;
		this.refCrawlerID = refCrawlerID;
		this.refSeedlistID = refSeedlistID;
		this.submitDate = submitDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.forceMaxbytes = forceMaxbytes;
		this.forceMaxcount = forceMaxcount;
		this.forceMaxrunningtime = forceMaxrunningtime;
		this.crawlingNum = crawlingNum;
		this.crawlingErrors = crawlingErrors;
		this.crawlingErrorDetails = crawlingErrorDetails;
		this.uploadErrors = uploadErrors;
		this.uploadErrorDetails = uploadErrorDetails;
		this.resubmittedAsJob = resubmittedAsJob;
		this.altCol01 = altCol01;
		this.altCol02 = altCol02;
		this.altCol03 = altCol03;
		this.altCol04 = altCol04;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRefCrawlerID() {
		return refCrawlerID;
	}

	public void setRefCrawlerID(int refCrawlerID) {
		this.refCrawlerID = refCrawlerID;
	}

	public int getRefSeedlistID() {
		return refSeedlistID;
	}

	public void setRefSeedlistID(int refSeedlistID) {
		this.refSeedlistID = refSeedlistID;
	}

	public Timestamp getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Timestamp submitDate) {
		this.submitDate = submitDate;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public int getForceMaxbytes() {
		return forceMaxbytes;
	}

	public void setForceMaxbytes(int forceMaxbytes) {
		this.forceMaxbytes = forceMaxbytes;
	}

	public int getForceMaxcount() {
		return forceMaxcount;
	}

	public void setForceMaxcount(int forceMaxcount) {
		this.forceMaxcount = forceMaxcount;
	}

	public int getForceMaxrunningtime() {
		return forceMaxrunningtime;
	}

	public void setForceMaxrunningtime(int forceMaxrunningtime) {
		this.forceMaxrunningtime = forceMaxrunningtime;
	}

	public int getCrawlingNum() {
		return crawlingNum;
	}

	public void setCrawlingNum(int crawlingNum) {
		this.crawlingNum = crawlingNum;
	}

	public String getCrawlingErrors() {
		return crawlingErrors;
	}

	public void setCrawlingErrors(String crawlingErrors) {
		this.crawlingErrors = crawlingErrors;
	}

	public String getCrawlingErrorDetails() {
		return crawlingErrorDetails;
	}

	public void setCrawlingErrorDetails(String crawlingErrorDetails) {
		this.crawlingErrorDetails = crawlingErrorDetails;
	}

	public String getUploadErrors() {
		return uploadErrors;
	}

	public void setUploadErrors(String uploadErrors) {
		this.uploadErrors = uploadErrors;
	}

	public String getUploadErrorDetails() {
		return uploadErrorDetails;
	}

	public void setUploadErrorDetails(String uploadErrorDetails) {
		this.uploadErrorDetails = uploadErrorDetails;
	}

	public int getResubmittedAsJob() {
		return resubmittedAsJob;
	}

	public void setResubmittedAsJob(int resubmittedAsJob) {
		this.resubmittedAsJob = resubmittedAsJob;
	}

	public String getAltCol01() {
		return altCol01;
	}

	public void setAltCol01(String altCol01) {
		this.altCol01 = altCol01;
	}

	public String getAltCol02() {
		return altCol02;
	}

	public void setAltCol02(String altCol02) {
		this.altCol02 = altCol02;
	}

	public int getAltCol03() {
		return altCol03;
	}

	public void setAltCol03(int altCol03) {
		this.altCol03 = altCol03;
	}

	public int getAltCol04() {
		return altCol04;
	}

	public void setAltCol04(int altCol04) {
		this.altCol04 = altCol04;
	}
	
}
