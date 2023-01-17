<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<h1>${header1 }</h1>
<p>${content }</p>
<hr>
<h1 style="color:green">${msg }</h1>
<body>
	<%-- <h1>Email id is : ${email }</h1>
	<h1>User Name is: ${userName }</h1>
	<h1>Password : ${password}</h1> --%>
	
	<h1>Email id is : ${user.email }</h1>
	<h1>User Name is: ${user.userName }</h1>
	<h1>Password : ${user.password}</h1>
	
</body>
</html>