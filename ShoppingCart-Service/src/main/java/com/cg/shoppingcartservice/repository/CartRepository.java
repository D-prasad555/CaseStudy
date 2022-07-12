package com.cg.shoppingcartservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.shoppingcartservice.model.Cart;

public interface CartRepository extends MongoRepository<Cart,Integer> {
	

}
