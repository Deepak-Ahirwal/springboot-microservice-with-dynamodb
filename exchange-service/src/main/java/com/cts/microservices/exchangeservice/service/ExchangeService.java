package com.cts.microservices.exchangeservice.service;

import com.cts.microservices.exchangeservice.dto.ExchangeInfoVO;
import com.cts.microservices.exchangeservice.dto.ResponseVO;
import com.cts.microservices.exchangeservice.entity.ExchangeInfoEntity;

public interface ExchangeService {

	void save(ExchangeInfoEntity exchangeInfoEntity);

	/*ExchangeInfoVO getExchangeRate(String fromVal, String toVal);*/

	ResponseVO<ExchangeInfoVO> getExchangeRateVal(String fromVal, String toVal);

	ExchangeInfoVO getExchangeRateDetails(String fromVal, String toVal);

}
