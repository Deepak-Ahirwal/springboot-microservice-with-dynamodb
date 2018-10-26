package com.cts.microservices.messageretrievalservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.microservices.messageretrievalservice.model.IotMqttPublishedMsg;
import com.cts.microservices.messageretrievalservice.repository.IotMqttPublishedMsgReository;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	IotMqttPublishedMsgReository repo;

	@Override
	public Iterable<IotMqttPublishedMsg> findAll() {
//		MessageDataResponse msgRes = new MessageDataResponse();
		
		return repo.findAll();
	}

	@Override
	public void save(IotMqttPublishedMsg iotMqttPublishedMsg) {
		repo.save(iotMqttPublishedMsg);
		
	}
	
}
