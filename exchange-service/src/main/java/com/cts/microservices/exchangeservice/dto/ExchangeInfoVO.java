package com.cts.microservices.exchangeservice.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = { "id", "fromVal", "toVal", "port", "multipleVal" })
public class ExchangeInfoVO {

	private String id;
	private String fromVal;
	private String toVal;
	private int port;
	private BigDecimal multipleVal;
}
