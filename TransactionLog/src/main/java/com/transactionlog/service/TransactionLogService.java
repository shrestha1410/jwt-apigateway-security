package com.transactionlog.service;

import com.transactionlog.entity.TransactionLog;
import com.transactionlog.responseDto.TransactionSummaryDto;

public interface TransactionLogService {

	TransactionLog saveTransactionDetails(TransactionLog transactionLog);

	TransactionLog getTransactionDetailsById(Long id);

	TransactionSummaryDto getTransactionSummary();

}
