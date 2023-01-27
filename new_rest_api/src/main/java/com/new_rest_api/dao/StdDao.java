package com.new_rest_api.dao;

import java.util.List;

import com.new_rest_api.exception.InvaliStudentException;
import com.new_rest_api.model.Student;

public interface StdDao {

	public Student createStudent(Student student);

	public List<Student> getAllStudents();

	public Student getStudentById(int roll) throws InvaliStudentException;

	public Student updateById(Student student);

	public void deleteStudent(Student student);

	public void deleteById(int roll) throws InvaliStudentException;
	
}
