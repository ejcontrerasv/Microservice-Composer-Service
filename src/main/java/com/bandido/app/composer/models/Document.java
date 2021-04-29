package com.bandido.app.composer.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Document {
	
	private Long id;
	private String name;
	private LocalDateTime createAt;
	private  byte[] contentDocument;
	private String extensionFile; 
	private Integer idTypeDocument;
	private Integer idStatus;

}
