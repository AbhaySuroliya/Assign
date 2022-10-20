<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
<h1>Welcome to Product Manager</h1>
<br>
 <a href="/addPro">Add</a><br>
 <br>
<a href="/show">Show All</a><br>
<br>
 <a href="/deletePro">Delete</a><br>
 <br>
 <form action="/part">
Please enter product Id :
 <input type="text" name="id">
 <input type="submit" value="submit">
 </form>
</body>
</html>