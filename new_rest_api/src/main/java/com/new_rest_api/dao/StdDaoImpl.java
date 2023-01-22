package com.new_rest_api.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.new_rest_api.model.Student;
import com.new_rest_api.repository.StdRepository;

@Repository
public class StdDaoImpl implements StdDao {

	@Autowired
	StdRepository repository;
	
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}
}
