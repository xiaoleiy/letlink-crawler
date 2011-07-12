package com.letlink.common.datamodel;

import java.io.Serializable;

public class Category implements Serializable{

	private static final long serialVersionUID = -3263975403117354106L;
	private int categoryID;
	private String name;
	private String comment;
	
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
