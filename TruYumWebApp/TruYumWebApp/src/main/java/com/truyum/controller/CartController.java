package com.truyum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.truyum.dao.CartDao;
import com.truyum.model.Cart;

@Controller
public class CartController {
	
	@Autowired
	CartDao cartDao;
	
	@RequestMapping(value = "/AddtoCart", method = RequestMethod.GET)
	public String addCart(@RequestParam int id, ModelMap model, RedirectAttributes redirectAttributes) {
		int result = cartDao.save(id);
		if(result==0) {
			redirectAttributes.addFlashAttribute("addCartStatus", false);
		}else {
			redirectAttributes.addFlashAttribute("addCartStatus", true);
		}
		return "redirect:/ShowMenuItemListCustomer";
	}
	
	@RequestMapping(value = "/ShowCart", method = RequestMethod.GET)
	public String showCartPage(ModelMap model) {
			List<Cart> cartItems = cartDao.getCartItems();
			if(cartItems == null || cartItems.isEmpty()) {
				return "cart-empty";
			}
			model.addAttribute("cartItems", cartItems);
			return "cart";
	}
	
	@RequestMapping(value = "/RemoveCartItem", method = RequestMethod.GET)
	public String deleteCart(@RequestParam int id, ModelMap model, RedirectAttributes redirectAttributes) {
		int result = cartDao.delete(id);
		if(result==0) {
			redirectAttributes.addFlashAttribute("removeCartItemStatus", false);
		}else {
			redirectAttributes.addFlashAttribute("removeCartItemStatus", true);
		}
		return "redirect:/ShowCart";
	}
}
