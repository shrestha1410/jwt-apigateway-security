package com.failurelog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.failurelog.entity.FailureLog;

// @EnableMongoRepositories
@Repository
public interface FailureLogRepository extends JpaRepository<FailureLog, Long>{

}
