package com.accounting.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accounting.model.Customer;
import com.accounting.repo.CustomerRepository;


@RestController
public class CustomerController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired(required = false)
	CustomerRepository repository;
	
	@PostMapping("/customer")
	public Customer accounts(@RequestBody Customer customer) {
		LOGGER.info("Customer add: {}", customer);
		return repository.add(customer);
	}
	
	@GetMapping("/{id}")
	public Customer findById(@PathVariable("id") Long id) {
		LOGGER.info("Customer find: id={}", id);
		return repository.findById(id);
	}
	
	@GetMapping("/")
	public List<Customer> findAll() {
		LOGGER.info("Customer find");
		return repository.findAll();
	}
		
}
