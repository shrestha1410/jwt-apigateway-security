package com.transactionlog.entity;

import java.time.LocalDateTime;


// import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
// @Document(collection = "transactionlog")
@Table(name="transactionlog")
@Entity
public class TransactionLog {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String customerId;
	private String transactionType;
	private LocalDateTime timeStamp = LocalDateTime.now();
	private Double amount;
}
