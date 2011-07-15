package com.letlink.webinterface.servlets;

import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.google.inject.Inject;

import com.letlink.webinterface.datamapper.CategoryMapper;
import com.letlink.webinterface.datamapper.DomainMapper;
import com.letlink.common.datamodel.Domain;

public class DomainServlet extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware{

	private static final long serialVersionUID = 5707541090098932555L;
	
	private Map session;
	private HttpServletRequest request;
	private HttpServletResponse response;
	@Inject
	private CategoryMapper categoryMapper;
	@Inject
	private DomainMapper domainMapper;
	@Inject
	private Logger logger;
	
	private int categoryID;
	private String categoryName;
	private String categoryComment;
	private long domainID;
	private String domainName;
	private String domainAlias;
	private String domainComment;
	private boolean isCrawling;
	
	
	public DomainServlet(){}
	
	@Override
	public String execute(){
		logger.info("starting the servlet...");
		Domain domain = new Domain(domainName, domainAlias, isCrawling, domainComment);
		int rows = domainMapper.insert(domain);
		logger.info("inserted " + rows + " rows of domains.\n The id of inserted domain: " + domain.getDomainID());
		return "SUCCESS";
	}
	
	public String addDomain(){
		logger.info("Starting the servlet...");
		Domain domain = new Domain(domainName, domainAlias, (isCrawling = false), domainComment);
		int rows = domainMapper.insert(domain);
		logger.info("Inserted " + rows + " rows of domains.\n The id of inserted domain: " + domain.getDomainID());
		return "SUCCESS";
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryComment() {
		return categoryComment;
	}

	public void setCategoryComment(String categoryComment) {
		this.categoryComment = categoryComment;
	}

	public long getDomainID() {
		return domainID;
	}

	public void setDomainID(long domainID) {
		this.domainID = domainID;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDomainAlias() {
		return domainAlias;
	}

	public void setDomainAlias(String domainAlias) {
		this.domainAlias = domainAlias;
	}

	public String getDomainComment() {
		return domainComment;
	}

	public void setDomainComment(String domainComment) {
		this.domainComment = domainComment;
	}

	public boolean isCrawling() {
		return isCrawling;
	}

	public void setCrawling(boolean isCrawling) {
		this.isCrawling = isCrawling;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
}