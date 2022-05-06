package com.accounting.repo;

import java.util.ArrayList;
import java.util.List;
import com.accounting.model.TransactionType;
import org.springframework.stereotype.Component;

@Component
public class TransactionTypeRepositoryImpl implements  TransactionTypeRepository{

	private List<TransactionType> transactionTypes = new ArrayList<>();
	
	public TransactionType add(TransactionType transactionType) {
		transactionType.setTransactionTypeId(""+(transactionTypes.size()+1));
		transactionTypes.add(transactionType);
		return transactionType;
	}
	
	public TransactionType findById(String id) {
		return transactionTypes.stream()
				.filter(a -> a.getTransactionTypeId().equals(id))
				.findFirst()
				.orElseThrow();
	}
	
	public List<TransactionType> findAll() {
		return transactionTypes;
	}
		
}
