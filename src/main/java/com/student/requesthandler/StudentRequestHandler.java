package com.student.requesthandler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.response.BaseResponse;
import com.student.service.StudentService;
import com.student.util.Constants;

@Service
public class StudentRequestHandler extends BaseRequestHandler {


	@Autowired
	private StudentService studentService;


	public BaseResponse getStudentById(Long id) {

		if(id == 0) {
			return convertStudentEntityToResponse(Constants.STAUSCODE_103,Constants.INVALID_REQEST, null, null);
		}
		
		Optional<Student> student = studentService.getStudentById(id);
		
		if(!student.isEmpty()) {
			return convertStudentEntityToResponse(Constants.STAUSCODE_200,Constants.SUCCESS, student, null);
		}else {
			return convertStudentEntityToResponse(Constants.STAUSCODE_103,Constants.BAD_OPERATION, null, null);
		}
	}


	public BaseResponse createStudent(Student student) {
		
		if(student == null) {
			return convertStudentEntityToResponse(Constants.STAUSCODE_103,Constants.INVALID_REQEST, null, null);
		}
		
		Student studeList = studentService.createStudent(student);
		
		if(studeList.equals(student)) {
			return convertStudentEntityToResponse(Constants.STAUSCODE_200,Constants.CREATED, studeList, null);
		}else {
			return convertStudentEntityToResponse(Constants.STAUSCODE_103,Constants.BAD_OPERATION, null, null);
		}
	}


	public BaseResponse getStudentList() {
		
		List<Student> studList = studentService.getStudentList();
		
		if(studList.isEmpty()) {
			return convertStudentEntityToResponse(Constants.STAUSCODE_103,Constants.BAD_OPERATION, null, null);
		}else if(studList.size() > 0 ) {
			return convertStudentEntityToResponse(Constants.STAUSCODE_200,Constants.SUCCESS, null, studList);
		}else {
			return convertStudentEntityToResponse(Constants.STAUSCODE_103,Constants.BAD_OPERATION, null, null);
		}
		
	}


	public BaseResponse StudentdeleteByid(Long id) {
		
		if(id.intValue() < 0 ) {
			return convertStudentEntityToResponse(Constants.STAUSCODE_103,Constants.INVALID_REQEST, null, null);
		}
		
		Boolean isDeleted = studentService.StudentdeleteByid(id);
		
		if(isDeleted) {
			return convertStudentEntityToResponse(Constants.STAUSCODE_200,Constants.DELETE, null, null);
		}else {
			return convertStudentEntityToResponse(Constants.STAUSCODE_200,Constants.BAD_OPERATION, null, null);
		}
	}


	public BaseResponse updateStudent(Student student) {
		
		if(student == null) {
			return convertStudentEntityToResponse(Constants.STAUSCODE_103,Constants.INVALID_REQEST, null, null);
		}
		
		Boolean isupdated = studentService.updateStudent(student);
		
		if(isupdated) {
			return convertStudentEntityToResponse(Constants.STAUSCODE_200,Constants.UPDATE, null, null);
		}else {
			return convertStudentEntityToResponse(Constants.STAUSCODE_200,"Student Id Not Found", null, null);
		}
	}
}
