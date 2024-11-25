package com.cameralog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.cameralog.entity.CameraLog;

// @EnableMongoRepositories
@Repository
public interface CameraLogRepository extends JpaRepository<CameraLog, Long>{

}
