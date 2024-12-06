package com.student.controller;

import com.student.entity.Student;
import com.student.response.BaseResponse;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface StudentController {
	
	public BaseResponse getStudentById(Long id , HttpServletRequest request , HttpServletResponse response);
	
	public BaseResponse getStudentList(HttpServletRequest request , HttpServletResponse response);
	
	public BaseResponse createStudent(Student student , HttpServletRequest request , HttpServletResponse response);
	
	public BaseResponse StudentdeleteByid(Long id, HttpServletRequest request , HttpServletResponse response);
	
	public BaseResponse updateStudent(Student student , HttpServletRequest request , HttpServletResponse response);

}
