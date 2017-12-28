package com.sns.bo;

import java.util.List;

import com.sns.model.Student;

public interface StudentBO {
	
	Student createStudent(Student student);
	
	Student getStudentByID(int id);
	
	List<Student> getStudentList();

	Student updateStudent(Student student, int id);

	void deleteStudent(int id);

	void deleteAllStudents();

}
