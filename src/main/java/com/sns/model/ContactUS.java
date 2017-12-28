package com.sns.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "contactus")
// @NamedQueries({
// @NamedQuery(name="ContactUS.getDetails",query= "SELECT c FROM ContactUS c")
// })
public class ContactUS {
	
	@Id
	private String id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String subject;
	
	@Column
	private String message;

	public ContactUS() {
		super();
		id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
