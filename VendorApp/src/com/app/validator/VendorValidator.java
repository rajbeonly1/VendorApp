package com.app.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.Vendor;
import com.app.service.IVendorService;
@Component
public class VendorValidator {
	@Autowired
private IVendorService service;
	
	public String DoVenEmailValidation(String venEmail)
	{  String str=null;
		Vendor ven=service.getVendorByEmail(venEmail);
		if(ven !=null)
		{
			str="Provided "+venEmail+" alredy assignerd to Some Vendor";
		}
		return str;
	}
	

}
