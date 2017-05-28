<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
<%@ include file="styles.css"%>
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Data Edit Page</title>
</head>
<body>
 <%@include file="master.jsp" %>
  <marquee><h1>Location Data Edit Page</h1></marquee>
<form action="updateVenData" method="post">
<center>
<table>
<tr>
<td>Vendor Id: </td><td><input type="text" name="venId" value="${venObj.venId}" readonly="readonly" /></td></tr>
<tr>
<td>Vendor name: </td><td><input type="text" name="venName" value="${venObj.venName}" /></td></tr>
<tr>
<td>E-Mail: </td><td><input type="email" name="venEmail" value="${venObj.venEmail}" /></td></tr>
<tr>
<tr>
<td>Location Name: </td><td><input type="text" name="locId" value="${venObj.loc.locName}" /></td></tr>
<tr>
<td>Location Type: </td><td><input type="email" name="locType" value="${venObj.loc.locType}" /></td></tr>
<tr>
<td></td><td><input type="submit" value="update"></td></tr>
</table>
</center>
</form>

</body>
</html>