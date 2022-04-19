package com.accounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.accounting.model.Account;
import com.accounting.model.Customer;
import com.accounting.model.Transaction;
import com.accounting.model.TransactionType;
import com.accounting.repo.AccountRepository;
import com.accounting.repo.CustomerRepository;
import com.accounting.repo.TransactionRepository;
import com.accounting.repo.TransactionTypeRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@OpenAPIDefinition(info =
		@Info(title = "Accounting API", version = "1.0", description = "Documentation Accounting API v1.0")
)
public class AccountingApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AccountingApplication.class, args);
	}
	
	
	@Bean
	CustomerRepository repository() {
		CustomerRepository repository = new CustomerRepository();
		repository.add(new Customer(1L, "abc@abc", "John Smith", "02-02-2022", "02-02-2022"));
		repository.add(new Customer(2L, "erew@we", "Sia wdwd", "02-02-2022", "04-02-2022"));
		repository.add(new Customer(3L, "klijkl@ewd", "Acy dwef", "02-02-2022", "02-01-2021"));
		repository.add(new Customer(4L, "sd@sdfdf", "Arah trytj", "02-02-2022", "01-09-2021"));
		repository.add(new Customer(5L, "sd@dfdsf", "umbr sfdsf", "02-02-2022", "02-02-2021"));
		repository.add(new Customer(7L, "sd@dvcxv", "aber ddsf", "02-02-2022", "02-11-2020"));
		repository.add(new Customer(8L, "sddsf@qewe", "que sdfdsf", "02-02-2022", "10-12-2020"));
		repository.add(new Customer(9L, "safd@sad", "dwd sfddsf", "02-02-2022", "09-02-2021"));
		repository.add(new Customer(10L, "sfd@sd", "Jowdwdhn sfd", "02-02-2022", "18-02-2021"));
		repository.add(new Customer(11L, "sd@sds", "Jowdwdhn dfd", "02-02-2022", "14-02-2021"));
		repository.add(new Customer(12L, "c@sfsf", "Jowdwdhn dfdf", "02-02-2022", "02-01-2022"));
		return repository;
	}
	
	@Bean
	AccountRepository accrepository() {
		AccountRepository accrepository = new AccountRepository();
		accrepository.add(new Account(1L, "234", "45", "02-02-2022", "02-02-2022"));
		accrepository.add(new Account(2L, "45", "2345", "02-02-2022", "02-02-2022"));
		accrepository.add(new Account(3L, "2323", "23334", "02-02-2022", "02-01-2021"));
		accrepository.add(new Account(4L, "32434", "46456", "02-02-2022", "01-09-2021"));
		accrepository.add(new Account(5L, "324", "436", "02-02-2022", "02-02-2021"));
		accrepository.add(new Account(7L, "324", "346346", "02-02-2022", "02-11-2020"));
		accrepository.add(new Account(8L, "2341", "3636", "02-02-2022", "10-12-2020"));
		accrepository.add(new Account(9L, "56567", "43535", "02-02-2022", "09-02-2021"));
		accrepository.add(new Account(10L, "567", "45656", "02-02-2022", "18-02-2021"));
		accrepository.add(new Account(11L, "456", "546456", "02-02-2022", "14-02-2021"));
		accrepository.add(new Account(12L, "356", "456546", "02-02-2022", "02-01-2022"));
		return accrepository;
	}

	@Bean
	TransactionRepository transrepository() {
		TransactionRepository transrepository = new TransactionRepository();
		transrepository.add(new Transaction(1L, 1L,"02-02-2022", 1L ,"8787", "uiyubb" , "987987" ));
		transrepository.add(new Transaction(2L, 2L,"02-02-2022", 2L ,"8787", "dfgdfg" , "67" ));
		transrepository.add(new Transaction(3L, 3L,"02-02-2022", 3L ,"8787", "dfg" , "546" ));
		transrepository.add(new Transaction(4L, 4L,"02-02-2022", 4L ,"8787", "dfd" , "456" ));
		transrepository.add(new Transaction(5L, 5L,"02-02-2022", 5L ,"8787", "dgf" , "456" ));
		transrepository.add(new Transaction(6L, 6L,"02-02-2022", 6L ,"8787", "dgfg" , "456" ));
		transrepository.add(new Transaction(7L, 7L,"02-02-2022", 7L ,"8787", "dgfg" , "456" ));
		transrepository.add(new Transaction(8L, 8L,"02-02-2022", 8L ,"8787", "dgdfg" , "546" ));
		transrepository.add(new Transaction(9L, 9L,"02-02-2022", 9L ,"8787", "fdhfh" , "456" ));
		transrepository.add(new Transaction(10L, 10L,"02-02-2022", 10L ,"8787", "fdg" , "4567" ));
		transrepository.add(new Transaction(11L, 11L,"02-02-2022", 11L ,"8787", "hkrtry" , "476" ));
		transrepository.add(new Transaction(12L, 12L,"02-02-2022", 12L ,"8787", "fdg" , "456" ));
		transrepository.add(new Transaction(13L, 13L,"02-02-2022", 13L ,"8787", "fhggfh" , "5466" ));
		transrepository.add(new Transaction(14L, 14L,"02-02-2022", 14L ,"8787", "fdhgfh" , "456" ));
		transrepository.add(new Transaction(15L, 15L,"02-02-2022", 15L ,"8787", "dfhfdh" , "456" ));
		return transrepository;
	}
	
	@Bean
	TransactionTypeRepository transtyrepository() {
		TransactionTypeRepository transtyrepository = new TransactionTypeRepository();
		transtyrepository.add(new TransactionType(1L, "withdraw" ));
		transtyrepository.add(new TransactionType(2L, "deposit" ));
		transtyrepository.add(new TransactionType(3L, "withdraw" ));
		transtyrepository.add(new TransactionType(4L, "deposit" ));
		transtyrepository.add(new TransactionType(5L, "withdraw" ));
		transtyrepository.add(new TransactionType(6L, "deposit" ));
		transtyrepository.add(new TransactionType(7L, "withdraw" ));
		transtyrepository.add(new TransactionType(8L, "deposit" ));
		transtyrepository.add(new TransactionType(9L, "withdraw" ));
		transtyrepository.add(new TransactionType(10L, "deposit" ));
		transtyrepository.add(new TransactionType(11L, "withdraw" ));
		
		return transtyrepository;
	}
	
}
