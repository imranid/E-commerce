package com.hcl.ecommerce.springboot.service;

import java.util.List;

import com.hcl.ecommerce.springboot.dto.ProductBuy;
import com.hcl.ecommerce.springboot.dto.ResponseDto;
import com.hcl.ecommerce.springboot.dto.UserOrderDetail;
import com.hcl.ecommerce.springboot.dto.UserRequest;
import com.hcl.ecommerce.springboot.entity.ProductOrder;

public interface UserService {

	public ResponseDto saveUser(UserRequest userrequest);
	
	public ResponseDto  saveProductByuser(ProductBuy productBuy);
	
	public UserOrderDetail getListOfOrderByUser(Integer userId);
	
	
}
