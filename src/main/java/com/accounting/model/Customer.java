package com.accounting.model;

import java.sql.Date;

public class Customer {

	private Long id;
	private Long phone;
	private String email;
	private String name;
	private String dateopened;
	private String dateclosed;

	public Customer() {

	}
	
	public Customer(Long phone, String email, String name, String dateopened, String dateclosed) {
		this.phone = phone;
		this.email = email;
		this.name = name;
		this.dateopened = dateopened;
		this.dateclosed = dateclosed;
	}

	public Long getCustomerId() {
		return id;
	}

	public void setCustomerId(Long id) {
		this.id = id;
	}

	public Long getCustomerPhone() {
		return phone;
	}

	public void setCustomerPhone(Long phone) {
		this.phone = phone;
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
		return "Employee [id=" + id + ", email=" + email + ", dateclosed=" + dateclosed
				+ ", name=" + name + ", dateopened=" + dateopened + "]";
	}

}
