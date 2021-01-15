package com.truyum.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.truyum.model.Cart;

@Component
public interface CartDao {

	int save(int id);
	int delete(int id);
	List<Cart> getCartItems(); 
	
}
