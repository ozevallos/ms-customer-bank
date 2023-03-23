package com.nttdata.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MsCustomerBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCustomerBankApplication.class, args);
	}
}
