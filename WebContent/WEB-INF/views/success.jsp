<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	用户名:
	<s:property value="username" />
	<br> 登录密码:
	<s:property value="password" />
	<br> 重复密码:
	<s:property value="passwordRepeat" />
	<br> 电子邮箱:
	<s:property value="email" />
	<br> 性&emsp;&emsp;别:
	<s:property value="gender" />
	<br> 职&emsp;&emsp;业:
	<s:property value="profession" />
	<br> 爱&emsp;&emsp;好:
	<s:iterator value="hobby" status="st">
		<s:property />
	</s:iterator>
</body>
</html>