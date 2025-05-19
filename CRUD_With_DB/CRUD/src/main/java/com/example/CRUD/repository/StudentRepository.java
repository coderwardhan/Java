package com.example.CRUD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CRUD.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByCompanyAndName(String Company,String name);

}
