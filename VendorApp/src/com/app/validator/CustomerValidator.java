package com.app.validator;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.Customer;
import com.app.util.CodecUtil;

@Component
public class CustomerValidator {
	@Autowired
	private CodecUtil codecUtil;

	public boolean isPwdAndTokenValid(String pwd,String token,Customer cust)
	{
		boolean flag=false;
		 //String dbpwd=codecUtil.decodePwd(cust.getCusPwd());
		// String dbtoken=codecUtil.decodeAcToken(cust.getAcsToken());
		if(pwd.equals(codecUtil.decodePwd(cust.getCusPwd())) && token.equals(codecUtil.decodeAcToken(cust.getAcsToken())) )
		{
			flag=true;
		}
		return flag;
	}
	public boolean isCustTypeSeller(Customer cust)
	{
		return "Sellor".equalsIgnoreCase(cust.getCusType());
		 
	}
	public boolean isCustTypeConsumer(Customer cust)
	{
		return "Consumer".equalsIgnoreCase(cust.getCusType());
		 
	}
}
