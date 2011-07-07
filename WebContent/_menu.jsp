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
</head>
<body>
	<div class="header">
		<h1>Letlink-Crawler Management</h1>
	</div>
	<table style="margin: 0 14px; text-align: right; position: relative; left: 67%;">
		<tr><td>
			<s:if test="#session.login_user != null">
				<label>Welcome&nbsp;</label><s:property value="#session['login_user']"/><label>!</label>
				&nbsp;<label style="height: 0.8em;">|</label>&nbsp;<a href="<%=basedir %>/logout?from_url=<%=page_uri%>">Logout</a>
			</s:if>
			<s:else>
				<a href="<%=basedir %>/login.jsp?from_url=<%=page_uri %>">Login</a>
			</s:else>
		</td></tr>
	</table>
	<table class="menu">
		<tr>
			<td id="crawler_def" class="section">
				<h3><a href="javascript:show_submenu('crawler_def')">Crawler Definition</a></h3>
				<ul class="submenu">
					<li><a href="<%=basedir %>/crawler_def/domain.jsp">Domain</a></li>
					<li><a href="<%=basedir %>/crawler_def/seedlist.jsp">Seedlist</a></li>
					<li><a href="<%=basedir %>/crawler_def/cron.jsp">Cron</a></li>
					<li><a href="<%=basedir %>/crawler_def/url_exclusion.jsp">URL Exclusion</a></li>
					<li><a href="<%=basedir %>/crawler_def/crawler.jsp">Crawler</a></li>
				</ul>
			</td>
			<td id="task_job_mgmt" class="section">
				<h3><a href="javascript:show_submenu('task_job_mgmt')">Task/Job Management</a></h3>
				<ul class="submenu">
					<li><a href="<%=basedir %>/crawler_run/crawler_list.jsp">Crawler List</a></li>
					<li><a href="<%=basedir %>/crawler_run/job_list.jsp">Job List</a></li>
					<li><a href="<%=basedir %>/crawler_run/run_stats.jsp">Running Stats</a></li>
				</ul>
			</td>
			<td id="img_viewer" class="section">
				<h3><a href="<%=basedir %>/crawler_run/img_viewer.jsp">Image Viewer</a></h3>
			</td>
			<td id="sys_monitor" class="section">
				<h3><a href="javascript:show_submenu('sys_monitor')">Crawlers Monitor</a></h3>
				<ul class="submenu">
					<li><a href="<%=basedir %>/monitor/crawling_status.jsp">Crawling Status</a></li>
					<li><a href="<%=basedir %>/monitor/logs.jsp">Running Logs</a></li>
				</ul>
			</td>
			<td id="server_monitor" class="section">
				<h3><a href="javascript:show_submenu('server_monitor')">Server Monitor</a></h3>
				<ul class="submenu">
					<li><a href="<%=basedir %>/monitor/crawlers.jsp">Crawler Servers</a></li>
					<li><a href="<%=basedir %>/monitor/web_server.jsp">Web Servers</a></li>
					<li><a href="<%=basedir %>/monitor/ftp_server.jsp">FTP Servers</a></li>
					<li><a href="<%=basedir %>/monitor/db_servers.jsp">DB Servers</a></li>
				</ul>
			</td>
		</tr>
	</table>
	<script type="text/javascript">
		$('table.menu td.section h3 a').each(function(index){
		var menu_div = $(this).parent().parent();
		var submenu_list = menu_div.children('.submenu');
		menu_div.hover(function(){show_submenu(submenu_list);},function(){hide_submenu(submenu_list);});
	});
	</script>
	<s:if test="#session.login_user == null">
		<script type="text/javascript">
					$('.menu .section').each(function(){
						$(this).unbind();
						$(this).children('h3').children('a').attr('href','#');
					});
		</script>
	</s:if>
</body>
</html>