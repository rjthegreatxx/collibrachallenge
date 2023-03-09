package com.kraftwerking.collibrachallenge.repository;

import com.kraftwerking.collibrachallenge.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressRepository extends JpaRepository<Address, Long> {
}