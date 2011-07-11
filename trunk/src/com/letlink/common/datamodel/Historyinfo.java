package com.letlink.common.datamodel;

import java.io.Serializable;
import java.sql.Timestamp;

public class Historyinfo implements Serializable{

	private static final long serialVersionUID = -5754859669338688192L;
	private long historyinfoID;
	private int stopreason; //Refer to StopReason.java for valid reason code.
	private long objectcount;
	private long bytecount;
	private long refCrawlerID;
	private long refJobID;
	private Timestamp crawledDate;
	
	public Historyinfo(){}

	public Historyinfo(int stopreason, long objectcount, long bytecount,
			long refCrawlerID, long refJobID, Timestamp crawledDate) {
		super();
		this.stopreason = stopreason;
		this.objectcount = objectcount;
		this.bytecount = bytecount;
		this.refCrawlerID = refCrawlerID;
		this.refJobID = refJobID;
		this.crawledDate = crawledDate;
	}

	public long getHistoryinfoID() {
		return historyinfoID;
	}

	public void setHistoryinfoID(long historyinfoID) {
		this.historyinfoID = historyinfoID;
	}

	public int getStopreason() {
		return stopreason;
	}

	public void setStopreason(int stopreason) {
		this.stopreason = stopreason;
	}

	public long getObjectcount() {
		return objectcount;
	}

	public void setObjectcount(long objectcount) {
		this.objectcount = objectcount;
	}

	public long getBytecount() {
		return bytecount;
	}

	public void setBytecount(long bytecount) {
		this.bytecount = bytecount;
	}

	public long getRefCrawlerID() {
		return refCrawlerID;
	}

	public void setRefCrawlerID(long refCrawlerID) {
		this.refCrawlerID = refCrawlerID;
	}

	public long getRefJobID() {
		return refJobID;
	}

	public void setRefJobID(long refJobID) {
		this.refJobID = refJobID;
	}

	public Timestamp getCrawledDate() {
		return crawledDate;
	}

	public void setCrawledDate(Timestamp crawledDate) {
		this.crawledDate = crawledDate;
	}
	
}
