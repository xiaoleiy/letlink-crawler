package com.letlink.common.datamodel;

import java.io.Serializable;

public class Crawler implements Serializable{
	
	private static final long serialVersionUID = -2901482082211521383L;
	private String name;
	private long crawlerID;
	private long refDomainID;
	private int refCronID;
	private long maxBytesDownload;
	private long maxImagesDownload;
	private long maxTimeSec;
	private int maxThreads;
	private boolean isActiviated;
	private String comment;
	
	public Crawler(){}

	public Crawler(String name, long refDomainID, int refCronID,
			long maxBytesDownload, long maxImagesDownload, long maxTimeSec,
			int maxThreads, boolean isActiviated, String comment) {
		super();
		this.name = name;
		this.refDomainID = refDomainID;
		this.refCronID = refCronID;
		this.maxBytesDownload = maxBytesDownload;
		this.maxImagesDownload = maxImagesDownload;
		this.maxTimeSec = maxTimeSec;
		this.maxThreads = maxThreads;
		this.isActiviated = isActiviated;
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCrawlerID() {
		return crawlerID;
	}

	public void setCrawlerID(long crawlerID) {
		this.crawlerID = crawlerID;
	}

	public long getRefDomainID() {
		return refDomainID;
	}

	public void setRefDomainID(long refDomainID) {
		this.refDomainID = refDomainID;
	}

	public int getRefCronID() {
		return refCronID;
	}

	public void setRefCronID(int refCronID) {
		this.refCronID = refCronID;
	}

	public long getMaxBytesDownload() {
		return maxBytesDownload;
	}

	public void setMaxBytesDownload(long maxBytesDownload) {
		this.maxBytesDownload = maxBytesDownload;
	}

	public long getMaxImagesDownload() {
		return maxImagesDownload;
	}

	public void setMaxImagesDownload(long maxImagesDownload) {
		this.maxImagesDownload = maxImagesDownload;
	}

	public long getMaxTimeSec() {
		return maxTimeSec;
	}

	public void setMaxTimeSec(long maxTimeSec) {
		this.maxTimeSec = maxTimeSec;
	}

	public int getMaxThreads() {
		return maxThreads;
	}

	public void setMaxThreads(int maxThreads) {
		this.maxThreads = maxThreads;
	}

	public boolean isActiviated() {
		return isActiviated;
	}

	public void setActiviated(boolean isActiviated) {
		this.isActiviated = isActiviated;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
