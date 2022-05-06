package com.accounting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "accounts")
public class Account {

	@Id
	public String id;

	private String accountId;

	private String minBalance;
	private String currentBalance;
	private String dateOpened;
	private String dateClosed;


	public Account(String id, String accountId, String minBalance, String currentBalance, String dateOpened, String dateClosed) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.minBalance = minBalance;
		this.currentBalance = currentBalance;
		this.dateOpened = dateOpened;
		this.dateClosed = dateClosed;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
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

	public String getdateOpened() {
		return dateOpened;
	}

	public void setdateOpened(String dateOpened) {
		this.dateOpened = dateOpened;
	}

	public String getdateClosed() {
		return dateClosed;
	}

	public void setdateClosed(String dateClosed) {
		this.dateClosed = dateClosed;
	}

	@Override
	public String toString() {
		return "Employee [accountId=" + accountId + ", dateClosed=" + dateClosed
				+ ", minBalance=" + minBalance + ", currentBalance=" + currentBalance + "]";
	}

}
