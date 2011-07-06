package com.letlink.webinterface.servlets;

import java.io.IOException;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class Login
 */
public class Login extends ActionSupport{
	private String username;
	private String password;
	private boolean login;
	
	public Login(){}
	
	@Override
	public String execute(){
		if("admin".equals(username) && "admin".equals(password)){
			setLogin(true);
			return "SUCCESS";
		}else{
			return "ERROR";
		}
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

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}
	
}
