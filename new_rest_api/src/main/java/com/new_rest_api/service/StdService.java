package com.new_rest_api.service;

import java.util.List;

import com.new_rest_api.exception.InvaliStudentException;
import com.new_rest_api.model.Student;

public interface StdService {
	
	public Student createStudent(Student student);

	public List<Student> getAllStudents();

	public Student getStudentById(int roll) throws InvaliStudentException;

	public Student updateById(int roll);

	public void deleteStudent(Student student);

	public void deleteById(int roll);


}
