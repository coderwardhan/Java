package com.example.CRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CRUD.model.Student;
import com.example.CRUD.repository.StudentRepository;

@Service
public class ServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentrepository;
	
	@Override
	public Student create(Student student) {
		
		return studentrepository.save(student);
	}

	
	public List<Student> showAllStudent() {

		return studentrepository.findAll();
	}


	
//	public List<Student> showByCompany(String company, String name) {
//		
//		return studentrepository.findByCompanyAndName(company, name);
//	}


	@Override
	public Student update(Student student) {
	
		return studentrepository.save(student);
	}


	
	public List<Student> showByCompanyAndName(String company, String name) {
		// TODO Auto-generated method stub
		return studentrepository.findByCompanyAndName(company, name);
	}


	@Override
	public String deleteStudent(Integer id) {
		studentrepository.deleteById(id);
		return "Deleted Successfully";
	}


}
