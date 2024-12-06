package com.student.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;
import com.student.view.StudentView;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_class")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(StudentView.GetStudentView.class)
	private long studentId;

	@Column(name = "student_name")
	@JsonView(StudentView.GetStudentView.class)
	private String studentName;

	@Column(name = "studentRoll_No")
	@JsonView(StudentView.GetStudentView.class)
	private String studentRollNo;

	@Column(name = "Student_class")
	@JsonView(StudentView.GetStudentView.class)
	private String studentClass;

	@Column(name = "Student_age")
	@JsonView(StudentView.GetStudentView.class)
	private String studentAge;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

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
}
