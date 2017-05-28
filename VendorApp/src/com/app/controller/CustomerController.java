package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Customer;
import com.app.service.ICustomerService;
import com.app.util.CodeUtil;
import com.app.util.CodecUtil;
import com.app.util.CommonUtil;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerService service;
	@Autowired
	private CodeUtil codeUtil;
	@Autowired
	private CodecUtil codecUtil;
	@Autowired
	private CommonUtil commonUtil;
  @RequestMapping("/cusReg")
  public String cusReg()
  {
	  return "customerReg";
  }
  @RequestMapping(value="/insertCus",method=RequestMethod.POST)
  public String insertCus(@ModelAttribute("customer")Customer cus,ModelMap m)
  {   
	  String pwd=codeUtil.genPwd();
	  String token=codeUtil.genAcsToken();
	  
	  cus.setCusPwd(codecUtil.encodePwd(pwd));
	  cus.setAcsToken(codecUtil.encodeAcToken(token));
	  
	  int id=service.saveCustomer(cus);
	  commonUtil.sendMail(cus.getCusEmail(),"Registration conformation ", "password:"+pwd+"  Access Token: "+token);
	  
	  m.addAttribute("msg", "Customer Saved with Id: "+id);
	  return "customerReg";
  }
  @RequestMapping(value="viewAllCust")
  public String showAllCustomers(ModelMap m)
  {
	  List<Customer> custList=service.getAllCustomers();
	  m.addAttribute("customers", custList);
	  System.out.println(custList);
	  return "customersData";
  }
  @RequestMapping("/deleteCust")
  public String deleteCust(@RequestParam("cusId")int custId)
  {
	  service.deleteCustomer(custId);
	  
	  return "redirect:viewAllCust";
  }
}
