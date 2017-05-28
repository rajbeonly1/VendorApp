package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cus_tab")
public class Customer implements Comparable<Customer>{
	@Id
	@GeneratedValue(generator="cust")
	@SequenceGenerator(name="cust",sequenceName="CUST_SEQ")
	@Column(name="cus_id")
	private int cusId;
	@Column(name="cus_name",length=15)
	private String cusName;
	@Column(name="cus_email")
	private String cusEmail;
	@Column(name="cus_type")
	private String cusType;
	@Column(name="cus_add")
	private String cusAddress;
	@Column(name="cus_mobno")
	private String cusMblNo;
	@Column(name="Cus_pwd")
	private String cusPwd;
	@Column(name="cus_actoken")
	private String acsToken;
	public Customer() {
		super();
	}
	public Customer(int cusId) {
		super();
		this.cusId = cusId;
	}
	public Customer(int cusId, String cusName, String cusEmail, String cusType,
			String cusAddress, String cusMblNo, String cusPwd, String acsToken) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusEmail = cusEmail;
		this.cusType = cusType;
		this.cusAddress = cusAddress;
		this.cusMblNo = cusMblNo;
		this.cusPwd = cusPwd;
		this.acsToken = acsToken;
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName
				+ ", cusEmail=" + cusEmail + ", cusType=" + cusType
				+ ", cusAddress=" + cusAddress + ", cusMblNo=" + cusMblNo
				+ ", cusPwd=" + cusPwd + ", acsToken=" + acsToken + "]";
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusEmail() {
		return cusEmail;
	}
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	public String getCusType() {
		return cusType;
	}
	public void setCusType(String cusType) {
		this.cusType = cusType;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	public String getCusMblNo() {
		return cusMblNo;
	}
	public void setCusMblNo(String cusMblNo) {
		this.cusMblNo = cusMblNo;
	}
	public String getCusPwd() {
		return cusPwd;
	}
	public void setCusPwd(String cusPwd) {
		this.cusPwd = cusPwd;
	}
	public String getAcsToken() {
		return acsToken;
	}
	public void setAcsToken(String acsToken) {
		this.acsToken = acsToken;
	}
	
	 @Override
	 	public int compareTo(Customer c) {
	 		// TODO Auto-generated method stub
	 		return this.getCusId()-c.getCusId();
	 	}	
}
