package com.truyum.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.truyum.model.MenuItem;

@Component
public interface MenuItemDao {
	
	List<MenuItem> getMenuItemsAdmin();
	List<MenuItem> getMenuItemsCustomer();
	
}
