package com.java.mvc.proj.service;

import java.util.List;

import com.java.mvc.proj.model.Student;


public interface StudentService {

	Student getStudent(Long id);

	Long saveStudent(Student st);

	List<Student> listAllStudents();

	void update(Long id, Student st);

	void delete(Long id);

	boolean isStudentUnique(Long id);
}
