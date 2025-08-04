package com.enterprise.springboot_enterprise_crud_system.service.impl;

import com.enterprise.springboot_enterprise_crud_system.dto.request.EmployeeRequest;
import com.enterprise.springboot_enterprise_crud_system.dto.response.EmployeeResponse;
import com.enterprise.springboot_enterprise_crud_system.entity.Employee;
import com.enterprise.springboot_enterprise_crud_system.config.EmployeeMapper;
import com.enterprise.springboot_enterprise_crud_system.repository.EmployeeRepository;
import com.enterprise.springboot_enterprise_crud_system.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;


    @Override
    public EmployeeResponse addNewEmployee(EmployeeRequest employeeRequest) {
        if (employeeRequest == null) {
            throw new IllegalArgumentException("Employee request cannot be null");
        }
        if (employeeRequest.getEmail() == null || employeeRequest.getEmail().isBlank()) {
            throw new IllegalArgumentException("Email cannot be blank");
        }
        if (employeeRepository.existsByEmail(employeeRequest.getEmail())) {
            throw new IllegalArgumentException("Employee with this email already exists");
        }
        Employee employee = EmployeeMapper.toEntity(employeeRequest);
        try {
            Employee savedEmployee = employeeRepository.save(employee);
            return EmployeeMapper.toDto(savedEmployee);
        } catch (Exception e) {
            throw new RuntimeException("Error saving employee", e);
        }
    }

    @Override
    public List<EmployeeResponse> getAllEmployees() {

        return List.of();
    }

    @Override
    public void deleteEmployeeById(Long id) {
//        Employee employee = employeeRepository.findById(id)
//                .orElseThrow(() -> new NotFoundException("Employee id Not Exits Please Try right Id :"));
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
