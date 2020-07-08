package com.hcl.ecommerce.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ecommerce.springboot.dto.CatagoryRequest;
import com.hcl.ecommerce.springboot.dto.ProductRequest;
import com.hcl.ecommerce.springboot.dto.ResponseDto;
import com.hcl.ecommerce.springboot.entity.Category;
import com.hcl.ecommerce.springboot.entity.Product;
import com.hcl.ecommerce.springboot.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService  productService;
	
	@PostMapping("/addProduct")
	public  ResponseDto  saveProduct(@RequestBody ProductRequest productRequest) {
		return productService.saveProduct(productRequest);
		
	}
	
	@GetMapping("/searchByProduct")
	public List<Product> searchByProductName(@RequestParam String productName) {
		 List<Product> searchProductByName = productService.searchProductByName(productName);
		return searchProductByName;
	}
	
	@GetMapping("/getCatagory")
	public Product getAllCatogory() {
		//Product searchProductByName = productService.searchProductByName();
		return null;
	}
	
	@PostMapping("/addProductCatagory")
	public ResponseDto addCatogory(@RequestBody CatagoryRequest catagoryRequest) {
		return productService.saveCategory(catagoryRequest);
	}
}
