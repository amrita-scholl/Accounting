package com.accounting.model;


public class Transaction {

	private Long transactionId;
	private Long accountId;
	private String transactionDate;
	private Long transactionTypeId;
	private String transactionAmount;
	private String transactionNote;
	private String balance;

	public Transaction() {

	}
	
	public Transaction(Long transactionId, Long accountId, String transactionDate, Long transactionTypeId, String transactionAmount,String transactionNote, String balance) {
		this.transactionId = transactionId;
		this.accountId = accountId;
		this.transactionDate = transactionDate;
		this.transactionTypeId = transactionTypeId;
		this.transactionAmount = transactionAmount;
		this.transactionNote = transactionNote;
		this.balance = balance;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Long getTransactionTypeId() {
		return transactionTypeId;
	}

	public void setTransactionTypeId(Long transactionTypeId) {
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
		return "Employee [transactionId=" + transactionId + ", accountId=" + accountId + ", transactionDate=" + transactionDate
				+ ", transactionTypeId=" + transactionTypeId + ", balance=" + balance 
				+ ", transactionAmount=" + transactionAmount + ", transactionNote=" + transactionNote +"]";
	}

}
