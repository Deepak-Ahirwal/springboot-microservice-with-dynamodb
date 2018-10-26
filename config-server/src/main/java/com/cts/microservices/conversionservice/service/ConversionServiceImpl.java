package com.cts.microservices.conversionservice.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.microservices.conversionservice.dto.ConversionDetailsVO;
import com.cts.microservices.conversionservice.proxy.ExchangeProxy;

@Service
public class ConversionServiceImpl implements ConversionService {
	private final static Logger LOGGER = LoggerFactory.getLogger(ConversionServiceImpl.class);

	@Autowired
	private ExchangeProxy proxy;

	@Override
	public ConversionDetailsVO getConversionDetails(String fromVal, String toVal, BigDecimal quantity) {
		LOGGER.info("ConversionServiceImpl:getConversion() :: called for fromVal:" + fromVal);
		LOGGER.info("ConversionServiceImpl:getConversion() :: called for toVal:" + toVal);
		LOGGER.info("ConversionServiceImpl:getConversion() :: called for quantity:" + quantity);
		ConversionDetailsVO response = proxy.getConversionDetails(fromVal, toVal);

		return new ConversionDetailsVO(response.getId(), fromVal, toVal, response.getMultipleVal(), quantity,
				quantity.multiply(response.getMultipleVal()), response.getPort());
	}

}
