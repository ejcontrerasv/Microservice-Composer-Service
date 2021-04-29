package com.bandido.app.composer.composer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.stereotype.Component;

import com.bandido.app.composer.models.Document;
import com.bandido.app.composer.models.DocumentComplete;
import com.bandido.app.composer.models.DocumentsType;
import com.bandido.app.composer.models.Status;
import com.bandido.app.composer.service.IDocumentTypeService;
import com.bandido.app.composer.service.IStatusService;

@Component
@RibbonClients({@RibbonClient(name = "status-service"), 
	@RibbonClient(name = "documents-type-service"), 
	@RibbonClient(name = "documents-service")})
public class DocumentComposer {
	
	@Autowired
	private IDocumentTypeService docTypeService;
	
	@Autowired 
	private IStatusService statusService;
	
	public DocumentComplete parserDocument(Document doc) {

		DocumentsType docType = docTypeService.findDocumentTypeById(doc);
		Status status = statusService.findStatusById(doc);
		
		DocumentComplete docComplete = new DocumentComplete(doc);
		
		docComplete.setDocumentsType(docType);
		docComplete.setStatus(status);
		
		return docComplete;
		
	}

}
