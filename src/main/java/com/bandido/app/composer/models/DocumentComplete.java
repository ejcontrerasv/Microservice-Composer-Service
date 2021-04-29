package com.bandido.app.composer.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentComplete {
	
	private Long id;
	private String name;
	private LocalDateTime createAt;
	private  byte[] contentDocument;
	private String extensionFile; 
	private DocumentsType documentsType;
	private Status status;
	
	public DocumentComplete(Document doc) {
		this.setId(doc.getId());
		this.setName(doc.getName());
		this.setCreateAt(doc.getCreateAt());
		this.setContentDocument(doc.getContentDocument());
		this.setExtensionFile(doc.getExtensionFile());
	}

}
