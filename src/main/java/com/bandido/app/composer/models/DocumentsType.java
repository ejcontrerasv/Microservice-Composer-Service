package com.bandido.app.composer.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DocumentsType {
	
	private Integer id;
	private String name;
	private String description;
	private Status status;

}
