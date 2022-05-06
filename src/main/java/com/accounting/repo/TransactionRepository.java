package com.accounting.repo;

import com.accounting.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public interface TransactionRepository {

	public Transaction add(Transaction transaction) ;
	
	public Transaction findById(String id) ;
	
	public List<Transaction> findAll() ;
		
}
