<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
<%@
	include file="styles.css" 
%>

</style>
<!--<style>
table {
	width: 500px;
	height: 300px;
}
</style>-->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%@include file="master.jsp"%>
	<marquee>
		<h1>Welcome To Location Data Page!!</h1>
	</marquee>
	
	<center>
	<a href="locExcelView" style="color:green;font-size: 20px;">Export to Excel</a>&nbsp;&nbsp;&nbsp;
	    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    
	<a href="pdfExcelView" style="color:red;font-size: 20px;">Export to PDF</a>
		<table border="2">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Type</th>
				<th>State</th>
				<th>PinCode</th>
				<th>Country</th>
				<th>Supervisor Name</th>
				<th>Advisor Name</th>
				<th>Date of Creation</th>
			</tr>
			<c:forEach items="${locListObj}" var="loc">
				<tr>
					<td><a href='editLoc?locId=<c:out value="${loc.locId}" />'><c:out
								value="${loc.locId}" /></a></td>
					<td><c:out value="${loc.locName}" /></td>
					<td><c:out value="${loc.locType}" /></td>
					<td><c:out value="${loc.locState}" /></td>
					<td><c:out value="${loc.locPinCode}" /></td>
					<td><c:out value="${loc.locCountry}" /></td>
					<td><c:out value="${loc.locSupName}" /></td>
					<td><c:out value="${loc.locAdvName}" /></td>
					<td><c:out value="${loc.locCreDate}" /></td>
					<td><a href='deleteLoc?locId=<c:out value="${loc.locId}"/>'>Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<h3><b>${msg}</b></h3>
	</center>
</body>
</html>


