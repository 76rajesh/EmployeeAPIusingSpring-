package com.full.employeeSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(name="name")
	String name;
	
	@Column(name="location")
	String location;
	
	@Column(name="emailid")
	String emailId;
	
	@Column(name="mobileno")
	String mobileno;
	
	public Employee() {
		
	}
   
	public Employee(long id, String name, String location, String emailId, String mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.emailId = emailId;
		this.mobileno = mobileno;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	

}
