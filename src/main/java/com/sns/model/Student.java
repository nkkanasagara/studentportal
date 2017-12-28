package com.sns.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	/*@Id
	private String id;*/
	
	@Id
	@Column
	private int studentRoleNo;
	
	@Column
	private String studentName;
	
	@Column
	private String studentEmail;
	
	@Column
	private String studentBranch;
	
	/*public Student() {
		super();
		id = UUID.randomUUID().toString();
		
	}*/
	
	/*public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}*/
	public int getStudentRoleNo() {
		return studentRoleNo;
	}
	public void setStudentRoleNo(int studentRoleNo) {
		this.studentRoleNo = studentRoleNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	

}
