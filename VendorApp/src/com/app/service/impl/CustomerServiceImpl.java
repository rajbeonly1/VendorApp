package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICustomerDao;
import com.app.model.Customer;
import com.app.service.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
	private ICustomerDao dao;
	@Override
	public int saveCustomer(Customer cus) {
		return dao.saveCustomer(cus);
	}

	@Override
	public void deleteCustomer(int cusId) {
    dao.deleteCustomer(cusId);
	}

	@Override
	public void updateCustomer(Customer cus) {
     dao.updateCustomer(cus);
	}

	@Override
	public Customer getCusById(int cusId) {
		return dao.getCusById(cusId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	@Override
	public Customer getCustByEmail(String email) {
		// TODO Auto-generated method stub
		Customer cust=null;
		 cust=dao.getCustByEmail(email);
		 return cust;
	}

}
