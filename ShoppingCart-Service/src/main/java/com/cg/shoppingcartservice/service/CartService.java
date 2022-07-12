package com.cg.shoppingcartservice.service;

import java.util.List;
import java.util.Optional;

import com.cg.shoppingcartservice.model.Cart;

public interface CartService {
	public List<Cart> getAllCartItems();
	public double cartTotal(Cart cart);
	public void addCart(Cart cart);
	

	

}
