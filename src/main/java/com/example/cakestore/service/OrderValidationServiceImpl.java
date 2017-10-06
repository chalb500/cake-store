package com.example.cakestore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cakestore.domain.Order;
import com.example.cakestore.domain.Customer;
import com.example.cakestore.domain.Item;

@Service
public class OrderValidationServiceImpl implements OrderValidationService {
	
	public boolean customersCanAffordOrder(Order order) {
		if (order == null)
			return false;
		
		List<Customer> customers = order.getCustomers();
		if (customers == null || customers.isEmpty())
			return false;
		
		double totalMoney = 0.0;
		for (Customer customer : customers) {
			totalMoney += customer.getMoney();
		}
		
		List<Item> items = order.getItems();
		if (items == null || items.isEmpty())
			return false;
		
		double totalOrderCost = 0.0;
		for (Item item : items) {
			totalOrderCost += item.getPrice();
			
			if (totalOrderCost > totalMoney)
				return false;
		}
		
		return true;
	}
}
