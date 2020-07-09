package com.hcl.ecommerce.springboot.dto;

import java.util.List;

import com.hcl.ecommerce.springboot.entity.Product;

public class UserOrderDetail {
	private int userId;
	
	List<Product> listofProducts;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Product> getListofProducts() {
		return listofProducts;
	}

	public void setListofProducts(List<Product> listofProducts) {
		this.listofProducts = listofProducts;
	}
	

}
