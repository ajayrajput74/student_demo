package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	@Query(value = "SELECT * FROM student_class s WHERE s.student_name=:name", nativeQuery = true)
	public Student getStudentByName(@Param("name")String name);

}
