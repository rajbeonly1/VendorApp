package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ICustomerDao;
import com.app.model.Customer;
@Repository
public class CustomerDaoImpl implements ICustomerDao {
  @Autowired
  private HibernateTemplate ht;
	@Override
	public int saveCustomer(Customer cus) {
		return (Integer)ht.save(cus);
	}

	@Override
	public void deleteCustomer(int cusId) {
		Customer cus=new Customer(cusId);
		       ht.delete(cus);
	}

	@Override
	public void updateCustomer(Customer cus) {
       ht.update(cus);
	}

	@Override
	public Customer getCusById(int cusId) {
		// TODO Auto-generated method stub
		return ht.get(Customer.class, cusId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return ht.loadAll(Customer.class);
	}

	@Override
	public Customer getCustByEmail(String email) 
	{
		Customer cust=null;
		String hql="from "+Customer.class.getName()+" where cusEmail=?";
		List<Customer> clist= ht.find(hql,email);
		if(clist !=null && clist.size()>0)
		{
			cust=clist.get(0);
		}
		return cust;
	}

}
 