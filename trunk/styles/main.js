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
	expireDate.setDate(expireDate.getDate() + expireDays); // getDate() returns
															// dom
	document.cookie = cname + '=' + escape(content) + ';expires='
			+ expireDate.toUTCString();
}

function nonEmpty(text){
	if(text == null || text.length == 0)
		return false;
	else return true;
}