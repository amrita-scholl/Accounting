package com.accounting.repo;

import com.accounting.model.Customer;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    @Query("{customerId:'?0'}")
    Optional<Customer> findOne(String customerId);

    @Query("{'*'}")
    List<Customer> findAll();
}
