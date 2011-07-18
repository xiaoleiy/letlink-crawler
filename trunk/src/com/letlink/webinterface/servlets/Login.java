package com.letlink.webinterface.servlets;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.inject.Inject;
import com.google.inject.servlet.RequestParameters;
import com.opensymphony.xwork2.ActionSupport;

import static com.letlink.common.utils.Tools.*;
/**
 * Servlet implementation class Login
 */
/* Making sure singleton of servlet is important! */
public class Login extends ActionSupport {
	
	private static final long serialVersionUID = -5389504761983730228L;

	/**
	 * Injection definition(in class InternalServletModule):
	 * 		@Provides HttpSession provideHttpSession(){
	 * 			return GuiceFilter.getRequest().getSession();
	 * 		}
	 * */
	@Inject
	private HttpSession session;
	
	/**
	 * Injection definition(in class InternalServletModule):
	 * 		@Provides @RequestScoped HttpServletResponse provideHttpServletResponse(){
	 * 			return GuiceFilter.getResponse();
	 * 
	 * 		}
	 * */
	@Inject
	private HttpServletResponse response;
	
	/**
	 * Injection definition(in class InternalServletModule):
	 * 		@Provides @RequestScoped @RequestParameters Map<String, String[]> provideRequestParameters(){
	 * 			return GuiceFilter.getRequest().getParametersMap();
	 * 		}
	 * */
	@Inject @RequestParameters	private Map<String, String[]> params;
	@Inject
	private Logger logger;
	
	/**
	 * TODO:
	 * 	1, How the IOC being implemented in Struts? using Google Guice?
	 *  2, HttpServletRequest request = ServletActionContext.getRequest()
	 *  3, HttpServletResponse response = ServletActionContext.getResponse();
	 *  4, HttpSession session = request.getSession();
	 * */
	public Login(){}

	@Override
	public String execute() throws IOException{
		if("admin".equals(getParam(params, "username")) && "admin".equals(getParam(params, "password"))){
			session.setAttribute("login_user", getParam(params, "username"));
			session.setAttribute("logined", true);
			response.sendRedirect(getParam(params, "from_url"));
			return ActionSupport.NONE;
		}else{
			return "LOGIN_ERR";
		}
	}
	
	public String logout() throws IOException{
		if(session.getAttribute("logined") == null || (Boolean)session.getAttribute("logined") == false 
				|| !notEmpty((String)session.getAttribute("login_user")) ){
			logger.warning("Not logged in!");
		}else{
			session.removeAttribute("login_user");
			session.removeAttribute("logined");
		}
		response.sendRedirect(getParam(params, "from_url"));
		return ActionSupport.NONE;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}