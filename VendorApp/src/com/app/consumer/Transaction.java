package com.app.consumer;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.Customer;
import com.app.model.Item;
import com.app.model.TransactionInfo;
import com.app.service.ICustomerService;
import com.app.service.ITransactionService;
import com.app.util.JsonUtil;
import com.app.validator.CustomerValidator;

@Component
@Path("/transaction")
public class Transaction {
	@Autowired	
	private  ICustomerService custService;
	@Autowired
	private  CustomerValidator custValidator;
	@Autowired
	private JsonUtil jsonUtil;
	@Autowired
	private ITransactionService txService;;
	@Path("details")
	@POST
	public String showTransactionDetails(@HeaderParam("username")String un,
			                              @HeaderParam("password")String pwd,
			                              @HeaderParam("token")String token,
			                              String json)
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
	     if(cust==null)
	     {
	    	 return "invalid username";
	     }
	     boolean f= custValidator.isPwdAndTokenValid(pwd, token, cust);
	     if(!f)
	     {
	    	return "invalid password/token"; 
	     }
	    f= custValidator.isCustTypeConsumer(cust);
	    if(!f)
	     {
	    	return "Not a valid Customer"; 
	     }
	    Object ob=jsonUtil.convertJsonToObj(json, TransactionInfo.class);
	    if(ob==null)
	    {
	    	return "invalid json";
	    }
	    TransactionInfo tx=(TransactionInfo)ob;
	    tx.setCustId(cust.getCusId());
	     int id=txService.saveTransaction(tx);
		return "transaction saved with id: "+id;
	}
}

