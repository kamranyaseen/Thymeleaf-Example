package com.kamranyaseen;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	@Column(name = "firstName",length = 45)
	public String firstName;
	
	@Column(name = "lastName",length = 45)
	public String lastName;
	
	@Column(name = "email",length = 45)
	public String email;
	
	public Student(){
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	public String getemail() {
		return email;
	}
	
	public Student(String firstName,String lastName,String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
}
