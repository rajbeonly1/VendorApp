<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
<%@ include file="styles.css" %>
</style>
<!-- <style>
table{
width:500px;
height:300px;
}
</style> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Data Page</title>
</head>
<body>
 <%@include file="master.jsp" %>
 <marquee><h1>Welcome To Location Data Page!!</h1></marquee>
 <center>
<table border="2">
<tr><th>Vendor Id</th><th>Vendor Name</th><th>Vendor Email</th><th>Location Name</th><th>Location Type</th>
</tr>

<c:forEach items="${venObj}" var="v"> 
<tr>
<td><a href='editVen?venId=<c:out value="${v.venId}" />'><c:out value="${v.venId}"></c:out></a></td>
<td><c:out value="${v.venName}"></c:out></td>
<td><c:out value="${v.venEmail}"></c:out></td>
<td><c:out value="${v.loc.locName}"></c:out></td>
<td><c:out value="${v.loc.locType}"></c:out></td>
<td><a href='deleteVen?venId=<c:out value="${v.venId}"/> '>delete</a>
</tr>
</c:forEach>
</table>
</center>
</body>
</html>