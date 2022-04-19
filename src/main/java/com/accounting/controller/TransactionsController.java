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

import com.accounting.model.Transaction;
import com.accounting.repo.TransactionRepository;


@RestController
public class TransactionsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TransactionsController.class);
	
	@Autowired(required = false)
	TransactionRepository repository;
	
	@PostMapping("/transaction")
	public Transaction transactions(@RequestBody Transaction transaction) {
		LOGGER.info("Transaction add: {}", transaction);
		return repository.add(transaction);
	}
	
	@GetMapping("/transaction/{id}")
	public Transaction findById(@PathVariable("id") Long id) {
		LOGGER.info("Transaction find: id={}", id);
		return repository.findById(id);
	}
	
	@GetMapping("/transaction/all")
	public List<Transaction> findAll() {
		LOGGER.info("Transaction find");
		return repository.findAll();
	}
		
}
