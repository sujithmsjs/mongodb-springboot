package com.suji.empmgnt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.suji.empmgnt.model.Student;

@Service
public interface StudentService  {
	
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
	public Optional<Student> getStudentById(int id);
	public long getStudentsCount();
	public void deleteEmployeeById(int id);
	
}
