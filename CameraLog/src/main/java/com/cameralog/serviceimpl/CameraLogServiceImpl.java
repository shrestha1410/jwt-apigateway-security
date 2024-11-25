package com.cameralog.serviceimpl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cameralog.entity.CameraLog;
import com.cameralog.repository.CameraLogRepository;
import com.cameralog.service.CameraLogService;

@Service
public class CameraLogServiceImpl implements CameraLogService{

	@Autowired
	private CameraLogRepository cameraRepository;

	@Override
	public CameraLog saveCameraDetails(CameraLog cameraLog) {
		
		CameraLog cameraData = cameraRepository.save(cameraLog);
		return cameraData;
	}

	@Override
	public CameraLog getCameraDetailsById(Long id) {
		
       Optional<CameraLog> cameraData = cameraRepository.findById(id);
       if(cameraData.isPresent()) {
    	   return cameraData.get();
       }
       return null;
	}
}
