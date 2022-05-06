package com.accounting.repo;

import java.util.ArrayList;
import java.util.List;

import com.accounting.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


public class CustomerRepositoryImpl {} /*{

	private final MongoTemplate mongoTemplate;

	@Autowired
	public CustomerRepositoryImpl() {
		this.mongoTemplate = mongoTemplate;
	}
	private List<Customer> customers = new ArrayList<>();

	@Override
	public Customer findCustomerById(String customerId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("customerId").is(customerId));
		return (Customer) mongoTemplate.findOne(query, Customer.class);
	}

	@Override
	public List<Customer> findAll() {
		//return customers;
		String collectionName = "customers";
		return mongoTemplate.findAll(Customer.class);
	}

}*/
