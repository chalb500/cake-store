package com.example.cakestore.domain;


import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeStoreOrder implements Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Autowired
	private List<Customer> customers;
	@Autowired
	private List<Store> stores;
	@Autowired
	private List<Item> items;
	
	public Long getId() {
		return this.id;
	}
	
	public List<Customer> getCustomers() {
		return this.customers;
	}
	
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	public List<Store> getStores() {
		return this.stores;
	}
	
	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	public List<Item> getItems() {
		return this.items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
