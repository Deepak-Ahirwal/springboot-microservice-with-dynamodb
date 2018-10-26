package com.cts.microservices.messageretrievalservice.service;

import com.cts.microservices.messageretrievalservice.model.IotMqttPublishedMsg;

public interface MessageService {

	Iterable<IotMqttPublishedMsg> findAll();

	void save(IotMqttPublishedMsg iotMqttPublishedMsg);

}
