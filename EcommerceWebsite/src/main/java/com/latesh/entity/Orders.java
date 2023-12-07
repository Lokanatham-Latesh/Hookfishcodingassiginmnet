package com.latesh.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Orders {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime orderdate;
	private String itemsOrdererd;
	 @ManyToOne
	    @JoinColumn(name = "customer_id")
	    private Customer customer;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public Orders(int id, LocalDateTime orderdate, String itemsOrdererd, Customer customer) {
		super();
		this.id = id;
		this.orderdate = orderdate;
		this.itemsOrdererd = itemsOrdererd;
		this.customer = customer;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDateTime orderdate) {
		this.orderdate = orderdate;
	}
	public String getItemsOrdererd() {
		return itemsOrdererd;
	}
	public void setItemsOrdererd(String itemsOrdererd) {
		this.itemsOrdererd = itemsOrdererd;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
