package com.letlink.common.datamodel;

import java.io.Serializable;

public class Crawler implements Serializable{
	
	private static final long serialVersionUID = -2901482082211521383L;
	private String name;
	private int crawlerID;
	private int refDomainID;
	private int refCronID;
	private int maxBytesDownload;
	private int maxImagesDownload;
	private int maxTimeSec;
	private int maxThreads;
	private boolean isActiviated;
	private String comment;
	
	public Crawler(){}

	public Crawler(String name, int refDomainID, int refCronID,
			int maxBytesDownload, int maxImagesDownload, int maxTimeSec,
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

	public int getCrawlerID() {
		return crawlerID;
	}

	public void setCrawlerID(int crawlerID) {
		this.crawlerID = crawlerID;
	}

	public int getRefDomainID() {
		return refDomainID;
	}

	public void setRefDomainID(int refDomainID) {
		this.refDomainID = refDomainID;
	}

	public int getRefCronID() {
		return refCronID;
	}

	public void setRefCronID(int refCronID) {
		this.refCronID = refCronID;
	}

	public int getMaxBytesDownload() {
		return maxBytesDownload;
	}

	public void setMaxBytesDownload(int maxBytesDownload) {
		this.maxBytesDownload = maxBytesDownload;
	}

	public int getMaxImagesDownload() {
		return maxImagesDownload;
	}

	public void setMaxImagesDownload(int maxImagesDownload) {
		this.maxImagesDownload = maxImagesDownload;
	}

	public int getMaxTimeSec() {
		return maxTimeSec;
	}

	public void setMaxTimeSec(int maxTimeSec) {
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
