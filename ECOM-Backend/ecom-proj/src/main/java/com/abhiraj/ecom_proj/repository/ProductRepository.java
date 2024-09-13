package com.abhiraj.ecom_proj.repository;

import com.abhiraj.ecom_proj.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
