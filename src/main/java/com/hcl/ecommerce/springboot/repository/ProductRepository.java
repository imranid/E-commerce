
package com.hcl.ecommerce.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.hcl.ecommerce.springboot.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	//@Query("from Account u where u.accountNumber=:accountNumber")
	//Account findByAccountNumber(@Param("accountNumber") Long accountNumber);

	@Query("from Product p where p.product_name like %:productName%")
	List<Product> getListOfProductByNameLike(String productName);
	
	@Query("from Product p where p.product_name=productName")
	Product getProductByName(String productName);

}
