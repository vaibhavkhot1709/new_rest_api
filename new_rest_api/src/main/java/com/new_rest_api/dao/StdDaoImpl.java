package com.new_rest_api.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.new_rest_api.exception.InvaliStudentException;
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

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public Student getStudentById(int roll) throws InvaliStudentException {

//		Student s=repository.getById(roll);// error bcz give list of students use findby id method .get
//		return s;
//		Student s=repository.findById(roll).get();
//		return repository.findById(roll).get();

//		========================================================

		List<Student> st = repository.findAll();
		Student std = repository.findById(roll).get();
		System.out.println("okk");
		if (st.contains(std))
			return std;
		else
			throw new InvaliStudentException("student is not present by roll :" + roll + " enter valid student");

	}

	@Override
	public Student updateById(int roll) {

		Student s = repository.findById(roll).get();
		Student s1 = new Student();

//		repository.getById(s1.getRoll());
		repository.findById(s1.getRoll());
		return s1;
	}

	@Override
	public void deleteStudent(Student student) {

		Student std = repository.findById(student.getRoll()).get();
//		Student student2 = repository.findAll().get(0)
		repository.delete(std);
	}

	@Override
	public void deleteById(int roll) throws InvaliStudentException {

		Student std = repository.findById(roll).get();

		try {
			if (std != null)
				repository.deleteById(roll);
		} catch (Exception e) {

			throw new InvaliStudentException("student is not present by roll :" + roll + " enter valid student");
		}
	}
}
