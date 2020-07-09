package com.hcl.ecommerce.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ecommerce.springboot.dto.ProductBuy;
import com.hcl.ecommerce.springboot.dto.ResponseDto;
import com.hcl.ecommerce.springboot.dto.UserOrderDetail;
import com.hcl.ecommerce.springboot.dto.UserRequest;
import com.hcl.ecommerce.springboot.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("")
	public ResponseDto registration(@RequestBody UserRequest userRequest) {
		return userService.saveUser(userRequest);
	}
	
	@PostMapping("/buyProduct")
	public ResponseDto buyProduct(@RequestBody ProductBuy productBuy) {
		return userService.saveProductByuser(productBuy);	
	}
	
	@GetMapping("/viewOrder")
	public  UserOrderDetail getlistOfOrder(@RequestParam Integer userId) {
		return userService.getListOfOrderByUser(userId);
		
	}
}
