package com.truyum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.truyum.dao.MenuItemDao;
import com.truyum.model.MenuItem;

@Controller
public class MenuItemController {
	
	@Autowired
	MenuItemDao menuItemDao;
	
	@RequestMapping(value = "/ShowMenuItemListAdmin", method = RequestMethod.GET)
	public String showMenuItemsAdmin(ModelMap model) {
		List<MenuItem> menuItemsAdmin = menuItemDao.getMenuItemsAdmin();
		model.addAttribute("menuItemListAdmin", menuItemsAdmin);
		return "menu-item-list-admin";
	}
	
	@RequestMapping(value = "/ShowMenuItemListCustomer", method = RequestMethod.GET)
	public String showMenuItemsCustomer(ModelMap model) {
		List<MenuItem> menuItemsCustomer = menuItemDao.getMenuItemsCustomer();
		model.addAttribute("menuItemListCustomer", menuItemsCustomer);
		return "menu-item-list-customer";
	}
	
}
