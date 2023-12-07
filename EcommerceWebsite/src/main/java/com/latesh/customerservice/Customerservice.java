package com.latesh.customerservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.latesh.entity.Customer;
import com.latesh.entity.Orders;
@Service
public interface Customerservice {
	 public List<Customer> getCustomersWithoutOrders();

	public Customer addcustomers(Customer customer);

	
}
