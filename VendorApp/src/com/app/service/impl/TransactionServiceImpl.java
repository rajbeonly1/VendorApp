package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ITransactionDao;
import com.app.model.TransactionInfo;
import com.app.service.ITransactionService;
@Service
public class TransactionServiceImpl implements ITransactionService 
{
	@Autowired
	private ITransactionDao dao;
	@Override
	public int saveTransaction(TransactionInfo tx) {
		// TODO Auto-generated method stub
		return dao.saveTransaction(tx);
	}

}
