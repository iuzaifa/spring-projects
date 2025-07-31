package com.springboot_crud_app.crud_app.repository;

import com.springboot_crud_app.crud_app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Long, Employee> {


}

