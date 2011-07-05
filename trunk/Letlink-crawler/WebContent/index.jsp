<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Letlink-Crawler</title>
<script type="text/javascript" src="styles/jquery-1.6.2.js"></script>
<script type="text/javascript" src="styles/main.js"></script>
<script type="text/javascript">
	(function(){
		var username = getCookie('username');
		var password = getCookie('password');
		if(username == null || password == null){
			window.location.href='login.jsp';
		}else{
			$.ajax({
				url: 'login.do',
				type: 'POST',
				dataType: 'json',
				data: 'username=' + username + "&password" + password,
				success: function(response, textStatus){
					if(response.result !== 'ok')
						location.href='login.jsp';
				},
				error: function(){
					location.href='error.jsp';
				}
			});
		}
	})();
</script>
</head>
<body>
	<div class="header">
		<p class="h1">Letlink-Crawler Management</p>
	</div>
	<div class="menu"></div>
	<div class="content"></div>
	<div class="footer">Powered by <i>Heritrix</i>, <i>NetArchive</i>!</div>
</body>
</html>