package com.latesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.latesh.customerservice.Customerservice;
import com.latesh.customerservice.Ordersservice;
import com.latesh.entity.Customer;
import com.latesh.entity.Orders;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	@Autowired
	private Customerservice customerservice;
	@Autowired
	private Ordersservice ordersservice;
	
	 @GetMapping("/no-orders")
	    public List<Customer> getCustomersWithoutOrders() {
	        return customerservice.getCustomersWithoutOrders();
	    }
	 @PostMapping("/addcustomer")
	 public Customer addCustomer(@RequestBody Customer customer) {
		 return customerservice.addcustomers(customer);
	 }
	 
	 @PostMapping("/addorders")
	 public Orders addOrders(@RequestBody Orders orders) {
		 return ordersservice.addorders(orders);
	 }

}
