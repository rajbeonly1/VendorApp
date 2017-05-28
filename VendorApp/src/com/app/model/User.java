package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_TAB")
public class User {
	@Id
	@GeneratedValue(generator="user")
	@SequenceGenerator(name="user",sequenceName="USER_SEQ")
	@Column(name="u_id")
	private int userId;
	@Column(name="u_name",length=20)
	private String userName;
	@Column(name="u_adres",length=20)
	private String userAdres;
	@Column(name="u_cantact",length=10)
	private String mobile;
	@Column(name="u_password",length=10)
	private String password;
	@Column(name="u_email")
	private String userEmail;
	public User() {
		super();
	}
	public User(int userId) {
		super();
		this.userId = userId;
	}
	public User(int userId, String userName, String userAdres, String mobile,
			String password, String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAdres = userAdres;
		this.mobile = mobile;
		this.password = password;
		this.userEmail = userEmail;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAdres() {
		return userAdres;
	}
	public void setUserAdres(String userAdres) {
		this.userAdres = userAdres;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userAdres=" + userAdres + ", mobile=" + mobile
				+ ", password=" + password + ", userEmail=" + userEmail + "]";
	}
	 	
}
