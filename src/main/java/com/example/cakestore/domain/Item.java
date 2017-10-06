package com.example.cakestore.domain;

public interface Item {
	public Long getId();
	public double getPrice();
	public void setPrice(double price);
	public String getName();
	public void setName(String name);
}
