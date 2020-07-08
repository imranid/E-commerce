package com.hcl.ecommerce.springboot.service;

import com.hcl.ecommerce.springboot.dto.ProductBuy;
import com.hcl.ecommerce.springboot.dto.ResponseDto;
import com.hcl.ecommerce.springboot.dto.UserRequest;

public interface UserService {

	public ResponseDto saveUser(UserRequest userrequest);
	
	public ResponseDto  saveProductByuser(ProductBuy productBuy);
	
	
}
