package com.letlink.common.datamodel;

import java.io.Serializable;

public class Cron implements Serializable{

	private static final long serialVersionUID = 3403046892206482883L;
	private int cronID;
	private String name;
	private String minute;
	private String hour;
	private String dom;
	private String month;
	private String dow;
	private String comment;
	private int repeats;
	
	public Cron(){}
	
	public Cron(String name, String minute, String hour, String dom,
			String month, String dow, String comment, int repeats) {
		super();
		this.name = name;
		this.minute = minute;
		this.hour = hour;
		this.dom = dom;
		this.month = month;
		this.dow = dow;
		this.comment = comment;
		this.repeats = repeats;
	}

	public int getCronID() {
		return cronID;
	}

	public void setCronID(int cronID) {
		this.cronID = cronID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getDom() {
		return dom;
	}

	public void setDom(String dom) {
		this.dom = dom;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDow() {
		return dow;
	}

	public void setDow(String dow) {
		this.dow = dow;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRepeats() {
		return repeats;
	}

	public void setRepeats(int repeats) {
		this.repeats = repeats;
	}
	
}
