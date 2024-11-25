package com.transactionlog.serviceimpl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transactionlog.entity.TransactionLog;
import com.transactionlog.repository.TransactionLogRepository;
import com.transactionlog.responseDto.TransactionSummaryDto;
import com.transactionlog.service.TransactionLogService;

@Service
public class TransactionLogServiceImpl implements TransactionLogService{

	@Autowired
	private TransactionLogRepository transactionRepository;

	@Override
	public TransactionLog saveTransactionDetails(TransactionLog transactionLog) {
		
		TransactionLog transaction = transactionRepository.save(transactionLog);
		return transaction;
	}

	@Override
	public TransactionLog getTransactionDetailsById(Long id) {
		
		Optional<TransactionLog> transaction = transactionRepository.findById(id);
		if(transaction.isPresent()) {
			return transaction.get();
		}
		return null;
	}

	@Override
	public TransactionSummaryDto getTransactionSummary() {

		List<TransactionLog> transactionLogs = transactionRepository.findAll();

		long totalCustomers = transactionLogs.stream().map(TransactionLog::getCustomerId).distinct().count();

		Map<String, Long> transactionBreakdown = transactionLogs.stream()
				.collect(Collectors.groupingBy(TransactionLog::getTransactionType, Collectors.counting()));

		return new TransactionSummaryDto(totalCustomers, transactionBreakdown);

	}
}
