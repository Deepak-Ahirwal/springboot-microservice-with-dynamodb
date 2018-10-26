package com.cts.microservices.conversionservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.microservices.conversionservice.dto.ConversionDetailsVO;

//@FeignClient("exchange-service")
@FeignClient("api-gateway-server")
@RibbonClient("exchange-service")
public interface ExchangeProxy {
	
	//@GetMapping("/exchange-rate-data/from/{fromVal}/to/{toVal}")
	@GetMapping("/exchange-service/exchange-rate-data/from/{fromVal}/to/{toVal}")
	public ConversionDetailsVO getConversionDetails(@PathVariable("fromVal") final String fromVal,
			@PathVariable("toVal") final String toVal);
		
	}
