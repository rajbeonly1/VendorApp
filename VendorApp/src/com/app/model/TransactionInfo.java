package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="transaction_tab")
public class TransactionInfo {
	@Id
	@GeneratedValue(generator="tx")
	@SequenceGenerator(name="tx",sequenceName="TX_SEQ")
	@Column(name="tx_id")
	private int txId;
	@Column(name="item_name")
	private String itemName;
	@Column(name="item_cost")
	private double itemCost;
	@Column(name="item_id")
	private int itemId;
	@Column(name="cust_id")
	private int custId;
	
	public TransactionInfo() {
		super();
	}
	

	public TransactionInfo(int txId, String itemName, double itemCost,
			int itemId, int custId) {
		super();
		this.txId = txId;
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.itemId = itemId;
		this.custId = custId;
	}


	public TransactionInfo(int txId) {
		super();
		this.txId = txId;
	}


	public int getTxId() {
		return txId;
	}


	public void setTxId(int txId) {
		this.txId = txId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getItemCost() {
		return itemCost;
	}


	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	@Override
	public String toString() {
		return "TransactionInfo [txId=" + txId + ", itemName=" + itemName
				+ ", itemCost=" + itemCost + ", itemId=" + itemId + ", custId="
				+ custId + "]";
	}
	

}
