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

import com.accounting.model.Account;
import com.accounting.model.Customer;
import com.accounting.repo.AccountRepository;
import com.accounting.repo.CustomerRepository;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;


@RestController
public class AccountController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired(required = false)
	AccountRepository repository;
	
	@PostMapping("/account")
	public Account accounts(@RequestBody Account account) {
		LOGGER.info("Account add: {}", account);
		return repository.add(account);
	}
	
	@GetMapping("/account/{id}") 
	public Account findById(@PathVariable("id") Long id) {
		LOGGER.info("Account find: id={}", id);
		return repository.findById(id);
	}
	
	@GetMapping("/account/all")
	public List<Account> findAll() {
		LOGGER.info("Account find");
		return repository.findAll();
	}
		
}
