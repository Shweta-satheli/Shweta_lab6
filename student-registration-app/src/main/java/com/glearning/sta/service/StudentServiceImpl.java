package com.glearning.sta.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.glearning.sta.entity.Student;
import com.glearning.sta.repository.StudentRepository;


@Service
public abstract class StudentServiceImpl implements StudentService {
	
private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save1(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById1(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}

