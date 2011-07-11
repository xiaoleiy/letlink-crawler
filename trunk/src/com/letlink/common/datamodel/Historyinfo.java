package com.letlink.common.datamodel;

import java.io.Serializable;
import java.sql.Timestamp;

public class Historyinfo implements Serializable{

	private static final long serialVersionUID = -5754859669338688192L;
	private int historyinfoID;
	private int stopreason; //Refer to StopReason.java for valid reason code.
	private int objectcount;
	private int bytecount;
	private int refCrawlerID;
	private int refJobID;
	private Timestamp crawledDate;
	
	public Historyinfo(){}

	public Historyinfo(int stopreason, int objectcount, int bytecount,
			int refCrawlerID, int refJobID, Timestamp crawledDate) {
		super();
		this.stopreason = stopreason;
		this.objectcount = objectcount;
		this.bytecount = bytecount;
		this.refCrawlerID = refCrawlerID;
		this.refJobID = refJobID;
		this.crawledDate = crawledDate;
	}

	public int getHistoryinfoID() {
		return historyinfoID;
	}

	public void setHistoryinfoID(int historyinfoID) {
		this.historyinfoID = historyinfoID;
	}

	public int getStopreason() {
		return stopreason;
	}

	public void setStopreason(int stopreason) {
		this.stopreason = stopreason;
	}

	public int getObjectcount() {
		return objectcount;
	}

	public void setObjectcount(int objectcount) {
		this.objectcount = objectcount;
	}

	public int getBytecount() {
		return bytecount;
	}

	public void setBytecount(int bytecount) {
		this.bytecount = bytecount;
	}

	public int getRefCrawlerID() {
		return refCrawlerID;
	}

	public void setRefCrawlerID(int refCrawlerID) {
		this.refCrawlerID = refCrawlerID;
	}

	public int getRefJobID() {
		return refJobID;
	}

	public void setRefJobID(int refJobID) {
		this.refJobID = refJobID;
	}

	public Timestamp getCrawledDate() {
		return crawledDate;
	}

	public void setCrawledDate(Timestamp crawledDate) {
		this.crawledDate = crawledDate;
	}
	
}
