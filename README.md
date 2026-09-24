# Employee Management System (EMS)

A simple **Employee Management System** developed using **Java and Spring Boot**. This project provides REST APIs for user registration, OTP verification, and employee management.

## Technologies Used

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate
* MySQL
* REST API
* Lombok
* Maven

## Project Features

* User Registration
* Email-based OTP Verification
* OTP Generation
* User Verification
* Employee Management
* RESTful APIs
* MySQL Database Integration
* Layered Architecture

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
│       └── resources
│           ├── static
│           ├── templates
│           └── application.properties
├── pom.xml
├── .gitignore
└── README.md
```

## Database Configuration

```properties
spring.application.name=EMS

spring.datasource.url=jdbc:mysql://localhost:3306/EMS?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=your_password

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

server.port=8084
```

> **Note:** Do not upload your actual email password or App Password to GitHub.

## How It Works

### 1. User Registration

The user provides:

* Name
* Email
* Password

The registration API saves the user details and generates an OTP.

### 2. OTP Verification

The OTP is sent to the registered email address.

The user enters:

* Email
* OTP

The system verifies the OTP and completes the user verification process.

## API Endpoints

### 1. Register User

**Endpoint:**

```http
POST /users/register
```

**Request:**

```json
{
    "name": "Pallavi",
    "email": "pallavi@gmail.com",
    "password": "password123"
}
```

### 2. Verify OTP

**Endpoint:**

```http
POST /users/verify-otp
```

**Request:**

```json
{
    "email": "pallavi@gmail.com",
    "otp": "123456"
}
```

## Author

**Pallavi Y S**

GitHub: https://github.com/pallaviys2004
