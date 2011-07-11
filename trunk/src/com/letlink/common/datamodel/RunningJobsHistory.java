package com.letlink.common.datamodel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class RunningJobsHistory implements Serializable {

	private static final long serialVersionUID = 1010784809742081110L;
	private long jobID;
	private String harvestName;
	private String hostURL;
	private BigDecimal progress;
	private long queuedFilesCount;
	private long totalQueuesCount;
	private long activeQueuesCount;
	private long retiredQueuesCount;
	private long exhaustedQueuesCount;
	private long elapsedSeconds;
	private long alertsCount;
	private long downloadedFilesCount;
	private int currentProcessdKBPerSec;
	private int processedKBPerSec;
	private BigDecimal currentProcessedDocsPerSec;
	private BigDecimal processedDocsPerSec;
	private int activeToeCount;
	private int status;
	private Timestamp tstamp;
	
	public RunningJobsHistory(){}

	public RunningJobsHistory(long jobID, String harvestName, String hostURL,
			BigDecimal progress, long queuedFilesCount, long totalQueuesCount,
			long activeQueuesCount, long retiredQueuesCount,
			long exhaustedQueuesCount, long elapsedSeconds, long alertsCount,
			long downloadedFilesCount, int currentProcessdKBPerSec,
			int processedKBPerSec, BigDecimal currentProcessedDocsPerSec,
			BigDecimal processedDocsPerSec, int activeToeCount, int status,
			Timestamp tstamp) {
		super();
		this.jobID = jobID;
		this.harvestName = harvestName;
		this.hostURL = hostURL;
		this.progress = progress;
		this.queuedFilesCount = queuedFilesCount;
		this.totalQueuesCount = totalQueuesCount;
		this.activeQueuesCount = activeQueuesCount;
		this.retiredQueuesCount = retiredQueuesCount;
		this.exhaustedQueuesCount = exhaustedQueuesCount;
		this.elapsedSeconds = elapsedSeconds;
		this.alertsCount = alertsCount;
		this.downloadedFilesCount = downloadedFilesCount;
		this.currentProcessdKBPerSec = currentProcessdKBPerSec;
		this.processedKBPerSec = processedKBPerSec;
		this.currentProcessedDocsPerSec = currentProcessedDocsPerSec;
		this.processedDocsPerSec = processedDocsPerSec;
		this.activeToeCount = activeToeCount;
		this.status = status;
		this.tstamp = tstamp;
	}

	public long getJobID() {
		return jobID;
	}

	public void setJobID(long jobID) {
		this.jobID = jobID;
	}

	public String getHarvestName() {
		return harvestName;
	}

	public void setHarvestName(String harvestName) {
		this.harvestName = harvestName;
	}

	public String getHostURL() {
		return hostURL;
	}

	public void setHostURL(String hostURL) {
		this.hostURL = hostURL;
	}

	public BigDecimal getProgress() {
		return progress;
	}

	public void setProgress(BigDecimal progress) {
		this.progress = progress;
	}

	public long getQueuedFilesCount() {
		return queuedFilesCount;
	}

	public void setQueuedFilesCount(long queuedFilesCount) {
		this.queuedFilesCount = queuedFilesCount;
	}

	public long getTotalQueuesCount() {
		return totalQueuesCount;
	}

	public void setTotalQueuesCount(long totalQueuesCount) {
		this.totalQueuesCount = totalQueuesCount;
	}

	public long getActiveQueuesCount() {
		return activeQueuesCount;
	}

	public void setActiveQueuesCount(long activeQueuesCount) {
		this.activeQueuesCount = activeQueuesCount;
	}

	public long getRetiredQueuesCount() {
		return retiredQueuesCount;
	}

	public void setRetiredQueuesCount(long retiredQueuesCount) {
		this.retiredQueuesCount = retiredQueuesCount;
	}

	public long getExhaustedQueuesCount() {
		return exhaustedQueuesCount;
	}

	public void setExhaustedQueuesCount(long exhaustedQueuesCount) {
		this.exhaustedQueuesCount = exhaustedQueuesCount;
	}

	public long getElapsedSeconds() {
		return elapsedSeconds;
	}

	public void setElapsedSeconds(long elapsedSeconds) {
		this.elapsedSeconds = elapsedSeconds;
	}

	public long getAlertsCount() {
		return alertsCount;
	}

	public void setAlertsCount(long alertsCount) {
		this.alertsCount = alertsCount;
	}

	public long getDownloadedFilesCount() {
		return downloadedFilesCount;
	}

	public void setDownloadedFilesCount(long downloadedFilesCount) {
		this.downloadedFilesCount = downloadedFilesCount;
	}

	public int getCurrentProcessdKBPerSec() {
		return currentProcessdKBPerSec;
	}

	public void setCurrentProcessdKBPerSec(int currentProcessdKBPerSec) {
		this.currentProcessdKBPerSec = currentProcessdKBPerSec;
	}

	public int getProcessedKBPerSec() {
		return processedKBPerSec;
	}

	public void setProcessedKBPerSec(int processedKBPerSec) {
		this.processedKBPerSec = processedKBPerSec;
	}

	public BigDecimal getCurrentProcessedDocsPerSec() {
		return currentProcessedDocsPerSec;
	}

	public void setCurrentProcessedDocsPerSec(BigDecimal currentProcessedDocsPerSec) {
		this.currentProcessedDocsPerSec = currentProcessedDocsPerSec;
	}

	public BigDecimal getProcessedDocsPerSec() {
		return processedDocsPerSec;
	}

	public void setProcessedDocsPerSec(BigDecimal processedDocsPerSec) {
		this.processedDocsPerSec = processedDocsPerSec;
	}

	public int getActiveToeCount() {
		return activeToeCount;
	}

	public void setActiveToeCount(int activeToeCount) {
		this.activeToeCount = activeToeCount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getTstamp() {
		return tstamp;
	}

	public void setTstamp(Timestamp tstamp) {
		this.tstamp = tstamp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
