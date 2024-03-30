package com.imaginnovate.employee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.employee.domain.EmployeeDto;
import com.imaginnovate.employee.domain.EmployeeTaxDetails;
import com.imaginnovate.employee.entity.Employee;
import com.imaginnovate.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeResource {
	@Autowired
	EmployeeService empService;

	@PostMapping("/employee")
	public ResponseEntity<EmployeeDto> createEmployee(@Valid @RequestBody EmployeeDto emp) {

		return new ResponseEntity<EmployeeDto>(empService.saveEmployee(emp), HttpStatus.OK);

	}
	
	@PostMapping("/employee/tax")
	public ResponseEntity<EmployeeTaxDetails> calculateTax(@Valid @RequestBody EmployeeDto emp) {

		return new ResponseEntity<EmployeeTaxDetails>(empService.calculateTax(emp), HttpStatus.OK);

	}

	@GetMapping("/employee/{empId}")
	public ResponseEntity<Employee> fetchEmployee(@PathVariable int empId) {

		return new ResponseEntity<Employee>(empService.fetchEmployee(empId), HttpStatus.OK);

	}
}
