package com.hcl.ecommerce.springboot.dto;

public class ProductRequest {
	private String product_name;
	private double product_price;
	private String product_description;
	private Integer quantity;
	private Integer CatagoryId;

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getCatagoryId() {
		return CatagoryId;
	}

	public void setCatagoryId(Integer catagoryId) {
		CatagoryId = catagoryId;
	}

}
