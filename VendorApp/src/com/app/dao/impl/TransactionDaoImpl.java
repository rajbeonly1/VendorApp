package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ITransactionDao;
import com.app.model.TransactionInfo;
@Repository
public class TransactionDaoImpl implements ITransactionDao 
{
	@Autowired
	private HibernateTemplate ht;
	@Override
	public int saveTransaction(TransactionInfo tx) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(tx);
	}

}
