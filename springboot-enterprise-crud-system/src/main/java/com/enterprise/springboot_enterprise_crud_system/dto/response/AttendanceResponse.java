package com.enterprise.springboot_enterprise_crud_system.dto.response;

import com.enterprise.springboot_enterprise_crud_system.entity.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
public class AttendanceResponse {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Double salary;


    private LocalDateTime joinDate;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    private List<Attendance> attendances;
    private Department department;
    private Designation designation;
    private Set<Project> projects;
    private Role role;
}
