<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form	action="${pageContext.request.contextPath }/user/login.do"	method="post">
		用户名:<input	name="userName"	type="text"/><br>
		密码:<input	name="password"	type="text"/><br>
		<input	type="submit"	value="登录">
	</form>
</body>
</html>