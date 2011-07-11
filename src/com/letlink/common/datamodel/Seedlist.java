package com.letlink.common.datamodel;

import java.io.Serializable;

public class Seedlist implements Serializable {
	
	private static final long serialVersionUID = 7266884250842239280L;
	private long seedlistID;
	private long refDomainID;
	private String name;
	private String seeds;
	private String comment;
	
	public Seedlist(){}

	public Seedlist(String name, long refDomainID, String seeds, String comment) {
		super();
		this.name = name;
		this.refDomainID = refDomainID;
		this.seeds = seeds;
		this.comment = comment;
	}

	public long getSeedlistID() {
		return seedlistID;
	}

	public void setSeedlistID(long seedlistID) {
		this.seedlistID = seedlistID;
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

	public String getSeeds() {
		return seeds;
	}

	public void setSeeds(String seeds) {
		this.seeds = seeds;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
