<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"	isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<html>
<body>
	<h2>
		
		
		-------------------------------------------
		<form	action="${pageContext.request.contextPath }/my/m2.do"	method="post">
			<font	color="yellow">对象传参</font><br>
			userName:<input	name="userName"	type="text"	placeholder="请输入参数..."/><br>
			passWord:<input	name="password"	type="text"	placeholder="请输入参数..."/><br>
			<input	type="submit"	value="post访问"/>
		</form>
		
		-------------------------------------------
		<form	action="${pageContext.request.contextPath }/my/m3.do"	method="post">
			<font	color="yellow">对象传参</font><br>
			userName:<input	name="userName"	type="text"	placeholder="请输入参数..."/><br>
			passWord:<input	name="password"	type="text"	placeholder="请输入参数..."/><br>
			<input	type="submit"	value="post访问"/>
		</form>
	
		
	
		
	</h2>
</body>
</html>
