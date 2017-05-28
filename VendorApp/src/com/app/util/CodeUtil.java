package com.app.util;

import java.util.UUID;

import org.springframework.stereotype.Component;


@Component
public class CodeUtil {
	public String genCode(int a,int b)
	{
		String s=UUID.randomUUID().toString().replaceAll("-", "").substring(a,b);
		return s;
	}
	public String genPwd()
	{
		String pwd=genCode(2,7);
		return pwd;
	}
	public String genAcsToken()
	{
		String token=genCode(2,9);
		return token;
	}
}
