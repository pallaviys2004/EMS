package com.spring.EMS.service;



import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.spring.EMS.dto.VerifyOtpReq;
import com.spring.EMS.entity.User;
import com.spring.EMS.repository.UserRepository;

@Service
public class OtpService {

	private UserRepository userRepository;
	
	public OtpService(UserRepository userRepository) {
	
		this.userRepository = userRepository;
	}

	public String verifyOtp( VerifyOtpReq verifyOtpReq )
	{
		Optional<User> optionaluser =userRepository.findByEmail(verifyOtpReq.getEmail());
		
		if(optionaluser.isPresent())
		{
			    User user =optionaluser.get();	
			    
			    if(!user.getOtp().equals(verifyOtpReq.getOtp()))
			    {
			    	return "Invalid OTP";
			    }
			    if(LocalDateTime.now().isAfter(user.getOtpexpirytime()))
			    {
			    	return "OTP expired";
			    }
			    else
			    {
			    	user.setOtp(null);
			    	user.setOtpexpirytime(null);
			    	user.setVerified(true);
			    	userRepository.save(user);
			    	return "OTP Verified Successfully";
			    }
			        
		}
		else
		{
			return "User not found";
		}
	}
}
