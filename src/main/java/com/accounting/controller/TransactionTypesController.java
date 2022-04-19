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
import com.accounting.model.TransactionType;
import com.accounting.repo.CustomerRepository;
import com.accounting.repo.TransactionTypeRepository;


@RestController
public class TransactionTypesController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TransactionTypesController.class);
	
	@Autowired(required = false)
	TransactionTypeRepository repository;
	
	@PostMapping("/transactionType")
	public TransactionType accounts(@RequestBody TransactionType transactionType) {
		LOGGER.info("Customer add: {}", transactionType);
		return repository.add(transactionType);
	}
	
	@GetMapping("/transactionType/{id}")
	public TransactionType findById(@PathVariable("id") Long id) {
		LOGGER.info("TransactionType find: id={}", id);
		return repository.findById(id);
	}
	
	@GetMapping("/transactionType/all")
	public List<TransactionType> findAll() {
		LOGGER.info("Customer find");
		return repository.findAll();
	}
		
}
