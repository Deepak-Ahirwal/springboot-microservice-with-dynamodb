package com.cts.microservices.messageretrievalservice.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.cts.microservices.messageretrievalservice.model.IotMqttPublishedMsg;

@EnableScan
public interface IotMqttPublishedMsgReository extends CrudRepository<IotMqttPublishedMsg, String>{

	//List<IotMqttPublishedMsg> save(List<IotMqttPublishedMsg> asList);

	

}
