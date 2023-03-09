package com.kraftwerking.collibrachallenge.repository;

import com.kraftwerking.collibrachallenge.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByOrderTrackingNumber(String orderTrackingNumber);

}