package com.kraftwerking.collibrachallenge.repository;

import com.kraftwerking.collibrachallenge.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
