package com.spring.EMS.dto;

import lombok.Data;

@Data
public class RegisterReq {

	private String name;
	private String email;
	private String password;
}
