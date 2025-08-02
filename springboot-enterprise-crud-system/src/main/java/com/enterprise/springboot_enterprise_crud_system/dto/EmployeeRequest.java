package com.enterprise.springboot_enterprise_crud_system.dto;

import com.enterprise.springboot_enterprise_crud_system.entity.*;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
public class EmployeeRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Double salary;


    private LocalDateTime joinDate;
    private LocalDateTime createdDate = LocalDateTime.now();
    private LocalDateTime updatedDate;


    private List<Attendance> attendances;

    private Department department;

    private Designation designation;

    private Set<Project> projects;

    private Role role;
}
