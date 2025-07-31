package com.springboot_crud_app.crud_app.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class EmployeeRequest {

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be 2 to 50 characters long")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Department is required")
    private String department;

    @NotNull(message = "Salary is required")
    @DecimalMin(value = "1000.0", message = "Salary must be at least 1000.0")
    @Digits(integer = 10, fraction = 2, message = "Salary must be a valid number")
    private Double salary;


}
