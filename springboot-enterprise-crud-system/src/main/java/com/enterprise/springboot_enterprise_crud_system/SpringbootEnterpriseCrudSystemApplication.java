package com.enterprise.springboot_enterprise_crud_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootEnterpriseCrudSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEnterpriseCrudSystemApplication.class, args);

		System.out.println("Application Start Successfully .......");
	}

}


/*
*
* src/main/java/com/yourproject
├── controller
│   ├── EmployeeController.java
│   └── DepartmentController.java
├── service
│   ├── EmployeeService.java        <-- Interface
│   └── impl
│       └── EmployeeServiceImpl.java
├── dto
│   └── EmployeeRequest.java
│   └── EmployeeResponse.java
├── mapper
│   └── EmployeeMapper.java
├── model
│   └── Employee.java
│   └── Department.java
├── repository
│   └── EmployeeRepository.java
├── constants
│   └── AppConstants.java
├── exception
│   ├── GlobalExceptionHandler.java
│   └── ResourceNotFoundException.java
└── util
    └── HelperUtil.java (optional)

*
* */