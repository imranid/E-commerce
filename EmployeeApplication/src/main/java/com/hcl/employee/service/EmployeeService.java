package com.hcl.employee.service;

import org.springframework.stereotype.Service;

import com.hcl.employee.entity.Employee;


public interface EmployeeService {
	
	public Employee getEmployeeByName(String empName);

	
	public Employee getEmployeeById(Integer empName);
}
