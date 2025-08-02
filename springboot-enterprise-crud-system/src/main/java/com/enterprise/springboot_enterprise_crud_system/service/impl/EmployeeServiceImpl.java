package com.enterprise.springboot_enterprise_crud_system.service.impl;

import com.enterprise.springboot_enterprise_crud_system.dto.EmployeeRequest;
import com.enterprise.springboot_enterprise_crud_system.dto.EmployeeResponse;
import com.enterprise.springboot_enterprise_crud_system.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public EmployeeResponse addNewEmployee(EmployeeRequest employeeRequest) {
        return null;
    }

    @Override
    public List<EmployeeResponse> getAllEmployees() {
        return List.of();
    }

    @Override
    public void deleteEmployeeById(Long id) {

    }

    @Override
    public EmployeeResponse updateEmployeeById(Long id, EmployeeRequest employeeRequest) {
        return null;
    }

    @Override
    public EmployeeResponse getEmployeeById(Long id) {
        return null;
    }

    @Override
    public EmployeeResponse getEmployeeByEmail(String email) {
        return null;
    }

    @Override
    public EmployeeResponse getEmployeeByPhone(String phone) {
        return null;
    }
}
