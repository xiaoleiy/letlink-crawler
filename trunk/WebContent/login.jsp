<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login</title>
	<script type="text/javascript" src="styles/jquery-1.6.2.js"></script>
	<script type="text/javascript" src="styles/main.js"></script>
	<script type="text/javascript">
		function login(){
			var username = $("input[name='username']");
			var password = $("input[name='password']");
			//username.get(0).value == username.attr("value"); -- jQuery selector
			if(nonEmpty(username.get(0).value) && nonEmpty(password.get(0).value))
				$("form").submit();
			else{
				$("p").fadeIn("slow");
				username.focus();
				return false;
			}
		}
	</script>
</head>
<body>
	<p style="display:none">Note: Username and password cant be empty!</p><br/>
	<form action="login.do" method="POST" onsubmit="return login()">
		<table>
			<tr><td>Username:</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr><td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr><td><input type="submit" /></td></tr>
		</table>
	</form>
</body>
</html>