package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

//	@Query("FROM Customer WHERE customerName = ?1")
//	Customer findByName(String customerName);

	@Query("FROM Customer a WHERE a.customerEmail = ?1 AND a.customerPassword = ?2")
	Optional<Customer> findByEmailAndPassword(String customerEmail, String customerPassword);
//	
//	@Modifying
//	@Query("update Customer c set c.customerWallet = ?1 where c.customer_id = ?2")
//	void updateCustomerWallet(double customerWallet, int customer_id);
}
