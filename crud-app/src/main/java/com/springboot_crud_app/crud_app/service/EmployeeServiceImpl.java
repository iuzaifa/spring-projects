package com.springboot_crud_app.crud_app.service;

import com.springboot_crud_app.crud_app.dto.EmployeeResponse;
import com.springboot_crud_app.crud_app.dto.EmployeeRequest;
import com.springboot_crud_app.crud_app.entity.Employee;
import com.springboot_crud_app.crud_app.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest) {
        Employee employee = employeeRepository.save(employeeRequest);
        return null;
    }

    @Override
    public List<EmployeeResponse> getAllEmployee() {
        return List.of();
    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public EmployeeResponse employeeGetById(Long id) {
        return null;
    }

    @Override
    public EmployeeResponse updateEmployee(Long id) {
        return null;
    }
}
