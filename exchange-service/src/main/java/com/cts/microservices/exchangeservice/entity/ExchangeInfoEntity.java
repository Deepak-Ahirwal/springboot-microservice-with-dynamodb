package com.cts.microservices.exchangeservice.entity;

import java.math.BigDecimal;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@ToString(of = { "id", "fromVal", "toVal", "multipleVal" })
@DynamoDBTable(tableName = "exchange-info-table")
public class ExchangeInfoEntity {
	@DynamoDBHashKey(attributeName = "Id")
	private String id;
	@DynamoDBAttribute(attributeName = "FromVal")
	private String fromVal;
	@DynamoDBAttribute(attributeName = "ToVal")
	private String toVal;
	@DynamoDBAttribute(attributeName = "MultipleVal")
	private BigDecimal multipleVal;

}
