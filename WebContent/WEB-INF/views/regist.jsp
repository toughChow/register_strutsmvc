<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>轻实训-注册</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link href="images/monkey.ico" rel="shortcut icon">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/register.js"></script>
</head>
<body style="background-image: url(images/bg.jpg);">
	<div class="panel">
		<header>
			<img src="images/logo.png">
			<h2>用 户 注 册</h2>
		</header>
		<article>
			<s:form action="successUser" name="myForm">
				<div>
					用户名称: <input type="text" name="username" id="username"
						required="required" min="6" max="20">
						<b id="usernameMsg"></b>
				</div>
				<div>
					登录密码: <input type="password" name="password" id="passwordone"
						required="required">
				</div>
				<div>
					重复密码: <input type="password" name="passwordRepeat" id="passwordtwo"
						required="required">
				</div>
				<div>
					电子邮箱: <input type="email" name="email" id="email"
						required="required">
				</div>
				<div>
					性&emsp;&emsp;别: <input type="radio" name="gender" value="male"
						checked="checked" class="gender">男 <input type="radio"
						name="gender" value="female" class="gender">女
				</div>
				<div>
					职&emsp;&emsp;业: <select name="profession" class="profession">
						<option>老师</option>
						<option>学生</option>
					</select>
				</div>
				<div class="hobbydiv">
					爱&emsp;&emsp;好:
					<!-- 
                    <textarea name="hobby" class="hobby">
                    </textarea>
                 -->
					<select name="hobby" class="hobby" multiple="multiple">
						<option value="书法">书法</option>
						<option value="乐器">乐器</option>
						<option value="运动">运动</option>
						<option value="编程">编程</option>
					</select>
				</div>
				<hr>
				<input type="submit" name="" value="注册" class="button"
					onclick="return validateMessage()">
				<input type="reset" name="" value="重置" class="button">
			</s:form>
		</article>
		<footer> Copyright&copy;2017_jstough版权所有 </footer>
	</div>
	<script type="text/javascript">
		$(function() {
			$('#username').blur(function() {
				var username = $('#username').val();
				$.post("validateMsg", {
					"username" : username
				}, function(data) {
					if (data == "1") {
						$('#usernameMsg').html("该用户名可以使用").css({color:"green"});
					} else {
						$('#usernameMsg').html("该用户名已被占用").css({color:"red"});
					}
				}, "json");
			});
		});
	</script>
</body>
</html>