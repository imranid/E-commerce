package com.hcl.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.employee.entity.Employee;
import com.hcl.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployeeByName(String empName) {
		return employeeRepository.findByEmployeeName(empName);
	}

	@Override
	public Employee getEmployeeById(Integer empId) {
		 Employee employee = employeeRepository.findById(empId).get();
		return employee;
	}

}
