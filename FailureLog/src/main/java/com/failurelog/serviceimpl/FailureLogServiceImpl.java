package com.failurelog.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.failurelog.entity.FailureLog;
import com.failurelog.repository.FailureLogRepository;
import com.failurelog.service.FailureLogService;

@Service
public class FailureLogServiceImpl implements FailureLogService{

	@Autowired
	private FailureLogRepository failureRepository;

	@Override
	public FailureLog saveFailureLogDetails(FailureLog failureLog) {
		
		FailureLog failureData = failureRepository.save(failureLog);
		return failureData;
	}

	@Override
	public FailureLog getFailureDetailsById(Long id) {
		
		Optional<FailureLog> failureData = failureRepository.findById(id);
		if(failureData.isPresent()) {
			return failureData.get();
		}
		return null;
	}
}
