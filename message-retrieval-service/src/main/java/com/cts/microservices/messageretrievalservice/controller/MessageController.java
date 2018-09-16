package com.cts.microservices.messageretrievalservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.microservices.messageretrievalservice.dto.MessageResponse;
import com.cts.microservices.messageretrievalservice.model.IotMqttPublishedMsg;
import com.cts.microservices.messageretrievalservice.repository.IotMqttPublishedMsgReository;

@RestController
public class MessageController {
	
	@Autowired
	IotMqttPublishedMsgReository repo;
	
	@GetMapping("/getStatus")
	public MessageResponse getMessage() {
		MessageResponse rs = new MessageResponse();
		rs.setMsg("true");
		return rs;
	}
	
	@GetMapping("/findAllMsg")
	public String findAllMsg() {
		String result = "";
		Iterable<IotMqttPublishedMsg> iot = repo.findAll();

		for (IotMqttPublishedMsg msg : iot) {
			result += msg.toString() + "<br>";
		}

		return result;
	}

}
