package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "customer_email_id")
	private String customerEmail;
	
	@Column(name = "customer_contactno")
	private String customerContactno;
	
	@Column(name = "customer_password")
	private String customerPassword;
	
	@Column(name = "customer_addess")
	private String customerAddress;
	
	@Column(name = "customer_wallet")
	private double customerWallet;
	
	public Customer() {
		
	}

	public Customer(String customerName, String customerEmail, String customerContactno, String customerPassword,
			String customerAddress, double customerWallet) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerContactno = customerContactno;
		this.customerPassword = customerPassword;
		this.customerAddress = customerAddress;
		this.customerWallet = customerWallet;
	}
	

	public int getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerContactno() {
		return customerContactno;
	}

	public void setCustomerContactno(String customerContactno) {
		this.customerContactno = customerContactno;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public double getCustomerWallet() {
		return customerWallet;
	}

	public void setCustomerWallet(double customerWallet) {
		this.customerWallet = customerWallet;
	}
	
	

}


