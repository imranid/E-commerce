package com.hcl.ecommerce.springboot.service;

import java.util.List;

import com.hcl.ecommerce.springboot.dto.CatagoryRequest;
import com.hcl.ecommerce.springboot.dto.ProductRequest;
import com.hcl.ecommerce.springboot.dto.ResponseDto;
import com.hcl.ecommerce.springboot.entity.Category;
import com.hcl.ecommerce.springboot.entity.Product;

public interface ProductService {
	public ResponseDto saveProduct(ProductRequest productRequest);
	
	List<Product> searchProductByName(String Name);
	
    ResponseDto saveCategory(CatagoryRequest catRequest);

}
