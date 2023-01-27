package com.new_rest_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.new_rest_api.dao.StdDao;
import com.new_rest_api.exception.InvaliStudentException;
import com.new_rest_api.model.Student;

@Service
public class StdServiceImpl implements StdService {

	@Autowired
	StdDao dao;
	@Override
	public Student createStudent(Student student) {
		return dao.createStudent(student);
	}
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return dao.getAllStudents();
	}
	@Override
	public Student getStudentById(int roll) throws InvaliStudentException {
		// TODO Auto-generated method stub
		return dao.getStudentById(roll);
	}
	@Override
	public Student updateById(Student student) {
		// TODO Auto-generated method stub
		return dao.updateById(student);
	}
	@Override
	public void deleteStudent(Student student) {

		dao.deleteStudent(student);
	}
	@Override
	public void deleteById(int roll) {

		try {
			dao.deleteById(roll);
		} catch (InvaliStudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
