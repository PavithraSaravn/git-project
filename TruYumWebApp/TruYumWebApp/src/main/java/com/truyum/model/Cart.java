package com.truyum.model;

public class Cart {

	private long cartItemId;
	private String cartItemName;
	private double cartItemPrice;
	private boolean cartItemIsFreeDelivery;

	public Cart() {

	}

	public long getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(long cartItemId) {
		this.cartItemId = cartItemId;
	}

	public String getCartItemName() {
		return cartItemName;
	}

	public void setCartItemName(String cartItemName) {
		this.cartItemName = cartItemName;
	}

	public double getCartItemPrice() {
		return cartItemPrice;
	}

	public void setCartItemPrice(double cartItemPrice) {
		this.cartItemPrice = cartItemPrice;
	}

	public boolean isCartItemIsFreeDelivery() {
		return cartItemIsFreeDelivery;
	}

	public void setCartItemIsFreeDelivery(boolean cartItemIsFreeDelivery) {
		this.cartItemIsFreeDelivery = cartItemIsFreeDelivery;
	}

	@Override
	public String toString() {
		return String.format("Cart [cartItemId=%s, cartItemName=%s, cartItemPrice=%s, cartItemIsFreeDelivery=%s]",
				cartItemId, cartItemName, cartItemPrice, cartItemIsFreeDelivery);
	}

}
