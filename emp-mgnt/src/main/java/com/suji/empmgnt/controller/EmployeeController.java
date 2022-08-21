package com.suji.empmgnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suji.empmgnt.model.Employee;
import com.suji.empmgnt.service.EmployeeService;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return service.getAllEmployee();
	}
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}

}
