package com.enterprise.springboot_enterprise_crud_system.service;

import com.enterprise.springboot_enterprise_crud_system.dto.EmployeeRequest;
import com.enterprise.springboot_enterprise_crud_system.dto.EmployeeResponse;

import java.util.List;

public interface EmployeeService {


    EmployeeResponse addNewEmployee(EmployeeRequest employeeRequest);

    List<EmployeeResponse> getAllEmployees();

    void deleteEmployeeById(Long id);

    EmployeeResponse updateEmployeeById(Long id, EmployeeRequest employeeRequest);


    EmployeeResponse getEmployeeById(Long id);

    EmployeeResponse getEmployeeByEmail(String email);

    EmployeeResponse getEmployeeByPhone(String  phone);

    EmployeeResponse getEmployeeByPhonec(String  phone);

}


