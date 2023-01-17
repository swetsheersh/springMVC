<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
	<h1>Welocome to Help Section...We are happily excited to solve your problem.Kindly fill out the form ,we will reach you back with appropriate Solution</h1>
	<h1>Thanks...See you soon...</h1>
	<%
		/* String name=(String)request.getAttribute("name");
		Integer roll=(Integer)request.getAttribute("rollno");
		LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
	%>
	
	<h1>Name : <%-- <%=name %> --%>
	${name }
	</h1>
	<h1>Roll Number : <%-- <%=roll %> --%>
	${rollno }
	</h1>
	<h1>
	Current Time is: <%-- <%String curtime=time.toString(); %><%=curtime %> --%>
	${time.toString() }
	</h1>
	<hr>
	<h2>List is:</h2>
	<c:forEach var="item" items="${marks}">
		<h2>${item }</h2>
	</c:forEach>
</body>
</html>