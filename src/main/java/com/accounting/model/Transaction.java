package com.accounting.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "transactions")
public class Transaction {

	@Id
	private String id;
	private String transactionId;
	private String transactionDate;
	private String transactionTypeId;
	private String transactionAmount;
	private String transactionNote;
	private String balance;

	public Transaction() {

	}
	
	public Transaction(String id, String transactionId, String transactionDate, String transactionTypeId, String transactionAmount,String transactionNote, String balance) {
		super();
		this.id = id;
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.transactionTypeId = transactionTypeId;
		this.transactionAmount = transactionAmount;
		this.transactionNote = transactionNote;
		this.balance = balance;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionTypeId() {
		return transactionTypeId;
	}

	public void setTransactionTypeId(String transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionNote() {
		return transactionNote;
	}

	public void setTransactionNote(String transactionNote) {
		this.transactionNote = transactionNote;
	}
	
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Employee [transactionId=" + transactionId +  ", transactionDate=" + transactionDate
				+ ", transactionTypeId=" + transactionTypeId + ", balance=" + balance 
				+ ", transactionAmount=" + transactionAmount + ", transactionNote=" + transactionNote +"]";
	}

}
