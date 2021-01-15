package com.truyum.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.truyum.model.Cart;

public class CartItemDaoRowMapper implements RowMapper<Cart> {

	@Override
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cart cart = new Cart();
		cart.setCartItemId(rs.getInt(1));
		cart.setCartItemName(rs.getString(2));
		cart.setCartItemPrice(rs.getDouble(3));
		cart.setCartItemIsFreeDelivery(rs.getBoolean(4));
		return cart;
	}


}
