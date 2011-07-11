package com.letlink.common.datamodel;

import java.io.Serializable;

public class ExcludedURL implements Serializable{
	
	private static final long serialVersionUID = 7271062125534220132L;
	private int excludedURLID;
	private String name;
	private int refDomainID;
	private boolean isActive;
	private String comment;
	
	public ExcludedURL(){}
	
	public ExcludedURL(String name, int refDomainID, boolean isActive,
			String comment) {
		super();
		this.name = name;
		this.refDomainID = refDomainID;
		this.isActive = isActive;
		this.comment = comment;
	}

	public int getExcludedURLID() {
		return excludedURLID;
	}

	public void setExcludedURLID(int excludedURLID) {
		this.excludedURLID = excludedURLID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRefDomainID() {
		return refDomainID;
	}

	public void setRefDomainID(int refDomainID) {
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
