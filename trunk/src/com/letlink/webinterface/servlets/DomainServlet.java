package com.letlink.webinterface.servlets;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import com.opensymphony.xwork2.ActionSupport;
import com.google.inject.Inject;
import com.google.inject.servlet.RequestParameters;

import static com.letlink.common.utils.Tools.*;

import com.letlink.webinterface.datamapper.CategoryMapper;
import com.letlink.webinterface.datamapper.DomainMapper;
import com.letlink.common.datamodel.Category;
import com.letlink.common.datamodel.Domain;

/* Making sure singleton of servlet is important! */
public class DomainServlet extends ActionSupport {

	private static final long serialVersionUID = 5707541090098932555L;
	
	@Inject
	private HttpServletRequest request;
	@Inject
	private HttpServletResponse response;
	@Inject
	private CategoryMapper categoryMapper;
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
		Domain domain = new Domain(getParam(params, "domainName"), getParam(params, "domainAlias"), false, getParam(params, "domainComment"));
		int rows = domainMapper.insert(domain);
		logger.info("Inserted " + rows + " row of domains with domain ID: " + domain.getDomainID());
		List<Category> categoryList = categoryMapper.selectAll();
		for(int i = 0; i < categoryList.size(); i++)
			logger.info("id: " + categoryList.get(i).getCategoryID() + ", name: " + categoryList.get(i).getName());
		response.sendRedirect(request.getContextPath() + "/crawler_def/domain.jsp");
		return ActionSupport.NONE;
	}
	
	public String getCategories(){
		List<Category> categoryList = categoryMapper.selectAll();
		JSONArray jsonCategoryList = JSONArray.fromObject(categoryList);
		response.setContentType("application/json;charset=UTF-8");
		try {
			response.getWriter().write(jsonCategoryList.toString());
		} catch (IOException e) {
			logger.severe("Failed to write JSON formated category list to client. Exception: "  + e.getMessage());
			e.printStackTrace();
		}
		return ActionSupport.NONE;
	}
	
	public String getDomains(){
		List<Domain> domainList = null;
		String categoryID = getParam(params, "category_id");
		if(categoryID == null)
			domainList = domainMapper.selectAll();
		else domainList = domainMapper.selectAllByCategory(Integer.parseInt(categoryID));
		JSONArray jsonDomainList = JSONArray.fromObject(domainList);
		response.setContentType("application/json;charset=UTF-8");
		try{
			response.getWriter().write(jsonDomainList.toString());
		} catch (IOException e) {
			logger.severe("Failed to write JSON formated category list to client. Exception: "  + e.getMessage());
			e.printStackTrace();
		}
		return ActionSupport.NONE;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}