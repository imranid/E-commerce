package com.hcl.ecommerce.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ecommerce.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	

}
