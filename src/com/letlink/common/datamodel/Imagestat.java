package com.letlink.common.datamodel;

import java.io.Serializable;
import java.sql.Timestamp;

public class Imagestat implements Serializable {

	private static final long serialVersionUID = 7470344393781184564L;
	private long imagestatID;
	private long refCrawlerID;
	private long refJobID;
	private long refDomainID;
	private long refSeedlistID;
	private Timestamp crawledDate;
	
	public Imagestat(){}

	public Imagestat(long refCrawlerID, long refJobID, long refDomainID,
			long refSeedlistID, Timestamp crawledDate) {
		super();
		this.refCrawlerID = refCrawlerID;
		this.refJobID = refJobID;
		this.refDomainID = refDomainID;
		this.refSeedlistID = refSeedlistID;
		this.crawledDate = crawledDate;
	}

	public long getImagestatID() {
		return imagestatID;
	}

	public void setImagestatID(long imagestatID) {
		this.imagestatID = imagestatID;
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
	
}
