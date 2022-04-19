package com.accounting.repo;

import java.util.ArrayList;
import java.util.List;

import com.accounting.model.Account;
import com.accounting.model.Customer;

public class AccountRepository {

	private List<Account> accounts = new ArrayList<>();
	
	public Account add(Account account) {
		account.setCustomerId((long) (accounts.size()+1));
		accounts.add(account);
		return account;
	}
	
	public Account findById(Long id) {
		return accounts.stream()
				.filter(a -> a.getCustomerId().equals(id))
				.findFirst()
				.orElseThrow();
	}
	
	public List<Account> findAll() {
		return accounts;
	}
		
}
