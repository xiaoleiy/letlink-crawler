package com.letlink.common.datamodel;

import java.io.Serializable;

import com.letlink.common.Constants;

public class Domain implements Serializable{

	private static final long serialVersionUID = -5771803185806088481L;
	private long domainID;
	private int refCategoryID;
	private String name;
	private String alias;
	private String comment;
	private boolean isCrawling;
	
	public Domain(){}
	
	public Domain(String name){
		this.alias = name;
		this.refCategoryID = Constants.DEFAULT_DOMAIN_CATEGORY;
		this.isCrawling = false;
	}
	
	public Domain(String name, String alias,
			int refCategoryID, boolean isCrawling, String comment) {
		super();
		this.name = name;
		this.alias = alias;
		this.refCategoryID = refCategoryID;
		this.isCrawling = isCrawling;
		this.comment = comment;
	}
	
	public long getDomainID() {
		return domainID;
	}
	public void setDomainID(long domainID) {
		this.domainID = domainID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public int getRefCategoryID() {
		return refCategoryID;
	}
	public void setRefCategoryID(int refCategoryID) {
		this.refCategoryID = refCategoryID;
	}
	public boolean isCrawling() {
		return isCrawling;
	}
	public void setCrawling(boolean isCrawling) {
		this.isCrawling = isCrawling;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
