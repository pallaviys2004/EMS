package com.spring.EMS.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	private JavaMailSender javaMailSender;
	
	public EmailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	public void sendEmail(String tomail, String otp)
	{
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom("poojas4404@gmail.com");
		simpleMailMessage.setTo(tomail);
		simpleMailMessage.setSubject("OTP VERIFICATION");
		simpleMailMessage.setText("OTP for your EMS is "+otp);
		
		javaMailSender.send(simpleMailMessage);
	}
}
