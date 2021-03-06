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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Seller;
import com.example.demo.repository.SellerRepository;

@RestController
@RequestMapping("api/v1/")
public class SellerController {

	@Autowired
	private SellerRepository sellerRepository;
	
	//get all Sellers
	
	@CrossOrigin
	@GetMapping("/sellers/get")
	public List<Seller> getAllSellers(){
		return sellerRepository.findAll();
	}
	
	//get seller by email and password

	@CrossOrigin
	@GetMapping("/sellers/{sEmail}/{sPass}")
	public Optional<Seller> getSellerByEmail(@PathVariable String sEmail, @PathVariable String sPass) {
		
		Optional<Seller> seller = sellerRepository.findByEmailAndPassword(sEmail,sPass);
		
		return seller ;

	}
	
	
	//create seller
	@CrossOrigin
	@PostMapping("/sellers/create")
	public Seller createSeller(@RequestBody Seller seller) {
	
		return sellerRepository.save(seller);
	}
	
	//get Seller by id

		@CrossOrigin
		@GetMapping("/sellers/{id}")
		public ResponseEntity<Seller> getSellerById(@PathVariable int id) {
			
			Seller seller = sellerRepository.findById(id).orElseThrow();
			
			return ResponseEntity.ok(seller) ;

		}
		
		//update customer 
		@CrossOrigin
		@PutMapping("/sellers/update/{id}")
		public ResponseEntity<Seller> updateSeller(@PathVariable int id,@RequestBody Seller sellerDetails) {
			Seller seller = sellerRepository.findById(id)
					.orElseThrow();
			
			seller.setSellerName(sellerDetails.getSellerName());
			seller.setSellerEmail(sellerDetails.getSellerEmail());
			seller.setSellerContactno(sellerDetails.getSellerContactno());
			
			seller.setSellerPassword(sellerDetails.getSellerPassword());
			seller.setSellerAddress(sellerDetails.getSellerAddress());
			seller.setSellerWallet(sellerDetails.getSellerWallet());
			
			
			Seller updatedSeller=  sellerRepository.save(seller);
			
		    return ResponseEntity.ok(updatedSeller);
		}
		
		//delete
		@CrossOrigin

		@DeleteMapping("/sellers/delete/{id}")
		public Map<String, Boolean> deleteCustomer(@PathVariable int id){
			
			Seller seller = sellerRepository.findById(id)
					.orElseThrow();
			
		
			sellerRepository.delete(seller);
			Map<String, Boolean> response = new HashMap<>();

			response.put("deleted", Boolean.TRUE);
			return response;
		}
}
