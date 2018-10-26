package com.cts.microservices.exchangeservice.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.cts.microservices.exchangeservice.entity.ExchangeInfoEntity;

@EnableScan
public interface ExchangeServiceRepository extends CrudRepository<ExchangeInfoEntity, String>{

	ExchangeInfoEntity findByFromValAndToVal(String fromVal, String toVal);
	
}
