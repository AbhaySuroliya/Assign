<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ArrayList <String> list1=(ArrayList <String>)request.getAttribute("name");%>
<h2> Student data</h2>
<%for(String s: list1){
out.println(s);
} %>
</body>
</html>