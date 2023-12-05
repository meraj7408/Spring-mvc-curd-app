package com.java.mvc.proj.dao;

import java.util.List;

import com.java.mvc.proj.model.Student;


public interface StudentDao {

	Student getStudent(Long id);

	Long saveStudent(Student st);

	List<Student> listAllStudents();

	void updateStudent(Student st);

	void deleteStudent(Student st);

}
