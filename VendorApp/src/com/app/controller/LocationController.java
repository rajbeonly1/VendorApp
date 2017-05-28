package com.app.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Location;
import com.app.service.ILocationService;
import com.app.util.LocationUtil;
import com.app.validator.LocationValidator;
//PL-Controller
@Controller
public class LocationController {
	@Autowired
	private ILocationService service;
	@Autowired
	private LocationValidator validator;
	@Autowired
	private ServletContext context;
	@Autowired
	private LocationUtil locUtil;
	
	/**
	 * Method :1)This is to show reg 
	 * page of Location Module.
	 * Here String return Type indicates
	 * ViewName(Page Name) without 
	 * prefix(location) & suffix(extension)
	 *  
	 * */
	
	/** When we enter 
	 * URL=>.../mvc/locReg in browser
	 * then this method is executed and
	 * it display the LocationReg.jsp file
	 *  
	 */

	//URL is :/locReg
	@RequestMapping("/locReg")
	public String showRegPage(){
		//View Name is : LocationReg
		return "locationReg";
	}
	/**
	 * 2. Insert Data in DB
	 * On click UI read as Object
	 * using @ModelAttribute and
	 * send to SL to Save data in DB
	 * as ROW  
	 */
	@RequestMapping(value="/insertLoc",method=RequestMethod.POST)
	public String saveLoc(@ModelAttribute("location")Location loc, ModelMap map){
		String error=validator.DoValidateLocName(loc.getLocName());
		if(error != null)
		{ 
			//send message to UI
			map.addAttribute("msg", error);
		}
		else{
		int locId=service.saveLocation(loc);
		map.addAttribute("msg","Saved with Id :"+locId);
		}
		return "locationReg";
	}
	
	/**
	 * 3. On click Hyper Link viewLocs
	 * from LocationReg page, request comes
	 * to here as GET Type, we need
	 * to call service layer getAllLocs()
	 * which returns List and add to ModelMap
	 * send back to UI(locationData.jsp) page
	 * 
	 */
	@RequestMapping("/viewLocs")	
	public String showLocs(ModelMap map){
		//call service layer method to get DB Data as List
		List<Location> locList=service.getAllLocations();
		//add to ModelMap to send to UI
		map.addAttribute("locListObj", locList);
		//provide UI(View)page name
		return "locationData";
	}
	
	/**
	 * 4. This method reads
	 * request parameters locId
	 * and sends to service layer
	 * deleteLocById and at last
	 * redirects to viewAllLocs
	 * ie 3rd method url.
	 */
	@RequestMapping("/deleteLoc")
	public String deleteLoc(@RequestParam("locId")int id,ModelMap m){
		String check=validator.CheckBeforeDeleteloc(id);
		if(check != null)
		{
			m.addAttribute("msg", check);
		}
		service.deleteLocation(id);
		return "redirect:viewLocs";
	}
	@RequestMapping("/editLoc")
	public String editLoc(@RequestParam("locId")int locId,ModelMap m)
	{ 
		 Location loc=service.getLocById(locId);
		 m.addAttribute("locObj", loc);
		return "locationEdit";
	}
	@RequestMapping(value="/updateLoc",method=RequestMethod.POST)
	public String updateLoc(@ModelAttribute("location")Location loc)
	{  service.updateLocation(loc);
		return "redirect:viewLocs";
	}
	@RequestMapping("/locExcelView")
	public String excelView(ModelMap m)
	{   List<Location> locList=service.getAllLocations();
	    m.addAttribute("locListObj", locList);
		return "locExcelPage";
	}
	@RequestMapping("/pdfExcelView")
	public String pdfView(ModelMap m)
	{
		List<Location> locList=service.getAllLocations();
		m.addAttribute("locListObj", locList);
		return "pdfViewPage";
	}
	/**
	 *this method get the data from database and design the report 
	 */
	@RequestMapping("/locReportShow")
	public String genReport()
	{
		List<Object[]> data=service.getLocationWiseCount();
		String path=context.getRealPath("/");
		locUtil.genLocPieChart(path,data);
			
	 return "reportLoc";	
	}
	
}
