# Employee Management System (EMS)

A simple Employee Management System developed using Java and Spring Boot.
This project provides REST APIs for user registration, OTP verification, and employee management.

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- REST API
- Lombok
- Maven

## Project Features

- User Registration
- Email-based OTP Verification
- OTP Generation
- User Verification
- Employee Management
- RESTful APIs
- MySQL Database Integration
- Layered Architecture

## Project Structure

```text
EMS
├── src
│   └── main
│       ├── java
│       │   └── com.spring.EMS
│       │       ├── controller
│       │       │   └── UserController.java
│       │       ├── dto
│       │       │   ├── RegisterReq.java
│       │       │   └── VerifyOtpReq.java
│       │       ├── entity
│       │       │   └── User.java
│       │       ├── repository
│       │       │   └── UserRepository.java
│       │       ├── service
│       │       │   ├── EmailService.java
│       │       │   ├── OtpService.java
│       │       │   └── UserService.java
│       │       ├── util
│       │       │   └── OtpGenerator.java
│       │       └── EmsApplication.java
│       │
│       └── resources
│           ├── static
│           ├── templates
│           └── application.properties
│
├── pom.xml
├── .gitignore
└── README.md

## **How It Works**

### **1. User Registration**

The user provides:

- **Name**
- **Email**
- **Password**

The registration API saves the user details and generates an OTP.

### **2. OTP Verification**

The OTP is sent to the registered email address.

The user enters:

- **Email**
- **OTP**

The system verifies the OTP and completes the user verification process.

## **API Endpoints**

### **1. Register User**

**Endpoint:**

```http
POST /users/register
**Example Request:**

```json
{
    "name": "Pallavi",
    "email": "pallavi@gmail.com",
    "password": "password123"
}

2. Verify OTP

Endpoint:

POST /users/verify-otp

Example Request:

{
    "email": "pallavi@gmail.com",
    "otp": "123456"
}



If you want the **heading `Verify OTP` to appear bold and larger on GitHub**, `### **2. Verify OTP**` is correct.
