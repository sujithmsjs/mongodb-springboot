package com.suji.empmgnt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suji.empmgnt.model.Employee;
import com.suji.empmgnt.model.Student;
import com.suji.empmgnt.repository.EmployeeRepository;
import com.suji.empmgnt.repository.StudentRepository;
import com.suji.empmgnt.service.EmployeeService;
import com.suji.empmgnt.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		return repository.findById(id);
	}
	
	@Override
	public long getStudentsCount() {
		return repository.count();
	}

	@Override
	public void deleteEmployeeById(int id) {
		repository.deleteById(id);
	}

}
