package com.hcl.training.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.training.dto.TrainingRequestDto;
import com.hcl.training.entity.Training;


public interface TrainingService {
	
	public String saveTraaingInfoToDb(TrainingRequestDto trainingRequestDto);
	
	public List<Training> getCourseByName(String courseName);
}

	
	
