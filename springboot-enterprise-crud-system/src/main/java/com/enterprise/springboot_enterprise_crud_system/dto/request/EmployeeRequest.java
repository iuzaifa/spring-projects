package com.enterprise.springboot_enterprise_crud_system.dto.request;

import com.enterprise.springboot_enterprise_crud_system.entity.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
public class EmployeeRequest {


    @NotBlank(message = "First name is required")
    @Size(max = 50, message = "First name must be at most 50 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(max = 50, message = "Last name must be at most 50 characters")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String phone;

    @NotNull(message = "Salary is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Salary must be greater than 0")
    private Double salary;

    @NotNull(message = "Join date is required")
    private LocalDateTime joinDate;

    private LocalDateTime createdDate = LocalDateTime.now();

    private LocalDateTime updatedDate;

    @NotNull(message = "Attendance list is required")
    @Size(min = 1, message = "At least one attendance record is required")
    private List<Attendance> attendances;

    @NotNull(message = "Department is required")
    private Department department;

    @NotNull(message = "Designation is required")
    private Designation designation;

    @NotEmpty(message = "Projects list must not be empty")
    private Set<Project> projects;

    @NotNull(message = "Role is required")
    private Role role;
}
