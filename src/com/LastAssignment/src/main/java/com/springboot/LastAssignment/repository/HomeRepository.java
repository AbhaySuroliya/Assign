package com.springboot.LastAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.LastAssignment.model.Products;

public interface HomeRepository extends JpaRepository<Products,Integer>{
	
}
