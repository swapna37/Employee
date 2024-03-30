package com.imaginnovate.employee.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.imaginnovate.employee.domain.EmployeeDto;
import com.imaginnovate.employee.domain.EmployeeTaxDetails;
import com.imaginnovate.employee.entity.Employee;
import com.imaginnovate.employee.exceptionhandler.EmployeeException;
import com.imaginnovate.employee.repository.EmployeeRespository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRespository empRepository;
	
	@Autowired
	ObjectMapper mapper;
	
	public EmployeeDto saveEmployee(EmployeeDto emp) {
		Employee empENtity=new Employee(emp.getEmployeeId(),emp.getFirstName(),emp.getLastName(),emp.getEmail(),emp.getPhoneNumber(),emp.getDoj(),emp.getSalary());
		
		 empENtity=empRepository.save(empENtity); 
		 emp=mapper.convertValue(empENtity, EmployeeDto.class);
		System.out.println(empENtity.toString()+" data:::"+empENtity.getEmployeeId());
		return emp;
		
	}

	public Employee fetchEmployee(int emp) {
		// TODO Auto-generated method stub
		return empRepository.findById(emp)
				.orElseThrow(() -> new EmployeeException("NO Employee PRESENT WITH ID = " + emp));
	}

	public EmployeeTaxDetails calculateTax(@Valid EmployeeDto emp) {
		// TODO Auto-generated method stub
		EmployeeTaxDetails taxDetails=new EmployeeTaxDetails();
		
		Employee employeeDetails = fetchEmployee(emp.getEmployeeId());
		if(employeeDetails!=null) {
			taxDetails.setEmpDetails(mapper.convertValue(employeeDetails, EmployeeDto.class));
			taxDetails.setTaxAmount(fetchTaxAmount(emp.getSalary()));
			if(emp.getSalary()>2500000) {
				taxDetails.setCessAmount((0.02)*emp.getSalary());
			}else {
				taxDetails.setCessAmount(0);
			}
		}
		
		return taxDetails;
	}
	

	    private  double fetchTaxAmount(double salary) {
			// TODO Auto-generated method stub
	        if (salary <= 700000) {
	            return 0;
	        }
	        if (salary <= 750000) {
	            return (250000 * 0.05) + (salary - 500000) * 0.1;
	        }
	        if (salary <= 1000000) {
	            return (250000 * 0.05) + (250000 * 0.10) + (salary - 750000) * 0.15;
	        }
	        if (salary <= 1250000) {
	            return (250000 * 0.05) + (250000 * 0.10) + (250000 * 0.15) + (salary - 1000000) * 0.2;
	        }
	        if (salary <= 1500000) {
	            return (250000 * 0.05) + (250000 * 0.10) + (250000 * 0.15) + (250000 * 0.2) + (salary - 1250000) * 0.25;
	        }
	        return (250000 * 0.05) + (250000 * 0.10) + (250000 * 0.15) + (250000 * 0.2) + (250000 * 0.25) + (salary - 1500000) * 0.3;
	    }

	

}
