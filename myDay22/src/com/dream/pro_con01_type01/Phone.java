package com.dream.pro_con01_type01;

public class Phone {
	private String brand;
	private double price;
	private boolean store;
	
	public Phone() {
		
	}

	public Phone(String brand, double price, boolean store) {
		this.brand = brand;
		this.price = price;
		this.store = store;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStore() {
		return store;
	}

	public void setStore(boolean store) {
		this.store = store;
	}
	
}
