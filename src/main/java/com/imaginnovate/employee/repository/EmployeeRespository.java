package com.imaginnovate.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imaginnovate.employee.entity.Employee;

@Repository
public interface EmployeeRespository extends CrudRepository<Employee, Integer>{

}
