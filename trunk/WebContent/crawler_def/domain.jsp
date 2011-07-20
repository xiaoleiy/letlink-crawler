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
<link type="text/css" rel="stylesheet" href="../styles/main.css"/>
<script type="text/javascript" src="../styles/jquery-1.6.2.js"></script>
<script type="text/javascript" src="../styles/main.js"></script>
<title>Domains Definition</title>
</head>
<body onload="<% if(session.getAttribute("logined") != null && ((Boolean)session.getAttribute("logined")).booleanValue())
		out.print("javascript:domains_load()");
	else out.print("javascript:login_warn()"); %> ">
	<div class="wrapper">
		<jsp:include page="../_menu.jsp"></jsp:include>
		<div class="main">
			<form id="add_domain_form" action="addDomain" method="POST">
				<div>
					<label class="basic_label">Domain Name:&nbsp;</label>
					<input id="domain_name" type="text" class="basic_input" name="domainName" maxlength="150" tabindex="1" />
					<label id="domain_name_tip" class="basic_tip">Please type domain name, e.g., letlink.com</label>
				</div>
				<div>
					<label class="basic_label">Domain Alias:&nbsp;</label>
					<input id="domain_alias" type="text" class="basic_input" name="domainAlias" maxlength="150" tabindex="2" />
					<label id="domain_alias_tip" class="basic_tip">Please type domain alias, e.g., Letlink</label>
				</div>
				<div>
					<label class="basic_label">Comment:&nbsp;</label>
					<textarea id="domain_comment" name="domainComment" rows="5" cols="50" tabindex="3" ></textarea>
				</div>
				<div>
					<input type="submit" value="Add" />
				</div>
			</form>
		</div>
	</div>
	<div id="copyright">
		<span>&nbsp; &copy; 2011, www.letlink.com, All rights Reserved</span>
		<br /><span>&nbsp; Compatible with CSS2, HTML4.0</span>
		<br /><span>&nbsp; Powered by <a href="http://crawler.archive.org" ><i>Heritrix Project</i></a>
			, and <a href="http://netarchive.dk/suite" ><i>Netarchive Project</i></a>.
		</span>
	</div>
</body>
</html>