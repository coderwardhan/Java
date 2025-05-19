package com.example.CRUD.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.CRUD.model.Student;

@Service
public interface StudentService {

	public Student create(Student student);

	public List<Student> showAllStudent();

	public List<Student> showByCompanyAndName(String company, String name);

	public Student update(Student student);
	
	public String deleteStudent(Integer id);
	
	

}
