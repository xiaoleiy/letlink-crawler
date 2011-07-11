package com.letlink.common.datamodel;

import java.io.Serializable;

public class Imageinfo implements Serializable {

	private static final long serialVersionUID = 2554670667148601075L;
	private int imageinfoID;
	private String filename;
	private String fileFormat;
	private String imageURL;
	private String pageURL;
	private int pixelsWidth;
	private int pixelsHeight;
	private int sizeBytes;
	
	public Imageinfo(){}

	public Imageinfo(String filename, String fileFormat, String imageURL,
			String pageURL, int pixelsWidth, int pixelsHeight, int sizeBytes) {
		super();
		this.filename = filename;
		this.fileFormat = fileFormat;
		this.imageURL = imageURL;
		this.pageURL = pageURL;
		this.pixelsWidth = pixelsWidth;
		this.pixelsHeight = pixelsHeight;
		this.sizeBytes = sizeBytes;
	}

	public int getImageinfoID() {
		return imageinfoID;
	}

	public void setImageinfoID(int imageinfoID) {
		this.imageinfoID = imageinfoID;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFileFormat() {
		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getPageURL() {
		return pageURL;
	}

	public void setPageURL(String pageURL) {
		this.pageURL = pageURL;
	}

	public int getPixelsWidth() {
		return pixelsWidth;
	}

	public void setPixelsWidth(int pixelsWidth) {
		this.pixelsWidth = pixelsWidth;
	}

	public int getPixelsHeight() {
		return pixelsHeight;
	}

	public void setPixelsHeight(int pixelsHeight) {
		this.pixelsHeight = pixelsHeight;
	}

	public int getSizeBytes() {
		return sizeBytes;
	}

	public void setSizeBytes(int sizeBytes) {
		this.sizeBytes = sizeBytes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}