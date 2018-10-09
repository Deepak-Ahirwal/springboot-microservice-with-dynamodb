package com.cts.microservices.exchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@ComponentScan({"com.cts.microservices.exchangeservice",
	"com.cts.microservices.exchangeservice.controller",
	"com.cts.microservices.exchangeservice.service"})*/
@SpringBootApplication
public class ExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeServiceApplication.class, args);
	}
}
