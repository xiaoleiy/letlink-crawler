package com.letlink.common.datamodel;

import java.io.Serializable;

public class Seedlist implements Serializable {
	
	private static final long serialVersionUID = 7266884250842239280L;
	private int seedlistID;
	private int refDomainID;
	private String name;
	private String seeds;
	private String comment;
	
	public Seedlist(){}

	public Seedlist(String name, int refDomainID, String seeds, String comment) {
		super();
		this.name = name;
		this.refDomainID = refDomainID;
		this.seeds = seeds;
		this.comment = comment;
	}

	public int getSeedlistID() {
		return seedlistID;
	}

	public void setSeedlistID(int seedlistID) {
		this.seedlistID = seedlistID;
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
