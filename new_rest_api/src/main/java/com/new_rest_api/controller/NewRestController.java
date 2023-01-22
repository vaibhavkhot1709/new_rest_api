package com.new_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
