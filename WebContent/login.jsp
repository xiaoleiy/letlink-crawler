<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="author" content="Jerry Joe">
	<meta name="robots" content="none">
	<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.4.0/build/reset-fonts-grids/reset-fonts-grids.css">
	<link type="text/css" rel="stylesheet" href="styles/main.css">
	<script type="text/javascript" src="styles/jquery-1.6.2.js"></script>
	<script type="text/javascript" src="styles/main.js"></script>
	<title>Login</title>
	
	<%
		String from_url = request.getParameter("from_url");
		if(from_url == null || "".equals(from_url))
			from_url = "/Letlink-crawler/index.jsp";
	%>
</head>
<body bgcolor="#CCCCCC">
<div class="wrapper">
	<form id="login_form" name="login_form" action="login" method="POST" onsubmit="return validate_login()">
		<div class="login_input">
			<label class="basic_label">Username:&nbsp;</label>
			<input id="login_username" class="basic_input" name="username" type="text" maxlength="20" tabindex="1" />
			<label id="username_tip" class="error_tip">&nbsp;Please type your username</label>
		</div>
		<div class="login_input">
			<label class="basic_label">Password:&nbsp;</label>
			<input id="login_password" class="basic_input" name="password" type="password" maxlength="20" tabindex="2" />
			<label id="password_tip" class="error_tip">&nbsp;Please type your password</label>
		</div>
		<input name="from_url" type="hidden" value="<%=from_url %>" />
		<div class="login_submit">
			<label>&nbsp;</label>
			<input class="btn_submit" name="submit" type="submit" value="login" tabindex="3" />
		</div>
	</form>
</div>
</body>
</html>