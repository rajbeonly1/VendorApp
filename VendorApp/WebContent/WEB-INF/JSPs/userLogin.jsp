<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
<%@ include file="styles.css" %>
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login Page</title>
</head>
<body>
<marquee><h1>Welcome To User LogIn Page...</h1> </marquee>
<center>
<form action="loginUser" method="post">

<table>
	<tr>
		<td>UserName</td><td><input type="text" name="un" /></td>
	</tr>
	<tr>
		<td>Password</td><td><input type="password" name="pwd" /></td>
	<tr>
	<tr>
		<td></td><td><input type="submit" value="login" /></td>
	</tr>
</table>

<br/>

<b><h5>Not Having any Account click <a href="userReg">here</a> to register</h5></b>
</center>
</body>
</form>
</html>