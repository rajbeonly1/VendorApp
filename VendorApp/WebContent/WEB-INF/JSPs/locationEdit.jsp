<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style type="text/css">
		<%@ include file="styles.css" %>
	</style>
	<script type="text/javascript">
		function locEditValidation()
		{
			debugger;
			var nameExp=/^[A-Z]{3,6}$/;
			if(!(document.locEditForm.locName.value.match(nameExp)))
			{
				document.getElementById("locNameErr").innerHTML="Name is not valid";
				return false;
			}
			return true;
		}
	</script>
	<script type="text/javascript" src="../scripts/validationForm.js">

   </script>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>LocationDataEditPage</title>
</head>
<body>
  <%@include file="master.jsp" %>
 <marquee><h1>Location Data Edit Page</h1></marquee>
 <center>
	  <!-- <form action="updateLoc" method="post" name="locEditForm" onsubmit="return locEditValidation();"> -->
	 <form action="updateLoc" method="post" name="locForm" onsubmit="return locValidation();"> 
		<table >
			<tr>
				<td>ttftgdhfghfId:</td><td><input type="text" name="locId" value="${locObj.locId}" readonly="readonly" /></td>
			</tr>
			<tr>
				<td>Name: </td><td><input type="text" name="locName" value="${locObj.locName}"></td><td><span id="locNameErr"></span></td>
			</tr>
			<tr>
				<td>State: </td><td><input type="text" name="locState" value="${locObj.locState}"></td><td> <span id="locStateErr"></span></td>
			</tr>
			<tr>
				<td>PinCode: </td><td><input type="text" name="locPinCode" value="${locObj.locPinCode}"></td> <span id="locPinCodeErr"></span></td>
			</tr>
			<tr>
				<td>Country: </td><td><input type="text" name="locCountry" value="${locObj.locCountry}"></td> <span id="locCountryErr"></span></td>
			</tr>
			<tr>
				<td>Supervisor Name: </td><td><input type="text" name="locSupName" value="${locObj.locSupName}"></td><span id="locSupErr"></span></td>
			</tr>
			<tr>
				<td>Advisor Name: </td><td><input type="text" name="locAdvName" value="${locObj.locAdvName}"></td><span id="locAdvErr"></span></td>
			</tr>
			<tr>
				<td>Date Of creation: </td><td><input type="date" name="locCreDate" value="${locObj.locCreDate}"></td> <span id="locErr"></span></td>
			</tr>
			<tr>
				<td>Location Type:</td><td>
				<c:choose>
				<c:when test="${locObj.locType eq 'Urban'}">
				 <input type="radio" name="locType" value="Urban" checked="checked">Urban
				 <input type="radio" name="locType" value="Rural">Rural
				 <input type="radio" name="locType" value="Semi-Rural">Semi-Rural
				 <input type="radio" name="locType" value="Semi-Urban">Semi-Urban
				</c:when>
				<c:when test="${locObj.locType eq 'Semi-Urban'}">
				 <input type="radio" name="locType" value="Urban" >Urban
				 <input type="radio" name="locType" value="Rural">Rural
				 <input type="radio" name="locType" value="Semi-Rural">Semi-Rural
				 <input type="radio" name="locType" value="Semi-Urban" checked="checked">Semi-Urban
				</c:when>
				<c:when test="${locObj.locType eq 'Rural'}">
				 <input type="radio" name="locType" value="Urban" >Urban
				 <input type="radio" name="locType" value="Rural" checked="checked">Rural
				 <input type="radio" name="locType" value="Semi-Rural">Semi-Rural
				 <input type="radio" name="locType" value="Semi-Urban" >Semi-Urban
				</c:when>
				 <c:otherwise>
				 <input type="radio" name="locType" value="Urban" >Urban
				 <input type="radio" name="locType" value="Rural" checked="checked">Rural
				 <input type="radio" name="locType" value="Semi-Rural" checked="checked">Semi-Rural
				 <input type="radio" name="locType" value="Semi-Urban" >Semi-Urban<input type="radio" name="locType" value="Urban">Urban
				 <input type="radio" name="locType" value="Rural" checked="checked">Rural
				 </c:otherwise>
				 </c:choose> 
			<tr><span id="locTypeErr"></span></td>
				<td></td><td><input type="submit" value="update"></td>
			</tr> 
		</table>
	</form>
</center>
</body>
</html>