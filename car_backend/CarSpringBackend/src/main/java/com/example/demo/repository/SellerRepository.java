package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer> {
	
	@Query("FROM Seller a WHERE a.sellerEmail = ?1 AND a.sellerPassword = ?2")
	Optional<Seller> findByEmailAndPassword(String sellerEmail, String sellerPassword);
	


}
