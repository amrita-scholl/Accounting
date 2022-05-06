package com.accounting.controller;

import java.util.List;
import java.util.Optional;

import com.accounting.repo.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accounting.model.Customer;


@RestController
public class CustomerController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerRepository repository ;
	
	@GetMapping("/{customerId}")
	public Optional<Customer> findCustomerById(@PathVariable("customerId") String customerId) {
		LOGGER.info("Customer find: customerId={}", customerId);
		return repository.findOne(customerId);
	}

	@GetMapping("/findAllCustomers")
	public List<Customer> findAllCustomers() {
		LOGGER.info("Customer find");
		return repository.findAll();
	}


}
