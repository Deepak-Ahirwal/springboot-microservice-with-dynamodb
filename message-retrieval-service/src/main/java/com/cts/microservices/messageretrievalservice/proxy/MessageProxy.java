package com.cts.microservices.messageretrievalservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "api-gateway-server")
public interface MessageProxy {

}
