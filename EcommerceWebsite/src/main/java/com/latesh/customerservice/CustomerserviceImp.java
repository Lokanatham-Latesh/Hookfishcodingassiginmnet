package com.latesh.customerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latesh.customerRepository.CustomerRepository;
import com.latesh.entity.Customer;
import com.latesh.entity.Orders;
@Service
public class CustomerserviceImp implements Customerservice {

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public List<Customer> getCustomersWithoutOrders() {
		// TODO Auto-generated method stub
		 return customerRepository.findByOrdersIsNull();
	}
	
	@Override
	public Customer addcustomers(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	
}
