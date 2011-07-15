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
<body>
	<div style="margin: 5px 0"><jsp:include page="../_menu.jsp"></jsp:include></div>
	<div class="main">
		<table>
			<caption>Domains List</caption>
			<thead>
				<tr>
					<td>Name</td>
					<td>Alias</td>
					<td>Config</td>
					<td>Description</td>
					<td>URL Excluded</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>google.com</td>
					<td>GOOG</td>
					<td>null</td>
					<td>Google's all domains</td>
					<td>https://plus.google.com</td>
				</tr>
			</tbody>
			
		</table>
	</div>
	
	<div>
		<form id="add_domain_form" name="add_domain_form" action="addDomain" method="POST" onsubmit="return validate_adddomain()">
			<div>
				<label class="basic_label">Domain Name:&nbsp;</label>
				<input id="domain_name" type="text" class="basic_input" name="domain_name" maxlength="150" tabindex="1"/>
				<label id="domain_name_tip" class="basic_tip">Please type domain name, e.g., letlink.com</label>
			</div>
			<div>
				<label class="basic_label">Domain Alias:&nbsp;</label>
				<input id="domain_alias" type="text" class="basic_input" name="domain_alias" maxlength="150" tabindex="2" />
				<label id="domain_alias_tip" class="basic_tip">Please type domain alias, e.g., Letlink</label>
			</div>
			<div>
				<label class="basic_label">Comment:&nbsp;</label>
				<textarea id="domain_comment" name="domain_comment" rows="5" cols="50" tabindex="3"></textarea>
			</div>
			<div>
				<input id="add_domain_submit" name="add_domain_submit" type="submit" value="Add" />
			</div>
		</form>
	</div>
	
	<div class="footer">
		<span>&nbsp; &copy; 2011, www.letlink.com, All rights Reserved</span>
		<br /><span>&nbsp; Powered by <a href="http://crawler.archive.org" ><i>Heritrix Project</i></a>
			, and <a href="http://netarchive.dk/suite" ><i>Netarchive Project</i></a>.
		</span>
		<br /><span>&nbsp; Compatible with CSS2, HTML4.0</span>
	</div>
</body>
</html>