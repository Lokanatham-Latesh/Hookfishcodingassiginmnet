package com.latesh.customerRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.latesh.entity.Customer;
import com.latesh.entity.Orders;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	  List<Customer> findByOrdersIsNull();

	Orders save(Orders orders);

}
