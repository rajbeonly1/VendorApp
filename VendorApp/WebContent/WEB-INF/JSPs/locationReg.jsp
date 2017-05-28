<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	<%@
		include file="styles.css"
	%>
</style>
<script type="text/javascript" src="../scripts/validationForm.js">

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%@include file="master.jsp"%>
	<marquee>
		<h1>Welcome To Location Register Page!!</h1>
	</marquee>
	<form action="insertLoc" method="post" name="locForm" onsubmit="return locValidation()">
		<center>
			<table>
				 
				<tr>
					<td>Location Name:</td>
					<td><input type="text" name="locName" /></td><td><span id="locNameErr"></span>
				</tr>
				<tr>
					<td> State:</td>
					<td><input type="text" name="locState" /></td><td><span id="locStateErr"></span></td>
				</tr>
				<tr>
					<td>PinCode:</td>
					<td><input type="text" name="locPinCode" /></td><td><span id="locPinCodeErr"></span></td>
				</tr>
				<tr>
					<td>Location Country:</td>
					<td><input type="text" name="locCountry" /></td><td><span id="locCountryErr"></span></td>
				</tr>
				<tr>
					<td>Location Supervisor Name:</td>
					<td><input type="text" name="locSupName" /></td><span id="locSupNameErr"></span></td>
				</tr>
				<tr>
					 <td>Location Advisor Name:</td>
					<td><input type="text" name="locAdvName" /></td><span id="locAdvNameErr"></span></td>
				</tr>
				<tr>
					<td>Location Creation Date:</td>
					<td><input type="date" name="locCreDate" required="required"/></td><span id="locCreDateErr"></span></td>
				</tr>
				<tr>
					<td>Location Type:</td>
					<td><input type="radio" name="locType" value="Urban">Urban
					    <input type="radio" name="locType" value="Rural">Rural
						<input type="radio" name="locType" value="Semi-Rural">Semi-Rural
						<input type="radio" name="locType" value="Semi-Urban">Semi-Urban</td><td><span id="locTypeErr"></span></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</center>
	</form>
	<br />
	<center>
		<b>${msg}</b><br />
	</center>
</body>
</html>



