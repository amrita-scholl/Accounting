package com.accounting.repo;

import com.accounting.model.TransactionType;

import java.util.ArrayList;
import java.util.List;

public interface TransactionTypeRepository {

	public TransactionType add(TransactionType transactionType) ;
	
	public TransactionType findById(String id) ;
	
	public List<TransactionType> findAll();
		
}
