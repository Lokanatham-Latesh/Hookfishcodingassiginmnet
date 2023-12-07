package com.latesh.customerservice;

import org.springframework.stereotype.Service;

import com.latesh.entity.Orders;
@Service
public interface Ordersservice {


	public Orders addorders(Orders orders);
}
