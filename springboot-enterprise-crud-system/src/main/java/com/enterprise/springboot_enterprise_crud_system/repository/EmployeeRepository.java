package com.enterprise.springboot_enterprise_crud_system.repository;

import com.enterprise.springboot_enterprise_crud_system.entity.Employee;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT COUNT(*) > 0 FROM employee WHERE email = :email", nativeQuery = true)
    boolean existsByEmail(@Param("email") String email);





}
