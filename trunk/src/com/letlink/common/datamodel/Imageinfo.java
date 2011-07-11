package com.letlink.common.datamodel;

import java.io.Serializable;

public class Imageinfo implements Serializable {

	private static final long serialVersionUID = 2554670667148601075L;
	private long imageinfoID;
	private String filename;
	private String fileFormat;
	private String imageURL;
	private String pageURL;
	private long pixelsWidth;
	private long pixelsHeight;
	private long sizeBytes;
	
	public Imageinfo(){}

	public Imageinfo(String filename, String fileFormat, String imageURL,
			String pageURL, int pixelsWidth, int pixelsHeight, long sizeBytes) {
		super();
		this.filename = filename;
		this.fileFormat = fileFormat;
		this.imageURL = imageURL;
		this.pageURL = pageURL;
		this.pixelsWidth = pixelsWidth;
		this.pixelsHeight = pixelsHeight;
		this.sizeBytes = sizeBytes;
	}

	public long getImageinfoID() {
		return imageinfoID;
	}

	public void setImageinfoID(long imageinfoID) {
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

	public long getPixelsWidth() {
		return pixelsWidth;
	}

	public void setPixelsWidth(long pixelsWidth) {
		this.pixelsWidth = pixelsWidth;
	}

	public long getPixelsHeight() {
		return pixelsHeight;
	}

	public void setPixelsHeight(long pixelsHeight) {
		this.pixelsHeight = pixelsHeight;
	}

	public long getSizeBytes() {
		return sizeBytes;
	}

	public void setSizeBytes(long sizeBytes) {
		this.sizeBytes = sizeBytes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}