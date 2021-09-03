package br.com.vitor.exchangeratesapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.vitor.exchangeratesapi.entities.Exchange;

@FeignClient(url="http://api.exchangeratesapi.io", name="exchange")
public interface ExchangeService {

	@GetMapping("/{version}/latest?access_key=34ebd71f5c82a6027da7fd4246852ee1&format=1")
	public Exchange getByCurrency (@PathVariable("version") String version );

	
}
