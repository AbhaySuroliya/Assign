<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="java.util.*" %>
    <%@page import="com.abhayservlet.UserDetails" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table ,th,td{
border :1px solid black;
}
.con{
margin : auto;
width :70%;
}
</style>
<body>
<h3>Details</h3>
<table class="con">
  <tr>
	<th>Name</th>
	<th>Email</th>
	<th>Address</th>
	<th>age</th>
	<th>password</th>
	<th>Type</th>
  </tr>
  <c:forEach items="${list}" var="detail">
 <tr>
  <td>${detail.getName()}</td>
  <td>${detail.getEmail()}</td>
  <td>${detail.getAdd()}</td>
  <td>${detail.getAge()}</td>
  <td>${detail.getPass()}</td>
  <td>${detail.getType()}</td>
 </tr>
 </c:forEach>  
</table>
</body>
</html>