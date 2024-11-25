
package com.transactionlog.responseDto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionSummaryDto {

	private long totalCustomers;
	private Map<String, Long> transactionBreakdown;

}
