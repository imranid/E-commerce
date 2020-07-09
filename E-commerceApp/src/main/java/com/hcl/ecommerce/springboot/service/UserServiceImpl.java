package com.hcl.ecommerce.springboot.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ecommerce.springboot.dto.ProductBuy;
import com.hcl.ecommerce.springboot.dto.ResponseDto;
import com.hcl.ecommerce.springboot.dto.ResponseProductDto;
import com.hcl.ecommerce.springboot.dto.UserOrderDetail;
import com.hcl.ecommerce.springboot.dto.UserRequest;
import com.hcl.ecommerce.springboot.entity.Product;
import com.hcl.ecommerce.springboot.entity.ProductOrder;
import com.hcl.ecommerce.springboot.entity.User;
import com.hcl.ecommerce.springboot.repository.OrderRepository;
import com.hcl.ecommerce.springboot.repository.ProductRepository;
import com.hcl.ecommerce.springboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UtilityService utilityService;

	@Autowired
	UserRepository userRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	OrderRepository orderRepository;

	@Override
	public ResponseDto saveUser(UserRequest userrequest) {
		User userEntity = utilityService.convertUserDtoToEntity(userrequest);
		userRepository.save(userEntity);
		return utilityService.responseDto("Customer created");
	}

	@Override
	public ResponseDto saveProductByuser(ProductBuy productBuy) {
		Optional<Product> productByName = productRepository.findById(productBuy.getProductId());
		Optional<User> findById = userRepository.findById(productBuy.getUserId());
		Double totalQuantity = productBuy.getQuantity() * productByName.get().getProduct_price();
		saveUserOrder(productBuy, productByName, findById);
		return utilityService.responseDto("User Order saved successfully");
	}

	private void saveUserOrder(ProductBuy productBuy, Optional<Product> productByName, Optional<User> findById) {
		ProductOrder productOrder = new ProductOrder();
		productOrder.setOrder_date((new Date()));
		productOrder.setQuantity(productBuy.getQuantity());
		productOrder.setProduct_id(productByName.get().getProduct_id());
		long totaPrice = Math.round(productBuy.getQuantity() * productByName.get().getProduct_price());
		productOrder.setTotal_price(totaPrice);
		productOrder.setUser_id(findById.get().getUser_id());
		orderRepository.save(productOrder);
	}

	@Override
	public UserOrderDetail getListOfOrderByUser(Integer userId) {
		UserOrderDetail userOrderDetail= new UserOrderDetail();
		 List<ProductOrder> productByName = orderRepository.getProductByName(userId);
		 List<ProductOrder> pOrderList= new ArrayList<ProductOrder>();
		 for (ProductOrder productOrder : productByName) {
			if(productOrder.getUser_id().equals(userId)) {
				pOrderList.add(productOrder);
			}
		}
		 userOrderDetail.setUserId(userId);
		 List<Product> productList= new ArrayList<Product>();
		 for (ProductOrder productOrder : pOrderList) {
			Optional<Product> findById = productRepository.findById(productOrder.getProduct_id());
			 productList.add(findById.get());
		}
		 userOrderDetail.setListofProducts(productList);
		return userOrderDetail;
	}
}
