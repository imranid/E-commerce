package com.hcl.training.dto;

import java.util.Date;

public class TrainingRequestDto {
	private String training_name;
	private Integer course_id;
	private Date start_date;
	private Date end_date;
	
	public String getTraining_name() {
		return training_name;
	}
	public void setTraining_name(String training_name) {
		this.training_name = training_name;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}


}
