package com.spring.EMS.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "user-info")
public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	@NotNull
	private String name;
	
	@Column(unique = true)
	@Email
	private String email;
	
	@NotNull 
	@Size(min=6)
	private String password;
	
	private boolean verified;
	
	private String role;
	
	private String otp;
	
	private LocalDateTime otpexpirytime;
	
}
