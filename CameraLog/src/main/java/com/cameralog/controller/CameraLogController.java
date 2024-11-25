package com.cameralog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cameralog.entity.CameraLog;
import com.cameralog.service.CameraLogService;

@RequestMapping("/camera/")
@RestController
public class CameraLogController {

	@Autowired
	private CameraLogService cameraService;
	
	@PostMapping("addCamera")
	public CameraLog saveCameraLogDetails(@RequestBody CameraLog cameraLog) {
		
		CameraLog cameraData = cameraService.saveCameraDetails(cameraLog);
		return cameraData;
	}
	
	@GetMapping("cameraById") 
	public CameraLog getCameraDetailById(@RequestParam Long id) {
		
		CameraLog cameraData = cameraService.getCameraDetailsById(id);
		return cameraData;
	}
}
