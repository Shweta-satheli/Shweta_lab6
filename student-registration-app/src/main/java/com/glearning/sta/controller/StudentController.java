package com.glearning.sta.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.glearning.sta.model.Student;
import com.glearning.sta.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class StudentController {
public StudentController(StudentService StudentService) {
	}
	
	@Autowired
	private StudentService studentservice;
		
	@GetMapping
	public List<student> viewAllStudents(){
		return (List<student>) studentservice.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public List<com.glearning.sta.entity.Student> getStudentbyId(@PathVariable long id) {
		return studentservice.getAllStudents();
	}
	
	@PostMapping
	public Student createStudents(@RequestBody Student students) {
		return studentservice.saveStudent(students);
	}
	
	@PutMapping("{/id}")
	public com.glearning.sta.entity.Student updateStudent(@RequestBody Student student, @PathVariable long id) {
		return studentservice.updateStudent(student, id);
	}
	
	@DeleteMapping("{/id}")
	public void deleteStudentById(@PathVariable long id) {
		studentservice.deleteStuden(id);
		}
	}

