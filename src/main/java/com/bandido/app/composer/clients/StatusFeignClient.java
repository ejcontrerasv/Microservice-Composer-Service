package com.bandido.app.composer.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bandido.app.composer.models.Status;


@FeignClient(name = "status-service")
public interface StatusFeignClient {

	@GetMapping("/listar/{id}")
	public Status listarPorId(@PathVariable("id") Integer id);

}
