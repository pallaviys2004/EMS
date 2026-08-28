package com.spring.EMS.util;

import java.util.Random;

public class OtpGenerator {

	
	public static String generateotp()
	{
		Random random= new Random();
		
		int otp =10000+random.nextInt(900000);
		return String.valueOf(otp);
	}
}
