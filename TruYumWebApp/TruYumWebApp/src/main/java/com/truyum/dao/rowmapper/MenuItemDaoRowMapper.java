package com.truyum.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.truyum.model.MenuItem;

public class MenuItemDaoRowMapper implements RowMapper<MenuItem> {

	@Override
	public MenuItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		MenuItem menuItem = new MenuItem();
		menuItem.setMenuItemId(rs.getInt(1));
		menuItem.setMenuItemName(rs.getString(2));
		menuItem.setMenuItemCategory(rs.getString(3));
		menuItem.setMenuItemPrice(rs.getDouble(4));
		menuItem.setMenuItemIsActive(rs.getBoolean(5));
		menuItem.setMenuItemIsFreeDelivery(rs.getBoolean(6));
		menuItem.setMenuItemDateOfLaunch((java.util.Date) rs.getDate(7));
		return menuItem;
	}

}
