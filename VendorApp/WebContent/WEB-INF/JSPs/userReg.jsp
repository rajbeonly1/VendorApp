<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<marquee><h1>Welcome To User Registration Page</h1></marquee>
<center> 
<form action="insertUser" method="post">
	<table>
		<tr>
			<td>Name:</td><td><input type="text" name="userName"></td>
		</tr>
		<tr>
			<td>Email:</td><td><input type="text" name="userEmail"></td>
		</tr>
		<tr>
			<td>Adress: </td><td><input type="text" name="userAdres"></td>
		</tr>
		<tr>
			<td>Mobile No: </td><td><input type="text" name="mobile"></td>
		</tr>
		<tr>
			<td> </td><td><input type="submit" value="submit"></td>
		</tr>
	</table>
</form>
</center>
</body>
</html>