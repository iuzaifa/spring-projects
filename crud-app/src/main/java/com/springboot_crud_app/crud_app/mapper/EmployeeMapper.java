package com.springboot_crud_app.crud_app.mapper;

import com.springboot_crud_app.crud_app.dto.EmployeeRequest;
import com.springboot_crud_app.crud_app.dto.EmployeeResponse;
import com.springboot_crud_app.crud_app.entity.Employee;
import lombok.experimental.UtilityClass;


@UtilityClass
public class EmployeeMapper {


    public static Employee toEmployeeEntity(EmployeeRequest employeeRequest){
        if (employeeRequest == null){
            return null;
        }
        Employee employee = new Employee();
        employee.setName(employeeRequest.getName());
        employee.setEmail(employeeRequest.getEmail());
        employee.setDepartment(employeeRequest.getDepartment());
        employee.setSalary(employeeRequest.getSalary());

        return employee;
    }


    public static EmployeeResponse toEmployeeResponseDto(Employee employee) {
        if (employee == null) return null;

        EmployeeResponse employeeResponse = new EmployeeResponse();

        employeeResponse.setId(employee.getId());
        employeeResponse.setName(employee.getName());
        employeeResponse.setEmail(employee.getEmail());
        employeeResponse.setDepartment(employee.getDepartment());
        employeeResponse.setSalary(employee.getSalary());

        return employeeResponse;
    }
}
