package com.truyum.model;

import java.util.*;

public class MenuItem {

	private long menuItemId;
	private String menuItemName, menuItemCategory;
	private double menuItemPrice;
	private boolean menuItemIsActive, menuItemIsFreeDelivery;
	private Date menuItemDateOfLaunch;

	public MenuItem() {

	}

	public long getMenuItemId() {
		return menuItemId;
	}

	public void setMenuItemId(long menuItemId) {
		this.menuItemId = menuItemId;
	}

	public String getMenuItemName() {
		return menuItemName;
	}

	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}

	public String getMenuItemCategory() {
		return menuItemCategory;
	}

	public void setMenuItemCategory(String menuItemCategory) {
		this.menuItemCategory = menuItemCategory;
	}

	public double getMenuItemPrice() {
		return menuItemPrice;
	}

	public void setMenuItemPrice(double menuItemPrice) {
		this.menuItemPrice = menuItemPrice;
	}

	public boolean isMenuItemIsActive() {
		return menuItemIsActive;
	}

	public void setMenuItemIsActive(boolean menuItemIsActive) {
		this.menuItemIsActive = menuItemIsActive;
	}

	public boolean isMenuItemIsFreeDelivery() {
		return menuItemIsFreeDelivery;
	}

	public void setMenuItemIsFreeDelivery(boolean menuItemIsFreeDelivery) {
		this.menuItemIsFreeDelivery = menuItemIsFreeDelivery;
	}

	public Date getMenuItemDateOfLaunch() {
		return menuItemDateOfLaunch;
	}

	public void setMenuItemDateOfLaunch(Date menuItemDateOfLaunch) {
		this.menuItemDateOfLaunch = menuItemDateOfLaunch;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuItem other = (MenuItem) obj;
		if (menuItemId != other.menuItemId)
			return false;
		return true;
	}

}
