package com.cts.microservices.exchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.microservices.exchangeservice.dto.ExchangeInfoVO;
import com.cts.microservices.exchangeservice.dto.ResponseVO;
import com.cts.microservices.exchangeservice.service.ExchangeService;


@RestController
public class ExchangeController {
	
	@Autowired
	private ExchangeService exchangeService;
	
	/*@Autowired 
	private Environment env;*/
	
	@GetMapping("/exchange-rate/from/{fromVal}/to/{toVal}")
	public ResponseVO<ExchangeInfoVO> getUserById(@PathVariable("fromVal") final String fromVal,
			@PathVariable("toVal") final String toVal) {
		ExchangeInfoVO exchangeInfoVO= new ExchangeInfoVO();
		
		return null;
	}
	

}
