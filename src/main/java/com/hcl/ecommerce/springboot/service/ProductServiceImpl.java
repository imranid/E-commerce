package com.hcl.ecommerce.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ecommerce.springboot.dto.CatagoryRequest;
import com.hcl.ecommerce.springboot.dto.ProductRequest;
import com.hcl.ecommerce.springboot.dto.ResponseDto;
import com.hcl.ecommerce.springboot.entity.Category;
import com.hcl.ecommerce.springboot.entity.Product;
import com.hcl.ecommerce.springboot.repository.CatagoryRepository;
import com.hcl.ecommerce.springboot.repository.ProductRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	UtilityService utilityService;
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CatagoryRepository CatagoryRepository;

	@Override
	public ResponseDto saveProduct(ProductRequest productRequest) {
		Product product = utilityService.convertUserDtoToEntity(productRequest);
		Optional<Category> findByIdCatagory = CatagoryRepository.findById(productRequest.getCatagoryId());
		product.setCategory(findByIdCatagory.get());
		//product.setTotalPrice(product.getProduct_price() * product.getQuantity());
		productRepository.save(product);
		return utilityService.responseDto("Product has been saved");
		
	}

	@Override
	public List<Product> searchProductByName(String productName) {
		 List<Product> productByName = productRepository.getListOfProductByNameLike(productName);
		return productByName;
	}

	@Override
	public ResponseDto saveCategory(CatagoryRequest catRequest) {
		Category catgoryEntity= utilityService.convertCatagoryRequestToCatogoryEntity(catRequest);
		CatagoryRepository.save(catgoryEntity);
		return utilityService.responseDto("Catagory has been created");
	}
}
