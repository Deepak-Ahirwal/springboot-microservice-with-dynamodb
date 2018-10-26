package com.cts.microservices.messageretrievalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.cts.microservices.messageretrievalservice")
public class MessageRetrievalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageRetrievalServiceApplication.class, args);
	}
}
