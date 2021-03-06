package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_sold")
public class CarSold {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_Id;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "seller_id")
	private int sellerId;
	
	@Column(name = "car_id")
	private int carId;
	
	@Column(name = "car_brand")
	private String carBrand;
	
	@Column(name = "car_model")
	private String carModel;
	
	@Column(name = "car_price")
	private double carPrice;
	
	@Column(name = "car_Url")
	private String carUrl;
	
	public CarSold() {
		
	}
	

	public CarSold(int customerId, int sellerId, int carId, String carBrand, String carModel, double carPrice, String carUrl) {
		super();
		this.customerId = customerId;
		this.sellerId = sellerId;
		this.carId = carId;
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.carUrl = carUrl;
	}

	public int getOrderId() {
		return order_Id;
	}

	public void setOrderId(int order_Id) {
		this.order_Id = order_Id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}


	public int getOrder_Id() {
		return order_Id;
	}


	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}


	public String getCarUrl() {
		return carUrl;
	}


	public void setCarUrl(String carUrl) {
		this.carUrl = carUrl;
	}
	
	

}

