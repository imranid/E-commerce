package com.hcl.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeTrainingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeTrainingAppApplication.class, args);
	}

}
