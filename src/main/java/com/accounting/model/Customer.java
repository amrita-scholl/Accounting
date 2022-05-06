package com.accounting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "customers")
public class Customer {

	@Id
	private String id;
	private String customerId;
	private String email;
	private String name;
	private String dateopened;

	private String dateclosed;

	public Customer() {

	}
	
	public Customer(String id,String email, String name, String dateopened, String dateclosed) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.dateopened = dateopened;
		this.dateclosed = dateclosed;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomerName() {
		return name;
	}

	public void setCustomerName(String name) {
		this.name = name;
	}

	public String getdateopened() {
		return dateopened;
	}

	public void setdateopened(String dateopened) {
		this.dateopened = dateopened;
	}

	public String getdateclosed() {
		return dateclosed;
	}

	public void setdateclosed(String dateclosed) {
		this.dateclosed = dateclosed;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", customerId=" + customerId + ", dateclosed=" + dateclosed
				+ ", name=" + name + ", dateopened=" + dateopened + "]";
	}

}
