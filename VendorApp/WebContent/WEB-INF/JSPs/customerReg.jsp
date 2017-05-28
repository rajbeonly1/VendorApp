<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
<%@
	include file="styles.css" 
%>
</style>
</head>
<body>
<%@include file="master.jsp" %>
 <marquee><h1>Welcome To Customer Registration  Page!!</h1></marquee>
<center>
<form action="insertCus" method="post">
<table>
<!-- <tr><td>Customer Id :</td><td><input type="text" name="cusId" /></td></tr>-->
<tr><td>Customer Name :</td><td><input type="text" name="cusName" /></td></tr>
<tr><td>Customer E-mail :</td><td><input type="email" name="cusEmail" /></td></tr>
<tr><td>Customer Type :</td><td>
							  <select name="cusType"> 
                              <option value="Sellor">sellor</option>
                             <option value="Consumer">Consumer</option></select></td>  </tr>
<tr><td>Customer Adress :</td><td><input type="text" name="cusAddress" /></td></tr>
<tr><td>Customer Mobile No :</td><td><input type="number" name="cusMblNo" /></td></tr>
<tr><td></td><td><input type="submit" value="Register" />
</table>
</form>
<br/>
<b>${msg}</b>
</center>
</body>
</html>