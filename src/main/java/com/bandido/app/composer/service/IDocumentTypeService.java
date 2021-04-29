package com.bandido.app.composer.service;

import com.bandido.app.composer.models.Document;
import com.bandido.app.composer.models.DocumentsType;

public interface IDocumentTypeService {
	
	public DocumentsType findDocumentTypeById(Document doc);

}
