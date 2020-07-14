package com.hcl.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.employee.entity.Employee;
import com.hcl.employee.repository.EmployeeRepository;
import com.hcl.employee.service.EmployeeService;

@RestController
@RequestMapping(value="/employees")
public class EmployeController {
	
@Autowired
EmployeeService employeeService;
	
    @RequestMapping(method = RequestMethod.GET)
	public Employee getEmployeeByName(@RequestParam(value="employeeName") String employeeName) {
		return employeeService.getEmployeeByName(employeeName);	
	}
	
	@GetMapping("/{employeeId}")
	public Employee getEmployeeById(@PathVariable String employeeId) {
		return employeeService.getEmployeeById(Integer.parseInt(employeeId));	
	}

}
