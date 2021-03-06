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

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;



@RestController
@RequestMapping("api/v1/")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	//get all customers
	
	@CrossOrigin
	@GetMapping("/customers/get")
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	
	//create customer
	@CrossOrigin
	@PostMapping("/customers/create")
	public Customer createCustomer(@RequestBody Customer customer) {
	
		return customerRepository.save(customer);
	}
	
	
	
	//get customer by id

	@CrossOrigin
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
		
		Customer customer = customerRepository.findById(id).orElseThrow();
		
		return ResponseEntity.ok(customer) ;

	}
	
	//get customer by email and password

	@CrossOrigin
	@GetMapping("/customers/{cEmail}/{cPass}")
	public Optional<Customer> getCustomerByEmail(@PathVariable String cEmail, @PathVariable String cPass) {
		
		Optional<Customer> customer = customerRepository.findByEmailAndPassword(cEmail,cPass);
		
		return customer ;

	}
	
	
	
	//update customer 
	@CrossOrigin
	@PutMapping("/customers/update/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable int id,@RequestBody Customer customerDetails) {
		Customer customer = customerRepository.findById(id)
				.orElseThrow();
		
		customer.setCustomerName(customerDetails.getCustomerName());
		customer.setCustomerEmail(customerDetails.getCustomerEmail());
		customer.setCustomerContactno(customerDetails.getCustomerContactno());
		
		customer.setCustomerPassword(customerDetails.getCustomerPassword());
		customer.setCustomerAddress(customerDetails.getCustomerAddress());
		customer.setCustomerWallet(customerDetails.getCustomerWallet());
		
		
		Customer updatedCustomer=  customerRepository.save(customer);
		
	    return ResponseEntity.ok(updatedCustomer);
	}
	
	
	
	
//	//update customer 
//	@CrossOrigin
//	@PutMapping("/customers/updateWallet/{amt}/{cid}")
//	public void updateWallet(@PathVariable double amt, @PathVariable int cid) {
//		customerRepository.updateCustomerWallet(amt, cid);
//
////		customer.setCustomerWallet(customerDetails.getCustomerWallet());
//
//	}
//	
	
	//delete
	@CrossOrigin

	@DeleteMapping("/customers/delete/{id}")
	public Map<String, Boolean> deleteCustomer(@PathVariable int id){
		
		Customer customer = customerRepository.findById(id)
				.orElseThrow();
		
	
		customerRepository.delete(customer);
		Map<String, Boolean> response = new HashMap<>();

		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
