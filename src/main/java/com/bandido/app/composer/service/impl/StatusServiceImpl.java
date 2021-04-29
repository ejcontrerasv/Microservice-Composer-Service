package com.bandido.app.composer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bandido.app.composer.clients.StatusFeignClient;
import com.bandido.app.composer.models.Document;
import com.bandido.app.composer.models.Status;
import com.bandido.app.composer.service.IStatusService;

@Service
public class StatusServiceImpl implements IStatusService {

	@Autowired
	private StatusFeignClient statusClient;
	

	@Override
	public Status findStatusById(Document doc) {
		
		return statusClient.listarPorId(doc.getIdStatus());
	}

}
