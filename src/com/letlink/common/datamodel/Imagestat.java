package com.letlink.common.datamodel;

import java.io.Serializable;
import java.sql.Timestamp;

public class Imagestat implements Serializable {

	private static final long serialVersionUID = 7470344393781184564L;
	private int imagestatID;
	private int refCrawlerID;
	private int refJobID;
	private int refDomainID;
	private int refSeedlistID;
	private Timestamp crawledDate;
	
	public Imagestat(){}

	public Imagestat(int refCrawlerID, int refJobID, int refDomainID,
			int refSeedlistID, Timestamp crawledDate) {
		super();
		this.refCrawlerID = refCrawlerID;
		this.refJobID = refJobID;
		this.refDomainID = refDomainID;
		this.refSeedlistID = refSeedlistID;
		this.crawledDate = crawledDate;
	}

	public int getImagestatID() {
		return imagestatID;
	}

	public void setImagestatID(int imagestatID) {
		this.imagestatID = imagestatID;
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

	public int getRefDomainID() {
		return refDomainID;
	}

	public void setRefDomainID(int refDomainID) {
		this.refDomainID = refDomainID;
	}

	public int getRefSeedlistID() {
		return refSeedlistID;
	}

	public void setRefSeedlistID(int refSeedlistID) {
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
