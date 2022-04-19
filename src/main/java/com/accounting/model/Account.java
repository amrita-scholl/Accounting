package com.accounting.model;

public class Account {

	private Long accountId;
	private Long customerId;
	private String minBalance;
	private String currentBalance;
	private String dateopened;
	private String dateclosed;

	public Account() {

	}
	
	public Account(Long accountId, String minBalance, String currentBalance, String dateopened, String dateclosed) {
		this.accountId = accountId;
		this.minBalance = minBalance;
		this.currentBalance = currentBalance;
		this.dateopened = dateopened;
		this.dateclosed = dateclosed;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(String minBalance) {
		this.minBalance = minBalance;
	}

	public String getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getDateOpened() {
		return dateopened;
	}

	public void setDateOpened(String dateopened) {
		this.dateopened = dateopened;
	}

	public String getDateClosed() {
		return dateclosed;
	}

	public void setDateClosed(String dateclosed) {
		this.dateclosed = dateclosed;
	}

	@Override
	public String toString() {
		return "Employee [accountId=" + accountId + ", customerId=" + customerId + ", dateclosed=" + dateclosed
				+ ", minBalance=" + minBalance + ", currentBalance=" + currentBalance + "]";
	}

}
