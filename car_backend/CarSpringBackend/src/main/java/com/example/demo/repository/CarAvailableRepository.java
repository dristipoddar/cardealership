package com.example.demo.repository;

import java.util.List;
//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CarAvailable;

@Repository
public interface CarAvailableRepository extends JpaRepository<CarAvailable, Integer>{
	
	@Query("FROM CarAvailable a WHERE a.sellerId = ?1 AND a.car_id = ?2")
	Optional<CarAvailable> findByCarSellerId(int sellerId, int car_id);
	
	@Query("FROM CarAvailable WHERE sellerId = ?1")
	List<CarAvailable> findListBySellerId(int sellerId);
	
	@Query("FROM CarAvailable WHERE sellerId = ?1")
	Optional<CarAvailable> findBySellerId(int sellerId);
	


}
