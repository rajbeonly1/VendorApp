<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="master.jsp" %>
<table border="2">
<tr>
	<th>Id</th><th>Name</th><th>Email</th><th>Type</th><th>Adress</th><th>Mobile no</th>
</tr>
<c:forEach items="${customers}" var="cust">
<tr >
<td> <c:out value="${cust.cusId}" /></td>
	<td><c:out value="${cust.cusName}" /></td>
	<td><c:out value="${cust.cusEmail}" /></td>
	<td><c:out value="${cust.cusType}" /></td>
	<td><c:out value="${cust.cusAddress}" /></td>
	<td><c:out value="${cust.cusMblNo}" /></td>
    <td><a href='deleteCust?cusId=<c:out value="${cust.cusId}"/>'>Delete</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>