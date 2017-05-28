package com.app.dao;

import com.app.model.TransactionInfo;

public interface ITransactionDao {
	public int saveTransaction(TransactionInfo tx);

}
