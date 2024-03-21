package com.glearning.sta.service;

import java.util.List;

import com.glearning.sta.controller.student;
import com.glearning.sta.entity.Student;

public interface StudentService {
	
	List<Student> getStudents();
	Student createStudent();
	Student updateStudent(com.glearning.sta.model.Student student, long id);
	void deleteStudent();
	List<Student> getAllStudents();
	void deleteStudentById(long theId);
	com.glearning.sta.model.Student saveStudent(com.glearning.sta.model.Student students);
	student getStudentById(long theId);
	Student getStudentById(Long id);
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
	void deleteStuden(long id);


}
