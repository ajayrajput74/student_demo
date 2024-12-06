package com.student.request;

public class StudentRequest {
	
	private long studentId;
	
	private String studentName;
	
	private String studentRollNo;
	
	private String studentClass;
	
	private String studentAge;

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "StudentRequest [studentId=" + studentId + ", studentName=" + studentName + ", studentRollNo="
				+ studentRollNo + ", studentClass=" + studentClass + ", studentAge=" + studentAge + "]";
	}
	
	
}
