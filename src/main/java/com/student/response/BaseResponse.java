package com.student.response;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import com.student.view.BaseView;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@JsonView(BaseView.class)
	private Integer statusCode;
	
	@JsonView(BaseView.class)
	private String responseMessage;
	
	@JsonView(BaseView.class)
	private LocalDateTime timeStamp;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
}
