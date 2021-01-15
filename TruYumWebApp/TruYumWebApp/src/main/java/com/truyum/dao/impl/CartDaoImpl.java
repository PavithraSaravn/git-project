package com.truyum.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.truyum.dao.CartDao;
import com.truyum.dao.rowmapper.CartItemDaoRowMapper;
import com.truyum.dao.rowmapper.MenuItemDaoRowMapper;
import com.truyum.model.Cart;
import com.truyum.model.MenuItem;

@Repository
public class CartDaoImpl implements CartDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}  

	@Override
	public int save(int id) {
		String queryMenuItem = "select * from menuitem where item_id=?";
		MenuItemDaoRowMapper rowMapper = new MenuItemDaoRowMapper();
		MenuItem menuItem = jdbcTemplate.queryForObject(queryMenuItem, rowMapper, id);
		String saveCartItem = "insert into cart (cartItem_name, cartItem_price, cartItem_isFreeDelivery) values (?, ?, ?);";
		int result = jdbcTemplate.update(saveCartItem, menuItem.getMenuItemName(), menuItem.getMenuItemPrice(),
				menuItem.isMenuItemIsFreeDelivery());
		return result;
	}  

	@Override
	public List<Cart> getCartItems() {
		String queryCart = "select * from cart";
		CartItemDaoRowMapper rowMapper = new CartItemDaoRowMapper();
		List<Cart> cartItems = jdbcTemplate.query(queryCart, rowMapper);
		return cartItems;
	}

	@Override
	public int delete(int id) {
		String query = "delete from cart where cartItem_id=?;";
		int result = jdbcTemplate.update(query, id);
		return result;
	}

}
