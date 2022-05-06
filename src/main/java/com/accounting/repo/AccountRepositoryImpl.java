package com.accounting.repo;

import java.util.ArrayList;
import java.util.List;

import com.accounting.model.Account;
import com.accounting.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

public class AccountRepositoryImpl {}/*{

	MongoTemplate mongoTemplate;


	@Autowired
	public AccountRepositoryImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	private List<Account> accounts = new ArrayList<>();

	public Account findByAccountId(String accountId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("accountId").is(accountId));
		return (Account) mongoTemplate.findOne(query, Account.class);
	}

	public List<Account> findAll() {
		return accounts;
	}

}*/
