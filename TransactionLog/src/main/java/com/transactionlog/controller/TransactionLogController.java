package com.transactionlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.transactionlog.entity.TransactionLog;
import com.transactionlog.responseDto.TransactionSummaryDto;
import com.transactionlog.service.TransactionLogService;

@RequestMapping("/transaction/")
@RestController
public class TransactionLogController {

	@Autowired
	private TransactionLogService transactionService;
	
	@PostMapping("addTransaction")
	public TransactionLog saveTransactionDetails(@RequestBody TransactionLog transactionLog) {
		
		TransactionLog transaction = transactionService.saveTransactionDetails(transactionLog);
		return transaction;
	}
	
	@GetMapping("transactionById")
	public TransactionLog getTransactionDetailsById(@RequestParam Long id) {
		
		TransactionLog transaction = transactionService.getTransactionDetailsById(id);
		return transaction;
	}
	
	@GetMapping("summary")
	public TransactionSummaryDto getTransactionSummary() {
        TransactionSummaryDto summary = transactionService.getTransactionSummary();
        return summary;
    }
	@GetMapping("test")
	public String test(){
		return "hello";
	}
}
