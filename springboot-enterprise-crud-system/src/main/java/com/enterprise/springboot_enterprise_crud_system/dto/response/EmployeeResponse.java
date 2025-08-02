package com.enterprise.springboot_enterprise_crud_system.dto.response;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class EmployeeResponse {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Double salary;


    private LocalDateTime joinDate;
    private LocalDateTime createdDate = LocalDateTime.now();
    private LocalDateTime updatedDate;


    private List<AttendanceResponse> attendancesResponse;

    private DepartmentResponse departmentResponse;

    private DesignationResponse designationResponse;

    private Set<ProjectResponse> projectsResponse;

    private RoleResponse roleResponse;
}
