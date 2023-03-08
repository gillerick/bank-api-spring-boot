package com.example.simplebankapi.repositories;

import com.example.simplebankapi.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
  Optional<Customer> findById(Long id);

  Customer save(Customer customer);

  void delete(Customer customer);


}
