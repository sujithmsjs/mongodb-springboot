package com.suji.empmgnt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.suji.empmgnt.model.Employee;

@Service
public interface EmployeeService  {
	
	

	public Employee addEmployee(Employee emp);
	public List<Employee> getAllEmployee();
		
}
