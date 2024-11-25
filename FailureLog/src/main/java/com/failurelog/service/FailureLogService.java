package com.failurelog.service;

import com.failurelog.entity.FailureLog;

public interface FailureLogService {

	FailureLog saveFailureLogDetails(FailureLog failureLog);

	FailureLog getFailureDetailsById(Long id);

}
