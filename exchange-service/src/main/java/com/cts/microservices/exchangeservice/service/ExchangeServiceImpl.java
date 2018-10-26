package com.cts.microservices.exchangeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.cts.microservices.exchangeservice.dto.ExchangeInfoVO;
import com.cts.microservices.exchangeservice.dto.ResponseVO;
import com.cts.microservices.exchangeservice.entity.ExchangeInfoEntity;
import com.cts.microservices.exchangeservice.repository.ExchangeServiceRepository;


@Service
public class ExchangeServiceImpl implements ExchangeService{
	
	
	@Autowired
	private ExchangeServiceRepository repo;
	
	@Autowired 
	private Environment env;
	
	@Override
	public void save(ExchangeInfoEntity exchangeInfoEntity) {
		repo.save(exchangeInfoEntity);
		
	}

/*	@Override
	public ExchangeInfoVO getExchangeRate(String fromVal, String toVal) {
		ExchangeInfoVO vo = new ExchangeInfoVO();
		ExchangeInfoEntity entity = repo.findByFromValAndToVal(fromVal, toVal);
		vo.setFromVal(entity.getFromVal());
		vo.setId(entity.getId());
		vo.setToVal(entity.getToVal());
		vo.setMultipleVal(entity.getMultipleVal());
		return vo;
	}*/

	@Override
	public ResponseVO<ExchangeInfoVO> getExchangeRateVal(String fromVal, String toVal) {
		ExchangeInfoVO vo = new ExchangeInfoVO();
		ExchangeInfoEntity entity = repo.findByFromValAndToVal(fromVal, toVal);
		vo.setFromVal(entity.getFromVal());
		vo.setId(entity.getId());
		vo.setToVal(entity.getToVal());
		vo.setMultipleVal(entity.getMultipleVal());
		vo.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return ResponseVO.createSuccessResponse(vo);
	}

	@Override
	public ExchangeInfoVO getExchangeRateDetails(String fromVal, String toVal) {
		ExchangeInfoVO vo = new ExchangeInfoVO();
		ExchangeInfoEntity entity = repo.findByFromValAndToVal(fromVal, toVal);
		vo.setFromVal(entity.getFromVal());
		vo.setId(entity.getId());
		vo.setToVal(entity.getToVal());
		vo.setMultipleVal(entity.getMultipleVal());
		vo.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return vo;
	}

}
