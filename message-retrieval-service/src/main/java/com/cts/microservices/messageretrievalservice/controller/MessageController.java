package com.cts.microservices.messageretrievalservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.microservices.messageretrievalservice.dto.MessageResponse;
import com.cts.microservices.messageretrievalservice.dto.MessageResponseDto;
import com.cts.microservices.messageretrievalservice.model.IotMqttPublishedMsg;
import com.cts.microservices.messageretrievalservice.repository.IotMqttPublishedMsgReository;

@RestController
public class MessageController {
	
	@Autowired
	IotMqttPublishedMsgReository repo;
	
	@GetMapping("/getAllDetails")
	public List<MessageResponseDto> getAllDetails(){
	    Iterable<IotMqttPublishedMsg> iot = repo.findAll();
	    List<MessageResponseDto> messageList = new ArrayList<>();
	    MessageResponseDto messageResponseDto = new MessageResponseDto();
	    
	    for (IotMqttPublishedMsg msg : iot) {
	    	messageResponseDto.setId(msg.getId());
	    	messageResponseDto.setType(msg.getClickType());
	    	messageResponseDto.setStatus("OK");
	    	messageList.add(messageResponseDto);
		} 
		return messageList;
	}

}
