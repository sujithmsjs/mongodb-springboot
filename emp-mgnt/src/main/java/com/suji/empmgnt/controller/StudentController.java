package com.suji.empmgnt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.suji.empmgnt.model.Student;
import com.suji.empmgnt.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/students")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping
	public List<Student> getAllEmployees(){
		return service.getAllStudents();
	}
	
	@PostMapping
	public Student saveEmployee(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		Optional<Student> student = service.getStudentById(id);
		return student.orElse(null);
	}
	
	@GetMapping("/count")
	public long getStudentsCount() {
		return service.getStudentsCount();
	}
	
	@PutMapping("/{id}")
	public Student updateStudentById(@PathVariable int id, @RequestBody Student student) {
		
		log.info("Inside updateStudentById({},{})",id, student);
		
		Student dbStudent  = service.getStudentById(id).orElseThrow();
	
		if(student.getEmail() != null) {
			dbStudent.setEmail(student.getEmail());
		}
		
		if(student.getCgpa() > 0.0) {
			dbStudent.setCgpa(student.getCgpa());
		}
		
		if(  student.getMarks() > 0) {
			dbStudent.setMarks(student.getMarks());
		}
		
		if(student.getName() != null) {
			dbStudent.setName(student.getName());
		}
		
		return service.saveStudent(dbStudent);
	}
	
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id){
		 service.deleteEmployeeById(id);
	}
	

}
