package br.com.vitor.exchangeratesapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitor.exchangeratesapi.entities.Exchange;
import br.com.vitor.exchangeratesapi.service.ExchangeService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ExchangeController {
	
	private ExchangeService exchangeService;
			
	@GetMapping(value = "/exchange/{version}")
	public ResponseEntity<Exchange> getByCurrency(@PathVariable String version){
		
		Exchange exchange = exchangeService.getByCurrency(version);
		
		String t = exchange.getBase();
		
		return ResponseEntity.status(HttpStatus.CREATED).body(exchange);
		
	}


}
