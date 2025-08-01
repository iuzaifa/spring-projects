package com.enterprise.springboot_enterprise_crud_system.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // e.g. ADMIN, USER, HR, etc.

    @OneToMany(mappedBy = "role")
    private List<Employee> employees;
}
