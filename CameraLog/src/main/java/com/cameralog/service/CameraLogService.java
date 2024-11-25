package com.cameralog.service;

import com.cameralog.entity.CameraLog;

public interface CameraLogService {

	CameraLog saveCameraDetails(CameraLog cameraLog);

	CameraLog getCameraDetailsById(Long id);

}
