package com.failurelog.entity;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

// import org.springframework.data.annotation.Id;
// import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
// @Document(collection = "failurelog")
@Table(name="failurelog")
@Entity
public class FailureLog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String atmId;
	private String failureType;
	private LocalDateTime timeStamp = LocalDateTime.now();
	private String context;
}
