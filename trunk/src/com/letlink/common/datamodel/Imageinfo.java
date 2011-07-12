package com.letlink.common.datamodel;

import java.io.Serializable;
import java.sql.Timestamp;

public class Imageinfo implements Serializable {

	private static final long serialVersionUID = 7470344393781184564L;
	private long imagespecID;
	private long refCrawlerID;
	private long refJobID;
	private long refDomainID;
	private long refSeedlistID;
	private int crawleStatus;
	private int uploadStatus;
	private Timestamp crawledDate;
	
	public Imageinfo(){}

	public Imageinfo(long refCrawlerID, long refJobID, long refDomainID,
			long refSeedlistID, Timestamp crawledDate) {
		super();
		this.refCrawlerID = refCrawlerID;
		this.refJobID = refJobID;
		this.refDomainID = refDomainID;
		this.refSeedlistID = refSeedlistID;
		this.crawledDate = crawledDate;
	}

	public long getImagespecID() {
		return imagespecID;
	}

	public void setImagespecID(long imagespecID) {
		this.imagespecID = imagespecID;
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

	public long getRefDomainID() {
		return refDomainID;
	}

	public void setRefDomainID(long refDomainID) {
		this.refDomainID = refDomainID;
	}

	public long getRefSeedlistID() {
		return refSeedlistID;
	}

	public void setRefSeedlistID(long refSeedlistID) {
		this.refSeedlistID = refSeedlistID;
	}

	public Timestamp getCrawledDate() {
		return crawledDate;
	}

	public void setCrawledDate(Timestamp crawledDate) {
		this.crawledDate = crawledDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCrawleStatus() {
		return crawleStatus;
	}

	public void setCrawleStatus(int crawleStatus) {
		this.crawleStatus = crawleStatus;
	}

	public int getUploadStatus() {
		return uploadStatus;
	}

	public void setUploadStatus(int uploadStatus) {
		this.uploadStatus = uploadStatus;
	}
}
