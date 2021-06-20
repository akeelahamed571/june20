package com.customer;

public class Customer {
	private int customerID;
	private String customerName;
	private String email;
	private String phone;
	private String userName;
	private String password;
	
    public Customer(int customerID, String customerName, String email, String phone, String userName, String password) {
		
		this.customerID = customerID;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
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
