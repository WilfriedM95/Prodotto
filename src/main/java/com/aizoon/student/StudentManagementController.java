package com.aizoon.student;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {
	private static final List<Student> STUDENTS=Arrays.asList(
			new Student(1,"james bond"),	
		new Student(2,"Maria"),
		new Student(3,"Anna smith")	
			);
	
	  

}
