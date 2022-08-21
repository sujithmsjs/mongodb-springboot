package com.suji.empmgnt;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.suji.empmgnt.model.Address;
import com.suji.empmgnt.model.Employee;
import com.suji.empmgnt.model.Gender;
import com.suji.empmgnt.model.Student;
import com.suji.empmgnt.repository.EmployeeRepository;
import com.suji.empmgnt.repository.StudentRepository;

@SpringBootApplication
@EnableMongoRepositories
public class EmpMgntApplication implements ApplicationRunner {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(EmpMgntApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		Student student = new Student(101,"Sujith", "sujithmsjs@gmail.com", 78, 7.3);
		studentRepository.save(student);
		
		
		Address addr = new Address("507123", "Nehru nagar");
		
		Employee e = new Employee(1, "Sujith","IT", 50_000);
		e.setActive(true);
		e.setDateOfJoin(LocalDate.of(2014, 3, 3));
		e.setGender(Gender.MALE);
		e.setAddress(addr);
		e.setLanguages( List.of("Java", "Python", "C++"));
		
		employeeRepository.save(e);
	}

}
