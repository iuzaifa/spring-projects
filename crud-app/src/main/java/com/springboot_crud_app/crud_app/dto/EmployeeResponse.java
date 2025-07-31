package com.springboot_crud_app.crud_app.dto;

import lombok.Data;

@Data
public class EmployeeResponse {

    private Long id;
    private String name;
    private String email;
    private String department;
    private Double salary;

}
