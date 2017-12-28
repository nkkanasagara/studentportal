package com.sns.dao;

import java.util.List;

import com.sns.model.Student;

public interface StudentDAO {
	
	Student createStudent(Student student);
	
	Student getStudentByID(int id);
	
	List<Student> getStudentList();
	
	Student updateStudent(Student student, int id);

	void deleteStudent(int id);

	void deleteAllStudents();

}
