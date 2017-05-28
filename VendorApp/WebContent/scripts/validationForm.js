function locValidation()
{
	var idexp=/^[1-9][0-9]*$/;
	var nameExp=/^[A-Z]{3,6}$/;
	var stateExp=/^[A-Z]{2,10}$/;
	var pinExp=/^[1-9][0-9]{5,6}$/;
	var countryExp=/^[A-Z][A-Za-z]*$/;
	var supExp=/^[a-zA-Z]+$/;
	var advExp=/^[a-zA-z]+$/;
	document.getElementById("locIdErr").innerHTML="";
	document.getElementById("locNameErr").innerHTML="";
	document.getElementById("locStateErr").innerHTML="";
	document.getElementById("locCountryErr").innerHTML="";
	document.getElementById("locPinCodeErr").innerHTML="";
	document.getElementById("locTypeErr").innerHTML="";
	document.getElementById("locSupNameErr").innerHTML="";
	document.getElementById("locAdvNameErr").innerHTML="";
	//document.getElementById("locCreDateErr").innerHTML="";

	if(!(document.locForm.locId.value.match(idexp)))
		{
			document.getElementById("locIdErr").innerHTML="invalid id";
			return false;
		}
	if(!(document.locForm.locName.value.match(nameExp)))
		{
			document.getElementById("locNameErr").innerHTML="Name is not valid";
			return false;
		}
	if(!(document.locForm.locState.value.match(stateExp)))
		{
			document.getElementById("locStateErr").innerHTML="Enter A valid State";
			return false;
		}
	if(!(document.locForm.locCountry.value.match(countryExp)))
		{
			document.getElementById("locCountryErr").innerHTML="Enter A valid Country";
			return false;
		}
	if(!(document.locForm.locPinCode.value.match(pinExp)))
	{
		document.getElementById("locPinCodeErr").innerHTML="In valid Pincode";
		return false;
	}
	if(!(document.locForm.locSupName.value.match(supExp)))
	{
		document.getElementById("locSupNameErr").innerHTML="Provide Supervisor Name";
		return false;
	}
	if(!(document.locForm.locAdvName.value.match(advExp)))
	{
		document.getElementById("locAdvNameErr").innerHTML="Provide Advisor Name";
		return false;
	}
	if(document.locForm.locType[0].checked==false && document.locForm.locType[1].checked==false && document.locForm.locType[2].checked==false && document.locForm.locType[3].checked==false){
		document.getElementById("locTypeErr").innerHTML=" Choose any one type";
		return false;
	}
	
	return true;
}


// vendorReg form validations
function venValidations()
{
  var idExp=/^[1-9][0-9]*$/;
  if(!(document.venForm.venId.value.match(idExp)))
	  {
	  	document.getElementById("venIdErr").innerHTML="Invalid Vendor Id";
	  	return false;
	  }
  return true;
}