package com.springboot_crud_app.crud_app.service;

import com.springboot_crud_app.crud_app.dto.EmployeeResponse;
import com.springboot_crud_app.crud_app.dto.EmployeeRequest;

import java.util.List;

public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);

    List<EmployeeResponse> getAllEmployee();

    void deleteEmployee(Long id);

    EmployeeResponse employeeGetById(Long id);

    EmployeeResponse updateEmployee(Long id, EmployeeRequest employeeRequest);
}
