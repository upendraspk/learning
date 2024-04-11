package controller;

import java.time.LocalDate;

public class StudentModel {
	private String firstName;
	private String lastName;
	private String contact;
	private String gender;
	private LocalDate dob;
	private String subject;
	private String email;
	private String username;
	private String password;
	
	public StudentModel(String firstName, String lastName, String contact, 
			String gender, LocalDate dob,String username,String subject, 
			String email,String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.subject = subject;
		this.username = username;
		this.password = password;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}