package com.demo.springdemo.dao;

import java.util.List;

import com.demo.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
