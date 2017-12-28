package com.sns.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@PersistenceContext
	@Autowired
	private EntityManager entityManager;
	
	private static List<Student> students;
	
	@Override
	public Student createStudent(Student student) {
		
		entityManager.persist(student);
		return student;
	}

	@Override
	public Student getStudentByID(int id) {
		System.out.println("d entered"+id);
		
		students = entityManager.createQuery("FROM Student").getResultList();
		for(Student s : students) {
	    	System.out.println(s.getStudentRoleNo());
	    }
		System.out.println(id);
		for(Student student : students){
			if(student.getStudentRoleNo() == id){
                return student;
            }
		}
		return null;
	}

	@Override
	public List<Student> getStudentList() {
		
		System.out.println("StudentDAOImpl entered");
	    students = entityManager.createQuery("FROM Student").getResultList();
	    for(Student s : students) {
	    	System.out.println(s.getStudentName());
	    }
        return students;
	}

	@Override
	public Student updateStudent(Student student, int id) {
		entityManager.persist(student);
		
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		
		Student student = getStudentByID(id);
	//	students.remove(student);
		entityManager.remove(student);
		
		/*students = entityManager.createQuery("FROM Student").getResultList();
		for(Iterator<Student> iterator = students.iterator(); iterator.hasNext();) {
			Student student = iterator.next();
			if(student.getStudentRoleNo() == id) {
				iterator.remove();
			}
		}*/
		
		/*System.out.println("delete DAO "+id);
		for(Student s1 : students) {
			if(s1.getStudentRoleNo() == id) {
				entityManager.remove(s1);
			}
		}
	//	entityManager.persist(student);
		*/
	}

	@Override
	public void deleteAllStudents() {
		
		students = entityManager.createQuery("FROM Student").getResultList();
		for (Iterator i = students.iterator(); i.hasNext();) {
			  Student student = (Student)i.next();
			  entityManager.remove(student);
			}
	}

}
