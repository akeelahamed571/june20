package com.customer;

import interfaces.AdminInterface;

public class Admin implements AdminInterface {
	private int  AdminID;
	private  String adminName;
	private	String email;
	private	String phone;
	private	String userName;
	private	String password;
		
	
    public Admin(int customerID, String customerName, String email, String phone, String userName, String password) {
		
		this.AdminID = customerID;
		this.adminName = customerName;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}

	public int getCustomerID() {
		return AdminID;
	}

	public String getCustomerName() {
		return adminName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	

	
	
	
	
}
