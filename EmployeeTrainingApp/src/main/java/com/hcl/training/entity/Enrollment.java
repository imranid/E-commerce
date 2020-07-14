package com.hcl.training.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enrollment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer enrollment_id;
	private Integer employee_id;
	private Integer training_id;
	
	public Enrollment() {
		
	}
	public Integer getEnrollment_id() {
		return enrollment_id;
	}
	public void setEnrollment_id(Integer enrollment_id) {
		this.enrollment_id = enrollment_id;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public Integer getTraining_id() {
		return training_id;
	}
	public void setTraining_id(Integer training_id) {
		this.training_id = training_id;
	}


}
