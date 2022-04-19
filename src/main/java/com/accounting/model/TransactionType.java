package com.accounting.model;

public class TransactionType {

	private Long transactionTypeId;
	private String transactionType;
	

	public TransactionType() {

	}
	
	public TransactionType(Long transactionTypeId , String transactionType) {
		this.transactionType = transactionType;
		this.transactionTypeId = transactionTypeId;
	}

	public Long getTransactionTypeId() {
		return transactionTypeId;
	}

	public void setTransactionTypeId(Long transactionTypeId) {
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
