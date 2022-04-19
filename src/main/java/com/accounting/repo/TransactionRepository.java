package com.accounting.repo;

import java.util.ArrayList;
import java.util.List;

import com.accounting.model.Transaction;

public class TransactionRepository {

	private List<Transaction> transactions = new ArrayList<>();
	
	public Transaction add(Transaction transaction) {
		transaction.setTransactionId((long) (transactions.size()+1));
		transactions.add(transaction);
		return transaction;
	}
	
	public Transaction findById(Long id) {
		return transactions.stream()
				.filter(a -> a.getTransactionId().equals(id))
				.findFirst()
				.orElseThrow();
	}
	
	public List<Transaction> findAll() {
		return transactions;
	}
		
}
