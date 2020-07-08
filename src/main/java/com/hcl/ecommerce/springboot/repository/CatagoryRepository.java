package com.hcl.ecommerce.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ecommerce.springboot.entity.Category;

public interface CatagoryRepository extends JpaRepository<Category, Integer> {

}
