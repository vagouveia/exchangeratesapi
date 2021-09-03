package br.com.vitor.exchangeratesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients 
public class ExchangeratesapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeratesapiApplication.class, args);
	}

}
