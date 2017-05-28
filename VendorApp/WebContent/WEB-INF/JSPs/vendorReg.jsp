<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<style type="text/css">
			<%@ include file="styles.css" %>
		</style>
		<script type="text/javascript" src="../srcipts/validationForm.js">

</script>
		<script type="text/javascript">
			function venValidations()
			{
				var idExp=/^[1-9][0-9]+$/;
				if(!(document.venForm.venId.value.match(idExp)))
					{
					document.getElementById("venIdErr").innerHTML="Invalid Id";
					return false;
					}
			
				return true;
			}
		</script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Vendor Registration Page</title>
	</head>
	<body>
		 <%@include file="master.jsp" %>
		 <marquee><h1>Vendor Registration Page</h1></marquee>
		 <center>
			<form action="insertVen" method="post" name="venForm" onsubmit="return venValidations();" enctype="multipart/form-data">
				<table>
					 
					<tr>
						<td>Vendor Name:</td><td><input type="text" name="venName" /></td> <td><span id="venNameErr"></span> </td> 
				    </tr>
					<tr>
						<td>Vendor Email:</td><td><input type="text" name="venEmail" /></td> <td><span id="venEmailErr"></span> </td> 
					</tr>
					<tr>
						<td>Location: </td><td> <select name="loc.locId">
								  <c:forEach items="${locObj}" var="loc">
								  <option value="${loc.locId}"><c:out value="${loc.locName}"/></option>
								  </c:forEach>
							  </select> </td> <td><span id="venLocErr"></span> </td>
					</tr>
					<tr>
						<td>Upload:</td><td><input type="file" name="fileObj"></td>
					</tr>
					<tr><td></td><td><input type="submit" value="Register" /></td></tr>
				</table>
			</form>
			<br/>
			<b>${msg}</b>
		</center>
	</body>
</html>