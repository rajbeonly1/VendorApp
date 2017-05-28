package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Location;
import com.app.model.Vendor;
import com.app.service.IVendorService;
import com.app.util.CommonUtil;
import com.app.util.LocationUtil;
import com.app.validator.VendorValidator;

@Controller
public class VendorController {
	@Autowired
	private IVendorService service;
	@Autowired
	private LocationUtil locUtil;
	@Autowired
	private VendorValidator validator;
	@Autowired
	private CommonUtil commonUtil;
	@RequestMapping("/venhome")
	public String vendorHome()
	{
		return "venhome";
	}
	@RequestMapping("/venReg")
	public String showVenReg(ModelMap m)
	{ 
		List<Location>locList=locUtil.getAllLocations();
		m.addAttribute("locObj", locList);
		return "vendorReg";
	}
	@RequestMapping(value="/insertVen", method=RequestMethod.POST)
	public String insertVen(@ModelAttribute("vendor")Vendor v,ModelMap map,@RequestParam("fileObj")CommonsMultipartFile file)
	{    
		String check=validator.DoVenEmailValidation(v.getVenEmail());
		if(check !=null){
			map.addAttribute("msg", check);
		}
		else{
		    int vId=service.saveVendor(v);
			map.addAttribute("msg", "Vendor Saved With: "+vId);
			//sending Mail On sucess
			commonUtil.sendMail(v.getVenEmail(),"Test Message","welcome to Hyderabad",file);
			List<Location> locList=locUtil.getAllLocations();
			map.addAttribute("locObj", locList);
		}
		return "vendorReg";
	}
	@RequestMapping( value="viewVens")
	public String showAllVens(ModelMap map)
	{   
		List<Vendor> vlist=service.getAllVendors();
		map.addAttribute("venObj", vlist);
		return "vendorData";
	}
	@RequestMapping("deleteVen")
	public String delVendor(@RequestParam("venId")int venId)
	{   service.deleteVendor(venId);
	return "redirect:viewVens";
	}
	@RequestMapping("/editVen")
	public String showEditPage(@RequestParam("venId")int venId,ModelMap m)
	{    Vendor v=service.getVenById(venId);
	m.addAttribute("venObj", v);
	return "vendorDataEdit";
	}
	@RequestMapping(value="updateVenData", method=RequestMethod.POST)
	public String updateVen(@ModelAttribute("vendor")Vendor v)
	{ 
		service.updateVendor(v);
		return "redirect:viewVens";	
	}
}
