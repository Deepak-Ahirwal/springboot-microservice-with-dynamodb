package com.cts.microservices.conversionservice.dto;

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
@ToString(of = { "id", "fromVal", "toVal", "port", "quantity", "multipleVal", "totalCalculatedAmount" })
public class ConversionDetailsVO {

	private String id;
	private String fromVal;
	private String toVal;
	private BigDecimal quantity;
	private BigDecimal multipleVal;
	private BigDecimal totalCalculatedAmount;
	private int port;
}
