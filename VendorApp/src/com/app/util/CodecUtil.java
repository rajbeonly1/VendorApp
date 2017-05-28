package com.app.util;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;


@Component
public class CodecUtil {
 public String encodePwd(String pwd)	
 {
	 byte[] bpwd=Base64.encodeBase64(pwd.getBytes());
	 String epwd= new String(bpwd);
	 return epwd;
 }
 public String encodeAcToken(String token)
 {
	 String etoken=new String(Base64.encodeBase64(token.getBytes()));
	 return etoken;
 }
 public String decodePwd(String pwd)
 {
	 String dpwd=new String(Base64.decodeBase64(pwd.getBytes()));
	 return dpwd;
 }
 public String decodeAcToken(String token)
 {
	 String dtoken= new String(Base64.decodeBase64(token.getBytes()));
	 return dtoken;
 }
}
