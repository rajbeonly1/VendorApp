package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item_tab")
public class Item  implements Comparable<Item>
{
	@Id
	@Column(name="item_id")
	private int itemId;
	@Column(name="item_name")
	private String itemName;
	@Column(name="item_cost")
	private double itemCost;
	@Column(name="cust_id")
	private int custId;
	
	

	public Item() {
	}



	public Item(int itemId) {
		this.itemId = itemId;
	}
    
    
	public Item(int itemId, String itemName, double itemCost, int custId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.custId = custId;
	}

   

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName
				+ ", itemCost=" + itemCost + ", custId=" + custId + "]";
	}



	public int getItemId() {
		return itemId;
	}



	public void setItemId(int itemId) {
		this.itemId = itemId;
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



	public int getCustId() {
		return custId;
	}



	public void setCustId(int custId) {
		this.custId = custId;
	}



	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return itemId-o.itemId;
	}



 
	
	
}
