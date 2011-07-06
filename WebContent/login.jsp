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
		var username = $('input[name="username"]');
		var password = $('input[name="password"]');
		var btn_submit = $('input[name="submit"]');
		
		function validate(){
			//username.get(0).value == username.attr('value') == username.val()
			var result = true;
			if(nonEmpty(username.val()) && nonEmpty(password.val()))
				return true;
			if(!nonEmpty(username.val())){
				username.after('<p id="username_tip" class="input_tip">Please type your username</p>').fadeIn('slow');
				username.change(function(){$('p#username_tip').hide()});
				username.focus();
				result = false;
			}
			if(!nonEmpty(password.val())){
				password.after('<p id="password_tip" class="input_tip">Please type your password</p>').fadeIn('slow');
				password.change(function(){$('p#password_tip').hide()});
				if(nonEmpty(username)) password.focus();
				result = false;
			}
			return result;
		}
		
		btn_submit.click(function(){
			if(validate())
				$('form').submit();
		});
	</script>
</head>
<body>
	<form id="login_form" name="login_form" action="login" method="POST">
		<div class="login_input">
			<label>Username:&nbsp;</label>
			<input id="login_username" class="basic_input" name="username" type="text" maxlength="20" tabindex="1" />
		</div>
		<div class="login_input">
			<label>Password:&nbsp;</label>
			<input id="login_password" class="basic_input" name="password" type="password" maxlength="20" tabindex="2" />
		</div>
		<div class="login_submit">
			<label>&nbsp;</label>
			<input class="btn_submit" name="submit" type="submit" tabindex="3" />
		</div>
	</form>
</body>
</html>