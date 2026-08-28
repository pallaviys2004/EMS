package com.spring.EMS.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.EMS.dto.RegisterReq;
import com.spring.EMS.dto.VerifyOtpReq;
import com.spring.EMS.service.OtpService;
import com.spring.EMS.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;
	private OtpService otpService;
	public UserController(UserService userService, OtpService otpService) {
		this.userService = userService;
		this.otpService = otpService;
	}

	

	@PostMapping("/register")
	public String register(@RequestBody RegisterReq registerReq)
	{
		return userService.register(registerReq);
	}
	
	@PostMapping("/verify-otp")
	public String verifyOtp(@RequestBody VerifyOtpReq verifyOtpReq )
	{
		return otpService.verifyOtp(verifyOtpReq);
	}
}
