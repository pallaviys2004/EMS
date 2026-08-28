package com.spring.EMS.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.EMS.dto.RegisterReq;
import com.spring.EMS.entity.User;
import com.spring.EMS.repository.UserRepository;
import com.spring.EMS.util.OtpGenerator;

@Service
public class UserService {

	private UserRepository userRepository;
	private EmailService emailService;


	
	public UserService(UserRepository userRepository, EmailService emailService) {
		
		this.userRepository = userRepository;
		this.emailService = emailService;
	}



	public String register(@RequestBody RegisterReq registerReq)
	{
		   Optional<User> ou =userRepository.findByEmail(registerReq.getEmail());
		   
		   if(ou.isPresent())
		   {
			   return "Email_id already Exists";
		   }
		   else
		   {
			   User user = new User();
			   user.setName(registerReq.getName());
			   user.setEmail(registerReq.getEmail());
			   user.setPassword(registerReq.getPassword());
			   user.setRole("USER_ROLE");
			   user.setVerified(false);
			   
			   String otp = OtpGenerator.generateotp();
			   user.setOtp(otp);
			   user.setOtpexpirytime(LocalDateTime.now().plusMinutes(5));
			   userRepository.save(user);
			   emailService.sendEmail(registerReq.getEmail(), otp);
			   return "Enter the OTP sent to your mail";
			   
			   
		   }
	}
	
}
