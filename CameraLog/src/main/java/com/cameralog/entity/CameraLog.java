package com.cameralog.entity;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

// import org.springframework.data.annotation.Id;
// import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
// @Document(collection = "cameralog")
@Table(name="cameralog")
@Entity
public class CameraLog {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String atmId;
	private LocalDateTime startTime = LocalDateTime.now();
	private LocalDateTime endTime = LocalDateTime.now().plusHours(24);
	private String mediaType;
	private String filePath;
}
