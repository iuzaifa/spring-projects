package com.enterprise.springboot_enterprise_crud_system.service;

import java.util.List;

public interface EmployeeService {


    EmployeeResponse addNewEmployee(EmployeeRequest employeeRequest);

    List<EmployeeResponse> getAllEmployees();

    void deleteEmployeeById(Long id);


    EmployeeResponse updateEmployeeById(Long id, EmployeeRequest employeeRequest);

    EmployeeResponse getEmployeeById(Long id);

    // employee get by email
    // employee get by phone
}


