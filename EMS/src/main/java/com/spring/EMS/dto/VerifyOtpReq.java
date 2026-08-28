package com.spring.EMS.dto;

import lombok.Data;

@Data
public class VerifyOtpReq {

	private String email;
	private String otp;
}
