package com.suji.empmgnt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.suji.empmgnt.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

	
}
