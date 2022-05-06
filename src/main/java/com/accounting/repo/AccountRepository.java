package com.accounting.repo;

import com.accounting.model.Account;
import com.accounting.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends MongoRepository<Account,String> {

    @Query("{accountId:'?0'}")
    Optional<Account> findById(String accountId);

    @Query("{accountId:'?*'}")
    public List<Account> findAll();
}
