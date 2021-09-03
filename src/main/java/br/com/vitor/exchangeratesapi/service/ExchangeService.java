package br.com.vitor.exchangeratesapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.vitor.exchangeratesapi.entities.Exchange;

@FeignClient(url="http://api.exchangeratesapi.io", name="exchange")
public interface ExchangeService {

	@GetMapping("/{version}/latest?access_key={api key}&format=1")
	public Exchange getByCurrency (@PathVariable("version") String version );

	
}
