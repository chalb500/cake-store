package com.example.cakestore.service;

import com.example.cakestore.domain.Order;

public interface OrderValidationService {
	public boolean customersCanAffordOrder(Order order);
}
