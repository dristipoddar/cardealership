package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CarAvailable;
import com.example.demo.repository.CarAvailableRepository;

@RestController
@RequestMapping("api/v1/")
public class CarAvailableController {

	
	@Autowired
	private CarAvailableRepository carAvailableRepository;
	
	//get all cars available
	
		@CrossOrigin
		@GetMapping("/cars/get")
		public List<CarAvailable> getAllCustomer(){
			return carAvailableRepository.findAll();
		}
		
		//create car
		@CrossOrigin
		@PostMapping("/cars/create")
		public CarAvailable createCar(@RequestBody CarAvailable carAvailable) {
		
			return carAvailableRepository.save(carAvailable);
		}
		
		//get list car by id

		@CrossOrigin
		@GetMapping("/cars/listbyseller/{id}")
		public List<CarAvailable> getCarListBySellerId(@PathVariable int id) {
			
			List<CarAvailable> carAvailable = carAvailableRepository.findListBySellerId(id);
			
			return carAvailable ;

		}
		
		//get car by id

		@CrossOrigin
		@GetMapping("/cars/getbyid/{id}")
		public ResponseEntity<CarAvailable> getCarById(@PathVariable int id) {
			
			CarAvailable carAvailable = carAvailableRepository.findById(id).orElseThrow();
			
			return ResponseEntity.ok(carAvailable) ;

		}
		
		
		
		//get car by sellerid

		@CrossOrigin
		@GetMapping("/cars/byseller/{sid}")
		public Optional<CarAvailable> getCarBySellerId(@PathVariable int sid) {
			
			Optional<CarAvailable> carAvailable = carAvailableRepository.findBySellerId(sid);
			
			return carAvailable ;

		}
		
		
		//delete
		@CrossOrigin

		@DeleteMapping("/cars/delete/{id}")
		public Map<String, Boolean> deleteCar(@PathVariable int id){
			
			CarAvailable carAvailable = carAvailableRepository.findById(id)
					.orElseThrow();
			
		
			carAvailableRepository.delete(carAvailable);
			Map<String, Boolean> response = new HashMap<>();

			response.put("deleted", Boolean.TRUE);
			return response;
		}
		
}
