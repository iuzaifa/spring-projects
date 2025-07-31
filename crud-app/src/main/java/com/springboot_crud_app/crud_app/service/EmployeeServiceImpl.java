package com.springboot_crud_app.crud_app.service;

import com.springboot_crud_app.crud_app.dto.EmployeeResponse;
import com.springboot_crud_app.crud_app.dto.EmployeeRequest;
import com.springboot_crud_app.crud_app.entity.Employee;
import com.springboot_crud_app.crud_app.mapper.EmployeeMapper;
import com.springboot_crud_app.crud_app.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest) {
        Employee employee = EmployeeMapper.toEmployeeEntity(employeeRequest);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.toEmployeeResponseDto(savedEmployee);

    }


    @Override
    public List<EmployeeResponse> getAllEmployee() {
        return employeeRepository.findAll().stream()
                .map(EmployeeMapper::toEmployeeResponseDto)
                .collect(Collectors.toList());

    }

    @Override
    public void deleteEmployee(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Employee ID must not be null");
        }
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Employee Not Found Try another Id"));
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeResponse getEmployeeById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Employee ID must not be null");
        }

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Employee Not Found Try another Id"));
        return EmployeeMapper.toEmployeeResponseDto(employee);
    }

    @Override
    public EmployeeResponse updateEmployee(Long id, EmployeeRequest employeeRequest) {
        if (id == null) {
            throw new IllegalArgumentException("Employee ID must not be null");
        }
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee Not Found Try another Id"));
        employee.setName(employeeRequest.getName());
        employee.setEmail(employeeRequest.getEmail());
        employee.setDepartment(employeeRequest.getDepartment());
        employee.setSalary(employeeRequest.getSalary());

        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.toEmployeeResponseDto(savedEmployee);
    }
}
