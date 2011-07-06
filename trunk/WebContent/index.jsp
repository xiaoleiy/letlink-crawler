<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Letlink-Crawler</title>
<link type="text/css" rel="stylesheet" href="styles/main.css"/>
<script type="text/javascript" src="styles/jquery-1.6.2.js"></script>
<script type="text/javascript" src="styles/main.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<div class="header">
		<h1>Letlink-Crawler Management</h1>
	</div>
	<div class="menu">
		<ul>
			<li>Crawler Definition</li>
			<li>Task/Job Management</li>
			<li>Image Viewer</li>
			<li>System Monitor</li>
			<li>Server Management</li>
		</ul>
	</div>
	<div class="main">
		<label>Logined:&nbsp;</label><p><s:property value="message" /></p>
	</div>
	<div class="footer">Powered by <i>Heritrix</i>, <i>NetArchive</i>!</div>
</body>
</html>