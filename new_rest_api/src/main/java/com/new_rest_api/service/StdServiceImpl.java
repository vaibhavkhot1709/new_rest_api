package com.new_rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.new_rest_api.dao.StdDao;
import com.new_rest_api.model.Student;

@Service
public class StdServiceImpl implements StdService {

	@Autowired
	StdDao dao;
	@Override
	public Student createStudent(Student student) {
		return dao.createStudent(student);
	}

}
