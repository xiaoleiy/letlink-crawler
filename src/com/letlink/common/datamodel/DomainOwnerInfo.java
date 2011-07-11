package com.letlink.common.datamodel;

import java.io.Serializable;
import java.sql.Timestamp;

public class DomainOwnerInfo implements Serializable{
	
	private static final long serialVersionUID = -3726976587476049210L;
	private long ownerinfoID;
	private long refDomainID;
	private Timestamp createdDate;
	private String info;
	
	public DomainOwnerInfo(){}
	
	public DomainOwnerInfo(long refDomainID, Timestamp createdDate,
			String info) {
		super();
		this.refDomainID = refDomainID;
		this.createdDate = createdDate;
		this.info = info;
	}
	public long getOwnerinfoID() {
		return ownerinfoID;
	}
	public void setOwnerinfoID(long ownerinfoID) {
		this.ownerinfoID = ownerinfoID;
	}
	public long getRefDomainID() {
		return refDomainID;
	}
	public void setRefDomainID(long refDomainID) {
		this.refDomainID = refDomainID;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDaet(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
