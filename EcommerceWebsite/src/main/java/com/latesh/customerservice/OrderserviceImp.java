package com.latesh.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latesh.customerRepository.CustomerRepository;
import com.latesh.entity.Orders;
@Service
public class OrderserviceImp implements Ordersservice{

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Orders addorders(Orders orders) {
		// TODO Auto-generated method stub
		return customerRepository.save(orders);
	}

}
