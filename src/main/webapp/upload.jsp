<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form	action="${pageContext.request.contextPath }/upload/uploadfile.do"	method="post"	enctype="multipart/form-data">
		<input	name="uploadFile"	type="file"	/><br>
		<input	type="submit"	value="上传">
	</form>
</body>
</html>