package com.cts.microservices.exchangeservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.microservices.exchangeservice.dto.ExchangeInfoVO;
import com.cts.microservices.exchangeservice.dto.ResponseVO;
import com.cts.microservices.exchangeservice.service.ExchangeService;



@RestController
public class ExchangeController {
	private final static Logger LOGGER = LoggerFactory.getLogger(ExchangeController.class);

	
	@Autowired
	private ExchangeService exchangeService;
	
	/*@RequestMapping("/save")
	public String save() {
		LOGGER.info("inside MessageController	::	save()");
		exchangeService.save(new ExchangeInfoEntity("Sno-3", "EUR", "INR", BigDecimal.valueOf(85)));
		return "Done";
	}*/
	
	@GetMapping("/exchange-rate/from/{fromVal}/to/{toVal}")
	public ResponseVO<ExchangeInfoVO> getExchangeRateVal(@PathVariable("fromVal") final String fromVal,
			@PathVariable("toVal") final String toVal) {
		LOGGER.info("ExchangeController:getExchangeRate() :: called for fromVal:" + fromVal);
		LOGGER.info("ExchangeController:getExchangeRate() :: called for toVal:" + toVal);
		ResponseVO<ExchangeInfoVO> response = exchangeService.getExchangeRateVal(fromVal, toVal);
		return response;
	}
	
	@GetMapping("/exchange-rate-data/from/{fromVal}/to/{toVal}")
	public ExchangeInfoVO getExchangeRateDetails(@PathVariable("fromVal") final String fromVal,
			@PathVariable("toVal") final String toVal) {
		LOGGER.info("ExchangeController:getExchangeRateData() :: called for fromVal:" + fromVal);
		LOGGER.info("ExchangeControllergetExchangeRateData():: called for toVal:" + toVal);
		ExchangeInfoVO response = exchangeService.getExchangeRateDetails(fromVal, toVal);
		return response;
	}

}
