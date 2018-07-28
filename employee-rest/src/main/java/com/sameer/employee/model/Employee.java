package com.sameer.employee.model;

import javax.persistence.*;
@Entity
@Table(name = "employee")
public class Employee {

	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;

	public Employee() {
		super();
	}

	public Employee(String id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
