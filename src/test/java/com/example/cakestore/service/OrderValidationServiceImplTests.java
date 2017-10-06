package com.example.cakestore.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.cakestore.domain.CakeStoreOrder;
import com.example.cakestore.domain.Customer;
import com.example.cakestore.domain.Item;
import com.example.cakestore.domain.Order;
import com.example.cakestore.domain.Store;

@RunWith(SpringRunner.class)
public class OrderValidationServiceImplTests {
		
		@Resource(name="orderValidationService")
		OrderValidationService orderValidationService;
		@Resource(name="order")
		Order order;
		@MockBean
		Customer customer;
		@MockBean
		Store store;
		@MockBean
		Item item;
	
		@Test
		public void chocolateCakeOrderForBobAtNeatStore() {
			when(item.getName()).thenReturn("Chocolate Cake");
			when(item.getPrice()).thenReturn(20.00);
			
			when(customer.getName()).thenReturn("Bob");
			when(customer.getMoney()).thenReturn(20.00);
			
			when(store.getName()).thenReturn("Neat");
			
			boolean bobCanAfford = orderValidationService.customersCanAffordOrder(order);
			
			assertEquals(true, bobCanAfford);
		}
		
		@TestConfiguration
		static class Config {
			@Bean
			public OrderValidationService orderValidationService() {
				return new OrderValidationServiceImpl();
			}
			@Bean
			public Order order() {
				return new CakeStoreOrder();
			}
		}
}
