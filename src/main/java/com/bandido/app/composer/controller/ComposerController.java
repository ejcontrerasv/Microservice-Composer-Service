package com.bandido.app.composer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bandido.app.composer.composer.DocumentComposer;
import com.bandido.app.composer.models.Document;
import com.bandido.app.composer.models.DocumentComplete;

@RestController
public class ComposerController {
	
	@Autowired
	private DocumentComposer composer;
	
	@GetMapping("/document/complete")
	public ResponseEntity<DocumentComplete> getCompleteDocument(Document doc){
		DocumentComplete docComplete = composer.parserDocument(doc);
		return new ResponseEntity<DocumentComplete>(docComplete, HttpStatus.OK);
	}

}
