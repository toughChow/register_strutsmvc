function validateMessage(){
	var usernameTemp = document.forms["myForm"]["username"].value.length;
	var usernameValue = document.forms["myForm"]["username"].value;
	var passwordoneValue = document.getElementById("passwordone").value;
	var passwordtwoValue = document.getElementById("passwordtwo").value;
	var passwordoneLength = passwordoneValue.length;
	var passwordtwoLength = passwordtwoValue.length;
	var usernameTrim = usernameValue.trim();
	if(usernameTrim == ''){
		alert("用户名不能为空或空串");
		document.forms["myForm"]["username"].value = "";
		document.forms["myForm"]["username"].focus();
	}else if(usernameTemp<6||usernameTemp>20){
		alert("用户名长度必须在6到20个字符之间");
		document.forms["myForm"]["username"].value = "";
		document.forms["myForm"]["username"].focus();
		return false;
	}else if(passwordoneLength<6||passwordoneLength>20 && passwordtwoLength<6||passwordtwoLength>20){
		alert("密码或重复密码长度必须在6到20个字符之间");
		document.getElementById("passwordone").value = "";
		document.getElementById("passwordtwo").value = "";
		document.getElementById("passwordone").focus();
		return false;
	}else if(passwordoneValue !== passwordtwoValue){
		alert("密码和重复密码必须相同");
		document.getElementById("passwordone").value = "";
		document.getElementById("passwordtwo").value = "";
		document.getElementById("passwordone").focus();
		return false;
	}
}
window.onload() = validateMessage();

