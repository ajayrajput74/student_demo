package com.student.controllerimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.student.controller.StudentController;
import com.student.entity.Student;
import com.student.requesthandler.StudentRequestHandler;
import com.student.response.BaseResponse;
import com.student.view.StudentView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/Student")
public class StudentControllerImpl implements StudentController {
	
	@Autowired
	private StudentRequestHandler studentRequestHandler;

	@Override
	@JsonView(StudentView.GetStudentView.class)
	@RequestMapping(value = "getStudentById" , method = RequestMethod.GET)
	@ResponseStatus(code = HttpStatus.OK)
	public BaseResponse getStudentById(@RequestParam(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("student id");
		return studentRequestHandler.getStudentById(id);
	}

	@Override
	@JsonView(StudentView.GetStudentView.class)
	@RequestMapping(value = "getStudentList" , method = RequestMethod.GET)
	@ResponseStatus(code = HttpStatus.OK)
	public BaseResponse getStudentList(HttpServletRequest request, HttpServletResponse response) {
		return studentRequestHandler.getStudentList();
	}

	@Override
	@JsonView(StudentView.GetStudentView.class)
	@RequestMapping(value = "CreateStudent" , method = RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	public BaseResponse createStudent(@RequestBody Student student  , HttpServletRequest request, HttpServletResponse response) {
		System.out.println("values "+student.toString());
		return studentRequestHandler.createStudent(student);
	}

	@Override
	@JsonView(StudentView.GetStudentView.class)
	@RequestMapping(value = "deleteStudentById" ,method = RequestMethod.DELETE)
	@ResponseStatus(code = HttpStatus.OK)
	public BaseResponse StudentdeleteByid(@RequestParam(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) {
		return studentRequestHandler.StudentdeleteByid(id);
	}

	@Override
	@JsonView(StudentView.GetStudentView.class)
	@RequestMapping(value = "updateStudent" ,method = RequestMethod.PUT)
	@ResponseStatus(code = HttpStatus.CREATED)
	public BaseResponse updateStudent(@RequestBody Student student, HttpServletRequest request, HttpServletResponse response) {
		
		return studentRequestHandler.updateStudent(student);
	}
}
