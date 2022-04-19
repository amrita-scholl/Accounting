package com.accounting.repo;

import java.util.ArrayList;
import java.util.List;

import com.accounting.model.Customer;

public class CustomerRepository {

	private List<Customer> customers = new ArrayList<>();
	
	public Customer add(Customer customer) {
		customer.setCustomerId((long) (customers.size()+1));
		customers.add(customer);
		return customer;
	}
	
	public Customer findById(Long id) {
		return customers.stream()
				.filter(a -> a.getCustomerId().equals(id))
				.findFirst()
				.orElseThrow();
	}
	
	public List<Customer> findAll() {
		return customers;
	}
		
}
