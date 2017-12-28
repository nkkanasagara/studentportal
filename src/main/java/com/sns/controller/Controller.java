package com.sns.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sns.bo.StudentBO;
import com.sns.bo.StudentBOImpl;
import com.sns.model.Student;
import com.sns.model.StudentList;

/*package com.sns.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.web.bind.WebDataBinder;
// import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sns.bo.ContactUsBO;
import com.sns.bo.SubscribeBO;
import com.sns.model.ContactUS;
import com.sns.model.Subscribe;
// import com.sns.validate.PolicyValidator;

@Component
@RestController
public class Controller {

	@Autowired
	private ContactUsBO contactusbo;
	@Autowired
	private SubscribeBO subscribebo;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    binder.setValidator(new PolicyValidator());
	}
	
	@RequestMapping(value = "/contactus/userMessage", method = RequestMethod.POST)
	@ResponseBody public ContactUS setDetails(@Valid @RequestBody ContactUS contactUs) {
		return contactusbo.setDetails(contactUs);
	}
	
	@RequestMapping(value = "/subscribe", method = RequestMethod.POST)
	@ResponseBody public Subscribe subscribe(@RequestBody Subscribe subscribe) {
		return subscribebo.subscribe(subscribe);
	}
}*/


@RestController
public class Controller {
	
	@Autowired
	public StudentBO studentBO;
	
	// POST method to create a new student
	@RequestMapping(value = "api/students", method = RequestMethod.POST)
	@ResponseBody public Student createStudent(@RequestBody Student student) {
		return studentBO.createStudent(student);
		
	}
	
	// GET method to get a student based of Role No
	@RequestMapping(value = "api/students/{id}", method = RequestMethod.GET)
	@ResponseBody public Student getStudentByID(@RequestBody @PathVariable("id") int id) {
		System.out.println("c entered"+id);
		//Student student = studentBO.getStudentByID(id);
		
		return studentBO.getStudentByID(id);
		
		/*if (student == null) {
            System.out.println("Student with id " + id + " not found");
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Student>(student, HttpStatus.OK);*/
		
	} 
	
	// GET method to get list of students
	@RequestMapping(value = "api/students", method = RequestMethod.GET)
	@ResponseBody public StudentList getStudentList() {
		List<Student> students = studentBO.getStudentList();
		StudentList studentList = new StudentList();
	    studentList.setStudents(students);
		return studentList;
  /*	@ResponseBody public ResponseEntity<List<Student>> getStudentList() {
		    System.out.println("entered in Controller");
	        List<Student> students = studentBO.getStudentList();
	        System.out.println("came back to Controller");
	        for(Student s : students) {
	        	System.out.println(s.getStudentName());
	        }
	        return new ResponseEntity<List<Student>>(students, HttpStatus.OK);*/
	       
}
	
	@RequestMapping(value="api/students/{id}", method = RequestMethod.PUT)
	@ResponseBody public Student updateStudent(@RequestBody Student student, @PathVariable("id") int id) {
		return studentBO.updateStudent(student, id);
	}
	
	@RequestMapping(value="api/students/{id}", method = RequestMethod.DELETE)
	@ResponseBody public void deleteStudent(@RequestBody @PathVariable("id") int id) {
		System.out.println("delete controller");
		studentBO.deleteStudent(id);
	}
	
	@RequestMapping(value ="/api/students/", method = RequestMethod.DELETE)
	public void deleteAllStudents() {
		studentBO.deleteAllStudents();
	}
	
	
}


