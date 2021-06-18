package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_available")
public class CarAvailable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int car_id;
	
	@Column(name = "seller_id")
	private int sellerId;
	
	@Column(name = "car_brand")
	private String carBrand;
	
	@Column(name = "car_model")
	private String carModel;
	
	@Column(name = "car_price")
	private double carPrice;
	
	@Column(name = "car_url")
	private String carUrl;
	
	public CarAvailable() {
		
	}

	public CarAvailable(int sellerId, String carBrand, String carModel, double carPrice, String carUrl) {
		super();
		this.sellerId = sellerId;
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.carUrl = carUrl;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
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

	public String getCarUrl() {
		return carUrl;
	}

	public void setCarUrl(String carUrl) {
		this.carUrl = carUrl;
	}
	
	

}
