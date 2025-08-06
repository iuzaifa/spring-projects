package com.enterprise.springboot_enterprise_crud_system.dto.request;

import com.enterprise.springboot_enterprise_crud_system.entity.AttendanceStatus;
import com.enterprise.springboot_enterprise_crud_system.entity.Employee;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AttendanceRequest {



    @NotNull(message = "Date is required")
    private LocalDate date;
    @NotNull(message = "Status is required")
    private AttendanceStatus status;
    private String remarks;
    private Employee employee;

}
