package com.letlink.webinterface.servlets;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionSupport;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.servlet.RequestParameters;

import com.letlink.webinterface.datamapper.CategoryMapper;
import com.letlink.webinterface.datamapper.DomainMapper;
import com.letlink.common.datamodel.Domain;

@Singleton	/* Making sure singleton of servlet is important! */
public class DomainServlet extends ActionSupport {

	private static final long serialVersionUID = 5707541090098932555L;
	
	@Inject
	private HttpServletRequest request;
	@Inject
	private HttpServletResponse response;
	@Inject
	private DomainMapper domainMapper;
	@Inject
	private Logger logger;
	@Inject @RequestParameters private Map<String, String[]> params;
	
	public DomainServlet(){}
	
	@Override
	public String execute(){
		return ActionSupport.NONE;
	}
	
	public String addDomain() throws IOException{
		logger.info("params from Request: " );
		logger.info("request obj is: " + request);
		logger.info("domainName: "  + request.getParameter("domainName"));
		logger.info("domainAlias: " + request.getParameter("domainAlias"));
		logger.info("End of Request's params");
		if(params != null)
			logger.info("parameters size: " + params.size());
		Iterator<String> keys = params.keySet().iterator();
		for(int i = 0; keys.hasNext(); i++){
			String key = keys.next();
			logger.info("param #" + i + ":\t" + key + " -> " + params.get(key)[0]);
		}
		Domain domain = new Domain(getParam("domainName"), getParam("domainAlias"), false, getParam("domainComment"));
		int rows = domainMapper.insert(domain);
		logger.info("Inserted " + rows + " row of domains with domain ID: " + domain.getDomainID());
		response.sendRedirect(request.getContextPath() + "/crawler_def/domain.jsp");
		return ActionSupport.NONE;
	}
	
	public String getParam(String key){
		if(params == null){
			logger.severe("The params is NULL!");
			return null;
		}
		if(key == null || "".equals(key))
			return null;
		return params.get(key)[0];
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}