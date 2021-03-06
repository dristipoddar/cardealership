package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller")
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seller_id;
	
	@Column(name = "seller_name")
	private String sellerName;
	
	@Column(name = "seller_email_id")
	private String sellerEmail;
	
	@Column(name = "seller_contactno")
	private String sellerContactno;
	
	@Column(name = "seller_password")
	private String sellerPassword;
	
	@Column(name = "seller_addess")
	private String sellerAddress;
	
	@Column(name = "seller_wallet")
	private double sellerWallet;
	
	public Seller() {
		
	}
	

	public Seller(String sellerName, String sellerEmail, String sellerContactno, String sellerPassword,
			String sellerAddress, double sellerWallet) {
		super();
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.sellerContactno = sellerContactno;
		this.sellerPassword = sellerPassword;
		this.sellerAddress = sellerAddress;
		this.sellerWallet = sellerWallet;
	}

	public int getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getSellerContactno() {
		return sellerContactno;
	}

	public void setSellerContactno(String sellerContactno) {
		this.sellerContactno = sellerContactno;
	}

	public String getSellerPassword() {
		return sellerPassword;
	}

	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}

	public String getSellerAddress() {
		return sellerAddress;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public double getSellerWallet() {
		return sellerWallet;
	}

	public void setSellerWallet(double sellerWallet) {
		this.sellerWallet = sellerWallet;
	}
	
	
	
}
