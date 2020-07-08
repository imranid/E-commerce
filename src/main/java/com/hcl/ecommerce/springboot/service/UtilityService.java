package com.hcl.ecommerce.springboot.service;


import com.hcl.ecommerce.springboot.dto.CatagoryRequest;
import com.hcl.ecommerce.springboot.dto.ProductRequest;
import com.hcl.ecommerce.springboot.dto.ResponseDto;
import com.hcl.ecommerce.springboot.dto.UserRequest;
import com.hcl.ecommerce.springboot.entity.Category;
import com.hcl.ecommerce.springboot.entity.Product;
import com.hcl.ecommerce.springboot.entity.User;

public interface UtilityService {

	public Product convertUserDtoToEntity(ProductRequest userRequest);
	
	public User convertUserDtoToEntity(UserRequest userRequest);

	public ResponseDto responseDto(String message);
	
	public Category convertCatagoryRequestToCatogoryEntity(CatagoryRequest catRequest);
}
