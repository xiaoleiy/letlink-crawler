function getCookie(cname) {
	var start_pos = document.cookie.indexOf(cname + '=', 0);
	if (start_pos != -1) {
		var end_pos = document.cookie.indexOf(';', start_pos);
		if (end_pos == -1)
			end_pos = document.cookie.length;
		var content = document.cookie.substring(start_pos + cname.length + 1,
				end_pos);
		return content;
	}
	return null;
}

function setCookie(cname, content) {
	var argv = setCookie.arguments;
	var argc = setCookie.arguments.length;
	var expireDays = argc > 2 ? argv[2] : 7;
	var expireDate = new Date();
	// getDate() returns dom
	expireDate.setDate(expireDate.getDate() + expireDays);
	document.cookie = cname + '=' + escape(content) + ';expires='
			+ expireDate.toUTCString();
}

function validate(){
	//username.get(0).value == username.attr('value') == username.val()
	var result = true;
	var username = $('input[name="username"]');
	var password = $('input[name="password"]');
	if(nonEmpty(username.val()) && nonEmpty(password.val()))
		return true;
	if(!nonEmpty(username.val())){
		$('label#username_tip').fadeIn('slow');
		username.change(function(){$('label#username_tip').hide();});
		username.focus();
		result = false;
	}
	if(!nonEmpty(password.val())){
		$('label#password_tip').fadeIn('slow');
		password.change(function(){$('label#password_tip').hide();});
		if(nonEmpty(username.val())) password.focus();
		result = false;
	}
	return result;
}

function nonEmpty(text){
	if(text == null || text.length == 0)
		return false;
	else return true;
}