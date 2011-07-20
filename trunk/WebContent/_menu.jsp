<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	String basedir = request.getContextPath();
	String page_uri = request.getRequestURI(); //Diff from getRequestURL(), which returns full request URL.
%>
	<script type="text/javascript">
	
		var timeout = 500;
		var closetimer = 0;
		var ddmenuitem = 0;

		function jsddm_open() {
			jsddm_canceltimer();
			jsddm_close();
			ddmenuitem = $(this).find('ul').eq(0).css('visibility', 'visible');
		}

		function jsddm_close() {
			if (ddmenuitem)
				ddmenuitem.css('visibility', 'hidden');
		}

		function jsddm_timer() {
			closetimer = window.setTimeout(jsddm_close, timeout);
		}

		function jsddm_canceltimer() {
			if (closetimer) {
				window.clearTimeout(closetimer);
				closetimer = null;
			}
		}

		/* $(document).ready(function(){
			$('#jsddm > li').bind('mouseover', jsddm_open);
			$('#jsddm > li').bind('mouseout', jsddm_timer);
		});*/
		document.onclick = jsddm_close; 
	</script>
</head>
<body>
	<div class="header">
		<h1><a href="<%=basedir %>/index.jsp">Letlink-Crawler Management</a></h1>
		<s:if test="#session.login_user != null">
			<p class="welcome_bar">Welcome&nbsp;  <s:property value="#session['login_user']"/>!&nbsp;|&nbsp;
				<a href="<%=basedir %>/logout?from_url=<%=page_uri%>">Logout</a>
			</p>
			<script type="text/javascript">
				$(document).ready(function(){
					$('#jsddm > li').bind('mouseover', jsddm_open);
					$('#jsddm > li').bind('mouseout', jsddm_timer);
				});
			</script>
		</s:if>
		<s:else>
			<p class="welcome_bar"><a href="<%=basedir %>/login.jsp?from_url=<%=page_uri %>">Login</a></p>
		</s:else>
	</div>
	<hr />
	<ul id="jsddm">
		<li><a href="#">Crawler Definition</a>
			<ul>
				<li><a href="<%=basedir %>/crawler_def/domain.jsp">Domain</a></li>
				<li><a href="<%=basedir %>/crawler_def/seedlist.jsp">Seedlist</a></li>
				<li><a href="<%=basedir %>/crawler_def/cron.jsp">Cron</a></li>
				<li><a href="<%=basedir %>/crawler_def/url_exclusion.jsp">URL Exclusion</a></li>
				<li><a href="<%=basedir %>/crawler_def/crawler.jsp">Crawler</a></li>
			</ul>
		</li>
		<li><a href="#">Task/Job Management</a>
			<ul>
				<li><a href="<%=basedir %>/crawler_run/crawler_list.jsp">Crawler List</a></li>
				<li><a href="<%=basedir %>/crawler_run/job_list.jsp">Job List</a></li>
				<li><a href="<%=basedir %>/crawler_run/run_stats.jsp">Running Stats</a></li>
			</ul>
		</li>
		<li><a href="#">Image Viewer</a></li>
		<li><a href="#">Crawlers Monitor</a>
			<ul>
				<li><a href="<%=basedir %>/monitor/crawling_status.jsp">Crawling Status</a></li>
				<li><a href="<%=basedir %>/monitor/logs.jsp">Running Logs</a></li>
			</ul>
		</li>
		<li><a href="#">Server Monitor</a>
			<ul>
				<li><a href="<%=basedir %>/monitor/crawlers.jsp">Crawler Servers</a></li>
				<li><a href="<%=basedir %>/monitor/web_server.jsp">Web Servers</a></li>
				<li><a href="<%=basedir %>/monitor/ftp_server.jsp">FTP Servers</a></li>
				<li><a href="<%=basedir %>/monitor/db_servers.jsp">DB Servers</a></li>
			</ul>
		</li>
	</ul>
	<div class="clear"></div>
	<hr />
</body>
</html>