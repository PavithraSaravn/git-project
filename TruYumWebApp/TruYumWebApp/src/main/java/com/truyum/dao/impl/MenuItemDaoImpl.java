package com.truyum.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.truyum.dao.MenuItemDao;
import com.truyum.dao.rowmapper.MenuItemDaoRowMapper;
import com.truyum.model.MenuItem;

@Repository
public class MenuItemDaoImpl implements MenuItemDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<MenuItem> getMenuItemsAdmin() {
		String sql = "select * from menuitem;";
		MenuItemDaoRowMapper rowmapper = new MenuItemDaoRowMapper();
		List<MenuItem> menuItemsAdmin = jdbcTemplate.query(sql, rowmapper);
		return menuItemsAdmin;
	}

	@Override
	public List<MenuItem> getMenuItemsCustomer() {
		String sql = "select * from menuitem;";
		MenuItemDaoRowMapper rowmapper = new MenuItemDaoRowMapper();
		List<MenuItem> menuItemsCustomer = jdbcTemplate.query(sql, rowmapper);
		return menuItemsCustomer;
	}

}
