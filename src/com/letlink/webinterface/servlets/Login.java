package com.letlink.webinterface.servlets;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class Login
 */
public class Login extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware{
	private String username;
	private String password;
	private String from_url;
	private String message;
	private boolean login;
	private Map session;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private Logger logger = Logger.getLogger("Login");
	
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
		if("admin".equals(username) && "admin".equals(password)){
			setLogin(true);
			session.put("login_user", username);
			session.put("logined", true);
			setMessage("You logged into the system!");
			response.sendRedirect(from_url);
			return ActionSupport.NONE;
		}else{
			return "LOGIN_ERR";
		}
	}
	
	public String logout() throws IOException{
		if(session.get("logined") == null || (Boolean)session.get("logined") == false 
				|| !notEmpty((String)session.get("login_user")) ){
			logger.warning("Not logged in!");
		}else
			session.clear();
		response.sendRedirect(from_url);
		return ActionSupport.NONE;
	}
	
	public boolean notEmpty(String str){
		return str == null ? false : (str.length() == 0 ? false : true);
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFrom_url() {
		return from_url;
	}

	public void setFrom_url(String from_url) {
		this.from_url = from_url;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
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