package com.app.util;

import java.io.IOException;
import java.io.InputStream;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Component
public class CommonUtil
{
	@Autowired
	private JavaMailSender mailSender;
	String msg=null;
	/**
	 * @param args
	 * @return 
	 */
	public String sendMail(String toAdd,String sub,String text, final CommonsMultipartFile cmf)
	{
		MimeMessage message=mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper= new MimeMessageHelper(message, true);
			helper.setFrom("magantisridevi123@gmail.com");
			helper.setTo(toAdd);
			helper.setSubject(sub);
			helper.setText(text);
			if(cmf != null)
			{
				helper.addAttachment(cmf.getOriginalFilename(), new InputStreamSource() {
					
					@Override
					public InputStream getInputStream() throws IOException {
						// TODO Auto-generated method stub
						return cmf.getInputStream();
					}
				});
			}
			mailSender.send(message);
			msg="(Email Sent)";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msg="(Email is not sent)";
		}
		return msg;
	}
	public String sendMail(String toAdd,String subject,String text)
	{
		 return sendMail(toAdd, subject, text,null);
	}
}
