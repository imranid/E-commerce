package com.hcl.training.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.training.dto.TrainingRequestDto;
import com.hcl.training.entity.Training;
import com.hcl.training.repository.TrainingRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class TraningServiceImpl implements TrainingService{
	
	@Autowired
	TrainingRepository trainingRepository;

	@Override
	public String saveTraaingInfoToDb(TrainingRequestDto trainingRequestDto) {
		Training training=new Training();
		BeanUtils.copyProperties(trainingRequestDto, training);
		trainingRepository.save(training);
		return new String ("success");
	}

	@Override
	public List<Training> getCourseByName(String courseName) {
		List<Training> findByCourseName = trainingRepository.findByCourseName(courseName);
		return findByCourseName;
	}

}
