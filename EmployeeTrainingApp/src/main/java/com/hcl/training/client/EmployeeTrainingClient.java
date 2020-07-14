package com.hcl.training.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hcl.training.dto.Employee;

@FeignClient(name="http://EMPLOYEE-SERVICE/employeesapp/employees")
public interface EmployeeTrainingClient {
	

	@GetMapping("/{employeeId}")
	public Employee getEmployeeById(@PathVariable String employeeId);

}
