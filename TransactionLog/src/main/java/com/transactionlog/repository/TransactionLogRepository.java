package com.transactionlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.transactionlog.entity.TransactionLog;

// @EnableMongoRepositories
@Repository
public interface TransactionLogRepository extends JpaRepository<TransactionLog, Long>{

}
