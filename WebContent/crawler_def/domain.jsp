<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="author" content="Jerry Joe">
<meta name="robots" content="none">
<title>Domains Definition</title>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.4.0/build/reset-fonts-grids/reset-fonts-grids.css">
<link type="text/css" rel="stylesheet" href="../styles/main.css"/>
<script type="text/javascript" src="../styles/jquery-1.6.2.js"></script>
<script type="text/javascript" src="../styles/main.js"></script>
<script type="text/javascript">
	function category_load(){
		$.ajax({
			type: 'GET',
			url: 'loadCategory',
			dataType: 'json',
			success: function(data){
				var cnt, cateListdiv = $('.main .leftnav #category_list');
				for(cnt = 0; cnt < data.length; cnt++){
					var itemHTML = '<li><a href="javascript:domain_load(' + data[cnt].categoryID
								+ ')" title="' + data[cnt].comment + '">' + data[cnt].name
								+ '</a></li>';
					cateListdiv.append(itemHTML);
				}
				cateListdiv.after('<br/><p style="padding-bottom:0; margin-bottom:0; color: gray;">Total: ' + cnt + ' categories</p>');
			}
		});
	}
	
	function domain_load(){
		var param;
		if(arguments.length != 0)
			 param = '?category_id=' + arguments[0];
		else param = '';
		$.ajax({
			type: 'GET',
			url: 'loadDomain' + param,
			dataType: 'json',
			success: function(data){
				var cnt, tbody = $('.datalist #domain_tbl tbody');
				tbody.empty();
				for(cnt = 0; cnt < data.length; cnt++){
					var rowHTML = '<tr><td>' + data[cnt].alias + '</td>'
									+ '<td>' + data[cnt].name  + '</td>'
									+ '<td>' + data[cnt].comment  + '</td>'
									+ '</tr>';
					tbody.append(rowHTML);
				}
				$('.datalist #domain_tbl caption').text('Total: ' + cnt + ' domains');
			}
		});
	}
	
	function data_load(){
		category_load();
		domain_load();
	}
</script>
</head>
<body onload="<%
		if(session.getAttribute("logined") != null && ((Boolean)session.getAttribute("logined")).booleanValue())
			out.print("javascript:data_load()");
		else out.print("javascript:login_warn()"); 
	%> ">
	<div class="wrapper">
		<jsp:include page="../_menu.jsp"></jsp:include>
		<div class="main">
			<div class="leftnav">
				<ul id="category_list"></ul>
			</div>
			<div class="datalist">
				<table id="domain_tbl">
					<thead>
						<tr>
							<th>Domain Alias</th>
							<th>Domain Name</th>
							<th>Comment</th>
						</tr>
					</thead>
					<tbody></tbody>
					<caption></caption>
				</table>
			</div>
			<!-- <form id="add_domain_form" action="addDomain" method="POST">
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
			</form> -->
		</div>
	</div>
	<div id="copyright">
		<ul>
			<li>&nbsp; &copy; 2011, www.letlink.com, All rights Reserved</li>
			<li>&nbsp; Compatible with CSS2, HTML4.0</li>
			<li>&nbsp; Powered by <a href="http://crawler.archive.org" ><i>Heritrix Project</i></a>
			, and <a href="http://netarchive.dk/suite" ><i>Netarchive Project</i></a>.
			</li>
		</ul>
	</div>
	<div class="clear"> </div>
</body>
</html>