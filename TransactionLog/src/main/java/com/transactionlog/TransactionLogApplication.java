package com.transactionlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TransactionLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionLogApplication.class, args);
	}

}
