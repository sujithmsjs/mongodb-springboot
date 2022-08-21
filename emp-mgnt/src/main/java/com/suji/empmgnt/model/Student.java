
package com.suji.empmgnt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "students")
public class Student {

	@Id
	private int id;

	private String name;
	private String email;
	private int marks;
	private double cgpa;
}
