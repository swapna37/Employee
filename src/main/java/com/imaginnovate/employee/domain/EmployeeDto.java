package com.imaginnovate.employee.domain;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

public class EmployeeDto {
	
	private Integer employeeId;
	
	@NotEmpty(message = "First Name is Required")
	private String firstName;
	@NotEmpty(message = "Last Name is Required")
	private String lastName;
	@NotEmpty(message = "Email is Required")
	private String email;
	@NotEmpty(message = "Phone Number is Required")
	private String phoneNumber;
	@NotEmpty(message = "Date of Joining is Required")
	private LocalDate doj;
	@NotEmpty(message = "Salary is Required")
	private double salary;
	
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
