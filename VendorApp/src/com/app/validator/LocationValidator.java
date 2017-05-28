package com.app.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.Location;
import com.app.service.ILocationService;
@Component
public class LocationValidator {
	@Autowired
	private ILocationService service;
	
	public String DoValidateLocName(String name)
	{
		String str=null;
		Location loc=service.getLocationByName(name);
		if(loc != null)
		{
			str="Location Name "+name+" already exit our database";
		}
		return str;
	
	}
	public String CheckBeforeDeleteloc(int locId)
	{
		String str=null;
		Location loc=service.checkBeforeDelete(locId);
		if(loc != null)
		{
			str=""+loc.getLocName()+" can not be deleted it is used by some vendor";
		}
		return str;
	}

}
