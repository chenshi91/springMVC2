<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"	isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<html>
<body>
<h2>Hello World!</h2>
<h4>用户名:${requestScope.user.userName }</h4>
<h4>密码:${user.password }</h4>
</body>
</html>
