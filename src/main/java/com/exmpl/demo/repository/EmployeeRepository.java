package com.exmpl.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exmpl.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
