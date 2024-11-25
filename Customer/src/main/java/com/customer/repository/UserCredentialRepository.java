package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.entity.Customer;

import java.util.Optional;

public interface UserCredentialRepository  extends JpaRepository<Customer,Integer> {
    Optional<Customer> findByName(String username);
}
