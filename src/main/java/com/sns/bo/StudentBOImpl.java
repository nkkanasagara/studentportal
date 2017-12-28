package com.sns.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sns.dao.StudentDAO;
import com.sns.model.Student;

@Transactional
@Service
public class StudentBOImpl implements StudentBO {

	@Autowired
	private StudentDAO studentDAO;
	
	@Transactional
	@Override
	public Student createStudent(Student student) {
		
		return studentDAO.createStudent(student);
	}
	
//	@Transactional
	@Override
	public Student getStudentByID(int id) {
		System.out.println("b entered");
		return studentDAO.getStudentByID(id);
		
	}

	@Transactional
	@Override
	public List<Student> getStudentList() {
		
		System.out.println("studentBOImpl entered");
		
		return studentDAO.getStudentList();
	}

	public Student updateStudent(Student student, int id) {
		
		Student currentStudent = studentDAO.getStudentByID(id);
		
		currentStudent.setStudentEmail(student.getStudentEmail());
		currentStudent.setStudentBranch(student.getStudentBranch());
		
		
		return studentDAO.updateStudent(currentStudent , id);
	}

	@Override
	public void deleteStudent(int id) {
		System.out.println("delete BO");
		studentDAO.deleteStudent(id);
		
	}

	@Override
	public void deleteAllStudents() {
		studentDAO.deleteAllStudents();
		
	}
	


}
