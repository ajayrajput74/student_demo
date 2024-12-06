package com.student.requesthandler;

import java.util.Collection;

import com.student.response.BaseResponse;
import com.student.response.StudentResponse;

public class BaseRequestHandler { 

	public BaseResponse convertStudentEntityToResponse(Integer statusCode , String responseMessage , Object object , Collection<?> responseList) {
     
		StudentResponse studentResponse = new StudentResponse();
		
		if(object != null) {
			studentResponse.setResponse(object);
			studentResponse.setResponseMessage(responseMessage);
			studentResponse.setStatusCode(statusCode);
		}else if(responseList != null) {
			studentResponse.setResponseList(responseList);
			studentResponse.setResponseMessage(responseMessage);
			studentResponse.setStatusCode(statusCode);
			
		}else {
			studentResponse.setResponseMessage(responseMessage);
			studentResponse.setStatusCode(statusCode);
		}
		return studentResponse;
	}
}
