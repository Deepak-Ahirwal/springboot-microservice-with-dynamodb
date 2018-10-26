package com.cts.microservices.conversionservice.service;

import java.math.BigDecimal;

import com.cts.microservices.conversionservice.dto.ConversionDetailsVO;

public interface ConversionService {

	ConversionDetailsVO getConversionDetails(String fromVal, String toVal, BigDecimal quantity);


}
