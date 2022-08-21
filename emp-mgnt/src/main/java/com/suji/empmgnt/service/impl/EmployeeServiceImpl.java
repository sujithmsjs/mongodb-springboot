package com.suji.empmgnt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suji.empmgnt.model.Employee;
import com.suji.empmgnt.repository.EmployeeRepository;
import com.suji.empmgnt.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee addEmployee(Employee emp) {
		return repository.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}

}
