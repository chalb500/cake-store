package com.example.cakestore.domain;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeStore implements Store {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Autowired
	private List<Item> items;
	private String name;
	
	public Long getId() {
		return this.id;
	}
	
	public List<Item> getItems() {
		return this.items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
