package com.letlink.common.datamodel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class FrontierReportMonitor implements Serializable {

	private static final long serialVersionUID = -792885677591497110L;
	private long jobID;
	private String filterID;
	private Timestamp tstamp;
	private String domainName;
	private long currentSize;
	private long totalEnqueues;
	private long sessionBalance;
	private BigDecimal lastCost;
	private BigDecimal averageCost;
	private String lastDequeueTime;
	private String wakeTime;
	private long totalSpend;
	private long totalBudget;
	private long errorCount;
	private String lastPeekURI;
	private String lastQueueURI;
	
	public FrontierReportMonitor(){}

	public FrontierReportMonitor(long jobID, String filterID, Timestamp tstamp,
			String domainName, long currentSize, long totalEnqueues,
			long sessionBalance, BigDecimal lastCost, BigDecimal averageCost,
			String lastDequeueTime, String wakeTime, long totalSpend,
			long totalBudget, long errorCount, String lastPeekURI,
			String lastQueueURI) {
		super();
		this.jobID = jobID;
		this.filterID = filterID;
		this.tstamp = tstamp;
		this.domainName = domainName;
		this.currentSize = currentSize;
		this.totalEnqueues = totalEnqueues;
		this.sessionBalance = sessionBalance;
		this.lastCost = lastCost;
		this.averageCost = averageCost;
		this.lastDequeueTime = lastDequeueTime;
		this.wakeTime = wakeTime;
		this.totalSpend = totalSpend;
		this.totalBudget = totalBudget;
		this.errorCount = errorCount;
		this.lastPeekURI = lastPeekURI;
		this.lastQueueURI = lastQueueURI;
	}

	public long getJobID() {
		return jobID;
	}

	public void setJobID(long jobID) {
		this.jobID = jobID;
	}

	public String getFilterID() {
		return filterID;
	}

	public void setFilterID(String filterID) {
		this.filterID = filterID;
	}

	public Timestamp getTstamp() {
		return tstamp;
	}

	public void setTstamp(Timestamp tstamp) {
		this.tstamp = tstamp;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public long getCurrentSize() {
		return currentSize;
	}

	public void setCurrentSize(long currentSize) {
		this.currentSize = currentSize;
	}

	public long getTotalEnqueues() {
		return totalEnqueues;
	}

	public void setTotalEnqueues(long totalEnqueues) {
		this.totalEnqueues = totalEnqueues;
	}

	public long getSessionBalance() {
		return sessionBalance;
	}

	public void setSessionBalance(long sessionBalance) {
		this.sessionBalance = sessionBalance;
	}

	public BigDecimal getLastCost() {
		return lastCost;
	}

	public void setLastCost(BigDecimal lastCost) {
		this.lastCost = lastCost;
	}

	public BigDecimal getAverageCost() {
		return averageCost;
	}

	public void setAverageCost(BigDecimal averageCost) {
		this.averageCost = averageCost;
	}

	public String getLastDequeueTime() {
		return lastDequeueTime;
	}

	public void setLastDequeueTime(String lastDequeueTime) {
		this.lastDequeueTime = lastDequeueTime;
	}

	public String getWakeTime() {
		return wakeTime;
	}

	public void setWakeTime(String wakeTime) {
		this.wakeTime = wakeTime;
	}

	public long getTotalSpend() {
		return totalSpend;
	}

	public void setTotalSpend(long totalSpend) {
		this.totalSpend = totalSpend;
	}

	public long getTotalBudget() {
		return totalBudget;
	}

	public void setTotalBudget(long totalBudget) {
		this.totalBudget = totalBudget;
	}

	public long getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(long errorCount) {
		this.errorCount = errorCount;
	}

	public String getLastPeekURI() {
		return lastPeekURI;
	}

	public void setLastPeekURI(String lastPeekURI) {
		this.lastPeekURI = lastPeekURI;
	}

	public String getLastQueueURI() {
		return lastQueueURI;
	}

	public void setLastQueueURI(String lastQueueURI) {
		this.lastQueueURI = lastQueueURI;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
