package com.example.cakestore.domain;

import java.util.List;

public interface Order {
	public Long getId();
	public List<Customer> getCustomers();
	public List<Store> getStores();
	public List<Item> getItems();
	public void setCustomers(List<Customer> customers);
	public void setStores(List<Store> stores);
	public void setItems(List<Item> items);
}
