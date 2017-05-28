package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerService {
	public int saveCustomer(Customer cus);
	public void deleteCustomer(int cusId);
	public void updateCustomer(Customer cus);
	public Customer getCusById(int cusId);	
	public List<Customer> getAllCustomers();
	
	public Customer getCustByEmail(String email);

}
