package com.example.CRUD.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUD.model.Student;
import com.example.CRUD.service.StudentService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api")
public class Controller
{
	
	@Autowired
	StudentService studentsevice;
	
	@PostMapping("/save")
	public ResponseEntity<Map<String, String>> saveStudent(@RequestBody Student student)
	{
		
		studentsevice.create(student);
		Map<String, String> response = new HashMap<>();
		response.put("Message", "Stored Successfully");
		return ResponseEntity.ok(response) ;
		
	}
	
//	@PostMapping("/save")
//	public Student SaveStudent(@RequestBody Student student )
//	{
//		return studentsevice.create(student);
//		
//	}
	
	@GetMapping("/showall")
	public ResponseEntity<List<Student>> showAllStudent()
	{
		List<Student> student = studentsevice.showAllStudent();
		return ResponseEntity.ok(student);
	}
	
	@GetMapping("/show/company/{company}/{name}")
	public ResponseEntity<List<Student>> showByCompany(@PathVariable String company ,@PathVariable String name)
	{
		List<Student> student = studentsevice.showByCompanyAndName(company,name);
		return ResponseEntity.ok(student);
	}
	
	
	@PutMapping("/update")
	public Student updatestudent(@RequestBody Student student) {
		//TODO: process PUT request
		
		return studentsevice.update(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Integer id)
	{
		
		return studentsevice.deleteStudent(id);
	}

}
