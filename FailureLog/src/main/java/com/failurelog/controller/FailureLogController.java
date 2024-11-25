package com.failurelog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.failurelog.entity.FailureLog;
import com.failurelog.service.FailureLogService;

@RequestMapping("/failure/")
@RestController
public class FailureLogController {

	@Autowired
	private FailureLogService failureService;
	
	@PostMapping("addFailure")
	public FailureLog saveFailureLogDetails(@RequestBody FailureLog failureLog) {
		
		FailureLog failureData = failureService.saveFailureLogDetails(failureLog);
		return failureData;
	}
	
	@GetMapping("failureById")
	public FailureLog getFailureDetailsById(@RequestParam Long id) {
		
		FailureLog failureData = failureService.getFailureDetailsById(id);
		return failureData;
	}
}
