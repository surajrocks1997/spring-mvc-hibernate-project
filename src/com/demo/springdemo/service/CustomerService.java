package com.demo.springdemo.service;

import java.util.List;

import com.demo.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
