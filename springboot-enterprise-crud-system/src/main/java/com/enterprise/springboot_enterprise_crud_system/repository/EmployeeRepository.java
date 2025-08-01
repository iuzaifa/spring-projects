package com.enterprise.springboot_enterprise_crud_system.repository;

import com.enterprise.springboot_enterprise_crud_system.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
