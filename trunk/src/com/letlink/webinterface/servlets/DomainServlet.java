package com.letlink.webinterface.servlets;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.google.inject.Inject;

import com.letlink.webinterface.datamapper.CategoryMapper;
import com.letlink.webinterface.datamapper.DomainMapper;
import com.letlink.common.datamodel.Domain;

public class DomainServlet extends ActionSupport{

	private static final long serialVersionUID = 5707541090098932555L;
	
	@Inject
	CategoryMapper categoryMapper;
	@Inject
	DomainMapper domainMapper;
	@Inject
	Domain domain;
	@Inject
	Logger logger;
	
	public DomainServlet(){}
	
	@Override
	public String execute(){
		logger.info("starting the servlet...");
		if(domain == null){
			logger.severe("domain is NULL");
			return "ERROR";
		}else{
			int rows = domainMapper.insert(domain);
			logger.info("inserted " + rows + " rows of domains.\n The id of inserted domain: " + domain.getDomainID());
			return "SUCCESS";
		}
	}
}
