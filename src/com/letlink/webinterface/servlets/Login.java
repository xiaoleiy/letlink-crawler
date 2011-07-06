package com.letlink.webinterface.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO Validate the login username/password by calling project phase-1 service.
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("[INFO] username: " + username + ", password: " + password);
		if(nonEmpty(username) && "admin".equals(username) && nonEmpty(password) && "admin".equals(password)){
			Cookie usernameCookie = new Cookie("username", username);
			Cookie passwordCookie = new Cookie("password", password);
			usernameCookie.setMaxAge(7*24*60*60);
			passwordCookie.setMaxAge(7*24*60*60);
			response.addCookie(usernameCookie);
			response.addCookie(passwordCookie);
			response.setContentType("text/html; charset=UTF-8");
			response.sendRedirect(request.getContextPath() + "/index.jsp");
			return;
		}else{
			response.setContentType("text/html; charset=UTF-8");
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	boolean nonEmpty(String str){
		if(str == null || "".equals(str))
			return false;
		else return true;
	}
}
