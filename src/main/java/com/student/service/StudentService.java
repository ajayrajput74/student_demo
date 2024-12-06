package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getStudentList() {
		return studentRepository.findAll();
	}

	public Optional<Student> getStudentById(Long id) {
		return studentRepository.findById(id);
	}

	public Boolean StudentdeleteByid(Long id) {

		if(studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
	}

	public Boolean updateStudent(Student student) {

		if(studentRepository.existsById(student.getStudentId())) { 
		    studentRepository.save(student);
		    return true;
		}
		return false;
	} 




}







