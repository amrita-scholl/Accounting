package com.accounting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "transactiontype")
public class TransactionType {

	@Id
	private String id;

	private String transactionTypeId;
	private String transactionType;
	

	public TransactionType() {

	}
	
	public TransactionType(String id,String transactionTypeId , String transactionType) {
		this.id = id;
		this.transactionType = transactionType;
		this.transactionTypeId = transactionTypeId;
	}

	public String getTransactionTypeId() {
		return transactionTypeId;
	}

	public void setTransactionTypeId(String transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "Employee [transactionTypeId=" + transactionTypeId + ", transactionType=" + transactionType + "]";
	}

}
