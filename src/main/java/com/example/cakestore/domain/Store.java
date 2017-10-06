package com.example.cakestore.domain;

import java.util.List;

public interface Store {
	public Long getId();
	public List<Item> getItems();
	public void setItems(List<Item> items);
	public String getName();
	public void setName(String name);
}
