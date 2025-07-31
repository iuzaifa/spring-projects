package com.springboot_crud_app.crud_app.controller;

import com.springboot_crud_app.crud_app.constants.CommonConstants;
import com.springboot_crud_app.crud_app.dto.EmployeeRequest;
import com.springboot_crud_app.crud_app.dto.EmployeeResponse;
import com.springboot_crud_app.crud_app.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping(CommonConstants.BASE_URL)
public class EmployeeController {


    private final EmployeeService employeeService;


    // CREATE employee
    @PostMapping(CommonConstants.CREATE_EMPLOYEE)
    public ResponseEntity<?> createEmployee(@Valid @RequestBody EmployeeRequest employeeRequest){
        EmployeeResponse response = employeeService.createEmployee(employeeRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    // GET ALL EMPLOYEES
    @GetMapping(CommonConstants.GET_ALL_EMPLOYEE)
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees() {
        List<EmployeeResponse> responses = employeeService.getAllEmployee();
        return responses.isEmpty()
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(responses);
    }


    // UPDATE EMPLOYEE BY ID
    @PutMapping(CommonConstants.UPDATE_EMPLOYEE_BY_ID)
    public ResponseEntity<?> updateEmployeeById(@PathVariable Long id,
                                                @Valid @RequestBody EmployeeRequest employeeRequest){
        EmployeeResponse response = employeeService.updateEmployee(id, employeeRequest);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


    // DELETE EMPLOYEE BY ID
    @DeleteMapping(CommonConstants.DELETE_EMPLOYEE_BY_ID)
    public ResponseEntity<?> deleteEmployeeById(@PathVariable Long id){
        String message = "Deleted Successfully : "+id;
        employeeService.deleteEmployee(id);
        return ResponseEntity.status(HttpStatus.OK).body(message);
    }


    // GET EMPLOYEE BY ID
    @GetMapping(CommonConstants.GET_EMPLOYEE_BY_ID)
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id){
        EmployeeResponse response = employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }








}
