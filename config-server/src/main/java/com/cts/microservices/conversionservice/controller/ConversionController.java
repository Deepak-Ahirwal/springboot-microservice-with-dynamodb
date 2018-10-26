package com.cts.microservices.conversionservice.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.microservices.conversionservice.dto.ConversionDetailsVO;
import com.cts.microservices.conversionservice.service.ConversionService;

@RestController
public class ConversionController {
	
	@Autowired
	private ConversionService conversionService;
	
	private final static Logger LOGGER = LoggerFactory.getLogger(ConversionController.class);


	
	@GetMapping("/conversion-rate-feign/from/{fromVal}/to/{toVal}/quantity/{quantity}")
	public ConversionDetailsVO getConversionDetails(@PathVariable("fromVal") final String fromVal,
			@PathVariable("toVal") final String toVal,@PathVariable("quantity") final BigDecimal quantity){
		LOGGER.info("ConversionController : getConversion() :: called for userId:" + fromVal);
		LOGGER.info("ConversionController : getConversion() :: called for userId:" + toVal);
		LOGGER.info("ConversionController : getConversion() :: called for userId:" + quantity);
		ConversionDetailsVO resp = conversionService.getConversionDetails(fromVal,toVal,quantity);//userService.getUserById(userId);
		//customSpan();
		return resp;
		
		
	} 
	
	
}
