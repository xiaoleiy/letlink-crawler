package com.letlink.common.datamodel;

import java.io.Serializable;

public class ExcludedURL implements Serializable{
	
	private static final long serialVersionUID = 7271062125534220132L;
	private long excludedURLID;
	private long refDomainID;
	private boolean isActive;
	private String name;
	private String comment;
	
	public ExcludedURL(){}
	
	public ExcludedURL(String name, long refDomainID, boolean isActive,
			String comment) {
		super();
		this.name = name;
		this.refDomainID = refDomainID;
		this.isActive = isActive;
		this.comment = comment;
	}

	public long getExcludedURLID() {
		return excludedURLID;
	}

	public void setExcludedURLID(long excludedURLID) {
		this.excludedURLID = excludedURLID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRefDomainID() {
		return refDomainID;
	}

	public void setRefDomainID(long refDomainID) {
		this.refDomainID = refDomainID;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
