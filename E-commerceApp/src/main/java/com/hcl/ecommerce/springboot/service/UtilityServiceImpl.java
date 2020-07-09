package com.hcl.ecommerce.springboot.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.hcl.ecommerce.springboot.dto.CatagoryRequest;
import com.hcl.ecommerce.springboot.dto.ProductRequest;
import com.hcl.ecommerce.springboot.dto.ResponseDto;
import com.hcl.ecommerce.springboot.dto.UserRequest;
import com.hcl.ecommerce.springboot.entity.Category;
import com.hcl.ecommerce.springboot.entity.Product;
import com.hcl.ecommerce.springboot.entity.User;

@Service
public class UtilityServiceImpl implements UtilityService {

	@Override
	public Product convertUserDtoToEntity(ProductRequest userRequest) {
		Product product = new Product();
		BeanUtils.copyProperties(userRequest, product);
		return product;

	}

	@Override
	public ResponseDto responseDto(String message) {
		ResponseDto responseDto = new ResponseDto();
		responseDto.setResponseMessage(message);
		responseDto.setStatusMessage("Success");
		responseDto.setStatusCode(200);
		return responseDto;
	}

	@Override
	public User convertUserDtoToEntity(UserRequest userRequest) {
		User user = new User();
		BeanUtils.copyProperties(userRequest, user);
		return user;
	}

	@Override
	public Category convertCatagoryRequestToCatogoryEntity(CatagoryRequest catRequest) {
		Category catagory = new Category();
		BeanUtils.copyProperties(catRequest, catagory);
		return catagory;
	}

}
