
package com.suji.empmgnt.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document
public class Employee {

	@Id
	private int id;
	private String name;
	private String email;
	private String dept;
	private double salary;
	private Gender gender;
	private LocalDate dateOfJoin;
	private boolean active;
	
	
	private Address address;
	
	private List<String> languages;
	
	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
}
