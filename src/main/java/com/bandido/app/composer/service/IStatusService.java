package com.bandido.app.composer.service;

import com.bandido.app.composer.models.Document;
import com.bandido.app.composer.models.Status;

public interface IStatusService {
	
	public Status findStatusById(Document doc);

}
