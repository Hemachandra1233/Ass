package com.exmpl.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exmpl.demo.entity.Employee;
import com.exmpl.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}
	
	@PostMapping("/employees/add")
	public String addEmployee(@RequestBody Employee employee) {
		employeeRepo.save(employee);
		return "added successfully";
	}
}
