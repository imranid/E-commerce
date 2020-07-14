package com.hcl.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.client.EmployeeTrainingClient;
import com.hcl.training.dto.EmployeeEnroll;
import com.hcl.training.dto.TrainingRequestDto;
import com.hcl.training.entity.Training;
import com.hcl.training.service.TrainingService;

@RestController
@RequestMapping(value="/trainingService")
public class EmployeeTrainingController {
	
	@Autowired
	TrainingService trainingService;
	
	@Autowired
	EmployeeTrainingClient etc;
	
	
	@PostMapping("/saveTrainingInfo")
	public String saveTraningInfo(@RequestBody TrainingRequestDto trainingRequestDto) {
		String saveTraaingInfoToDb = trainingService.saveTraaingInfoToDb(trainingRequestDto);
		return saveTraaingInfoToDb;
	}
		
	@GetMapping("/{courseName}")
	public List<Training> getlistOfCourseByName(@PathVariable String courseName){
		List<Training> courseByName = trainingService.getCourseByName(courseName);
		return courseByName;
	}
	
	@PostMapping("/enrollEmployeeCourse")
	public String saveEmployeeEnrollingCourse(@RequestBody EmployeeEnroll  employeeEnroll) {
		//Employee employeeById = employeeTrainingClient.getEmployeeById(employeeEnroll.getEmpId().toString());
		System.out.println("xyz");
		return new String ("Sucess");
	}
		
	}


