package com.bandido.app.composer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bandido.app.composer.clients.DocumentsTypeFeignClient;
import com.bandido.app.composer.models.Document;
import com.bandido.app.composer.models.DocumentsType;
import com.bandido.app.composer.service.IDocumentTypeService;

@Service
public class DocumentTypeServiceImpl implements IDocumentTypeService {
	
	@Autowired
	private DocumentsTypeFeignClient docTypeClient;
	

	@Override
	public DocumentsType findDocumentTypeById(Document doc) {
		
		return docTypeClient.ListarPorId(doc.getIdTypeDocument());
	}

}
