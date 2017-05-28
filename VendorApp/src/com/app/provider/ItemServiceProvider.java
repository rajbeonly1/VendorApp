package com.app.provider;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.Customer;
import com.app.model.Item;
import com.app.service.ICustomerService;
import com.app.service.IItemService;
import com.app.util.JsonUtil;
import com.app.validator.CustomerValidator;

@Component
@Path("/item")
public class ItemServiceProvider
{
	@Autowired
	private ICustomerService custService;
	@Autowired
	private CustomerValidator cusValidator;
	@Autowired
	private JsonUtil jsonUtil;
	@Autowired
	private IItemService iservice;
 @Path("saveItem")
 @POST
 public String saveItem(@HeaderParam("username")String un, @HeaderParam("password")String pwd, @HeaderParam("token")String token, String json)
 {
	
     if(un == null || "".equals(un.trim()))
     {
    	 return "username should not be empty";
     }
     if(pwd == null || "".equals(pwd.trim()))
     {
    	 return "password required";
     }
     if(token == null || "".equals(token.trim()))
     {
    	 return "token required";
     }
     if(json == null || "".equals(json.trim()))
     {
    	 return "Item(json) required";
     }
     //checking wether user is existed or not
     Customer cust=custService.getCustByEmail(un);
     if(cust == null)
     {
    	 return "User is not Valid";
     }
     boolean flag=cusValidator.isPwdAndTokenValid(pwd, token, cust);
     if(!flag)
     {
    	 return "invalid password/Access Token";
     }
     flag=cusValidator.isCustTypeSeller(cust);
     if(!flag)
     {
    	 return "Only Seller can allowed to do this Operaration";
     }
	
	 Object ob=jsonUtil.convertJsonToObj(json, Item.class);
	 if(ob==null)
	 {
		 return "json is not valid";
	 }
	 Item i=(Item)ob;
	 i.setCustId(cust.getCusId());
	 int Iid=iservice.saveItem(i);
	 return "Item Saved With id: "+Iid;
 }
}
