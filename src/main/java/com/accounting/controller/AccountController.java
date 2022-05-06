package com.accounting.controller;

import java.util.List;
import java.util.Optional;

import com.accounting.repo.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accounting.model.Account;


@RestController
public class AccountController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private AccountRepository repository;

	@GetMapping("/account/{accountId}")
	public Optional<Account> findByAccountId(@PathVariable("accountId") String accountId) {
		LOGGER.info("Account find: id={}", accountId);
		return repository.findById(accountId);
	}
	
	@GetMapping("/findAllAccounts")
	public List<Account> findAll() {
		LOGGER.info("Account find");
		return repository.findAll();
	}
		
}