package net.ap.security6.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.ap.security6.model.Student;

@RestController
public class StudentController {
	
	@GetMapping("/students")
	public List<Student> students(){
		List<Student> students = new ArrayList<>();
		Student s1 =new Student();
		s1.setId(1);
		s1.setFirstName("Ashish");
		s1.setLastName("Poudel");
		
		Student s2 =new Student();
		s1.setId(1);
		s1.setFirstName("Ashmita");
		s1.setLastName("Poudel");
		
		
		students.add(s1);
		students.add(s2);
		
		return students;
	}
	
	@PostMapping("/post")
	public Student createStudent(@RequestBody Student student) {
		student.add(student);
		return student;
	}
}
