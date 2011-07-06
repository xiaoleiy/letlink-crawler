<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login</title>
	<link type="text/css" rel="stylesheet" href="styles/main.css" />
	<script type="text/javascript" src="styles/jquery-1.6.2.js"></script>
	<script type="text/javascript" src="styles/main.js"></script>
	<script type="text/javascript">
		function validate(){
			//username.get(0).value == username.attr('value') == username.val()
			var result = true;
			var username = $('input[name="username"]');
			var password = $('input[name="password"]');
			if(nonEmpty(username.val()) && nonEmpty(password.val()))
				return true;
			if(!nonEmpty(username.val())){
				$('label#username_tip').fadeIn('slow');
				username.change(function(){$('label#username_tip').hide()});
				username.focus();
				result = false;
			}
			if(!nonEmpty(password.val())){
				$('label#password_tip').fadeIn('slow');
				password.change(function(){$('label#password_tip').hide()});
				if(nonEmpty(username.val())) password.focus();
				result = false;
			}
			return result;
		}
		
	</script>
</head>
<body>
	<form id="login_form" name="login_form" action="login" method="POST" onsubmit="return validate();">
		<div class="login_input">
			<label class="basic_label">Username:&nbsp;</label>
			<input id="login_username" class="basic_input" name="username" type="text" maxlength="20" tabindex="1" />
			<label id="username_tip" class="input_tip">&nbsp;Please type your username</label>
		</div>
		<div class="login_input">
			<label class="basic_label">Password:&nbsp;</label>
			<input id="login_password" class="basic_input" name="password" type="password" maxlength="20" tabindex="2" />
			<label id="password_tip" class="input_tip">&nbsp;Please type your password</label>
		</div>
		<div class="login_submit">
			<label>&nbsp;</label>
			<input class="btn_submit" name="submit" type="submit" tabindex="3" />
		</div>
	</form>
</body>
</html>