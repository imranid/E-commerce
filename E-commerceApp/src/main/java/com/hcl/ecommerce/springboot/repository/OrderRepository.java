package com.hcl.ecommerce.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcl.ecommerce.springboot.entity.Product;
import com.hcl.ecommerce.springboot.entity.ProductOrder;

public interface OrderRepository extends JpaRepository<ProductOrder, Integer> {

	@Query("from ProductOrder p where p.user_id=user_id")
	List<ProductOrder> getProductByName(Integer user_id);

	@Query("from ProductOrder p where p.user_id=user_id")
	ProductOrder getProductByName1(Integer user_id);

}
