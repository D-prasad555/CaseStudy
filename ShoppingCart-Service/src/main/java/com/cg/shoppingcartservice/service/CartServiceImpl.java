package com.cg.shoppingcartservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.shoppingcartservice.model.Cart;
import com.cg.shoppingcartservice.repository.CartRepository;


@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartRepository cartRepository;




	@Override
	public double cartTotal(Cart cart) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addCart(Cart cart) {
		//TODO Auto-generated method sub
		 cartRepository.save(cart);
	
	}

	@Override
	public List<Cart> getAllCartItems() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}
	
	


}
