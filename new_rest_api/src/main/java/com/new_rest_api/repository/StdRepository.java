package com.new_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.new_rest_api.model.Student;

//@EnableJpaRepositories
//@Repository
public interface StdRepository extends JpaRepository<Student, Integer>{

}
