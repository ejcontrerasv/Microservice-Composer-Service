package com.bandido.app.composer.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bandido.app.composer.models.DocumentsType;


@FeignClient(name = "documents-type-service")
public interface DocumentsTypeFeignClient {
	
	@GetMapping("/listar/{id}")
	public DocumentsType ListarPorId(@PathVariable("id") Integer id);

}
