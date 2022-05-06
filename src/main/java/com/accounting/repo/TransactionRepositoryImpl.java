package com.accounting.repo;

import java.util.ArrayList;
import java.util.List;

import com.accounting.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class TransactionRepositoryImpl implements TransactionRepository{

	@Autowired
	MongoTemplate mongoTemplate;
	private List<Transaction> transactions = new ArrayList<>();
	
	public Transaction add(Transaction transaction) {
		transaction.setTransactionId(""+(transactions.size()+1));
		transactions.add(transaction);
		return transaction;
	}


	public Transaction findById(String id) {
		return transactions.stream()
				.filter(a -> a.getTransactionId().equals(id))
				.findFirst()
				.orElseThrow();
	}
	
	public List<Transaction> findAll() {
		return transactions;
	}
		
}
