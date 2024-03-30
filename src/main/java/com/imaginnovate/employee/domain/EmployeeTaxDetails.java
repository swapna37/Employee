package com.imaginnovate.employee.domain;

public class EmployeeTaxDetails{

	private double taxAmount;
	private double cessAmount;
	private EmployeeDto empDetails;
	
	

	public EmployeeDto getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(EmployeeDto empDetails) {
		this.empDetails = empDetails;
	}
	
	public double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public double getCessAmount() {
		return cessAmount;
	}
	public void setCessAmount(double cessAmount) {
		this.cessAmount = cessAmount;
	}
	
	
}
