package com.cts.microservices.messageretrievalservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.microservices.messageretrievalservice.dto.MessageResponse;
import com.cts.microservices.messageretrievalservice.dto.MessageResponseDto;
import com.cts.microservices.messageretrievalservice.model.IotMqttPublishedMsg;
import com.cts.microservices.messageretrievalservice.repository.IotMqttPublishedMsgReository;
import com.cts.microservices.messageretrievalservice.service.MessageService;

@CrossOrigin(origins = "http://localhost:8765")
@RestController
//@RequestMapping({"/api"})
public class MessageController {

	private static final Logger log = Logger.getLogger(MessageController.class);
	
	@Autowired
	IotMqttPublishedMsgReository repo;

	@Autowired
	MessageService service;

	@GetMapping("/getStatus")
	public MessageResponse getMessage() {
		log.info("inside MessageController	::	getMessage()");
		MessageResponse rs = new MessageResponse();
		rs.setMsg("true");
		return rs;
	}

	@GetMapping("/getAllDetails")
	public List<MessageResponseDto> getAllDetails() {
		
		log.info("inside MessageController	::	getAllDetails()");

		Iterable<IotMqttPublishedMsg> iot = repo.findAll();
		List<MessageResponseDto> messageList = new ArrayList<>();
		MessageResponseDto messageResponseDto = new MessageResponseDto();

		for (IotMqttPublishedMsg iotMqttPublishedMsg : iot) {
			messageResponseDto.setId(iotMqttPublishedMsg.getId());
			messageResponseDto.setType(iotMqttPublishedMsg.getClickType());
			messageList.add(messageResponseDto);
		}
		return messageList;
	}


	@RequestMapping("/save")
	public String save() {
		log.info("inside MessageController	::	save()");
		// save a single Message
		repo.save(new IotMqttPublishedMsg("Sn-4", "button"));
		return "Done";
	}
	
	@RequestMapping("/saveData")
	public String saveData() {
		log.info("inside MessageController	::	save()");
		// save a single Message
		//repo.save(new IotMqttPublishedMsg("Sn-4", "button"));
		
		service.save(new IotMqttPublishedMsg("Sno-5", "button"));

		return "Done";
	}


}
