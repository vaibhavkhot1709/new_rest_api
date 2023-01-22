package com.new_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.new_rest_api.exception.InvaliStudentException;
import com.new_rest_api.model.Student;
import com.new_rest_api.service.StdService;

@RestController
public class NewRestController {

	@Autowired
	StdService service;
	
	@GetMapping("/hello")
	public String hello() {
		
		return "hello";
	}
	
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		
		return service.createStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		
		return service.getAllStudents();
	}
	
	@GetMapping("/student/{roll}")
	public Student getStudentById(@PathVariable("roll") int roll) throws InvaliStudentException {
//		Student std=service. getStudentById(roll);
//		
//		if(null !=std)
//		return std;
//		else 
//			throw new InvaliStudentException("student is not present by roll :"+roll+"/n  enter valid student");
		
		return service. getStudentById(roll);
	}
	
	@PostMapping("/student1")
	public Student updateById(@PathVariable ("roll") int roll) {
		
		return service.updateById(roll);
	}
	
	
	@DeleteMapping("/student12")
	public String deleteStudent(@RequestBody Student student) {
		service.deleteStudent(student);
		return "student deleted succssffully";
	}
	
	
	@DeleteMapping("/student/{roll}")
	public String deleteById(@PathVariable("roll") int roll) {
	
		service.deleteById(roll);
		
		return " successfully deleted";
	}
}
