package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CarSold;
import com.example.demo.repository.CarSoldRepository;

@RestController
@RequestMapping("api/v1/")
public class CarSoldController {

	@Autowired
	private CarSoldRepository carSoldRepository;
	
	
	//create car
	@CrossOrigin
	@PostMapping("/carSold/create")
	public CarSold createCar(@RequestBody CarSold carSold) {
	
		return carSoldRepository.save(carSold);
	}
	
}
