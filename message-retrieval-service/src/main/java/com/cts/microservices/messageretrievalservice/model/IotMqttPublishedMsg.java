package com.cts.microservices.messageretrievalservice.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "published-msg")
public class IotMqttPublishedMsg {
	
	private String id;
	private String clickType;
	
	public IotMqttPublishedMsg() {
		
	}

	public IotMqttPublishedMsg(String id, String clickType) {
		this.id = id;
		this.clickType = clickType;
	}

	@DynamoDBHashKey(attributeName = "Id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@DynamoDBAttribute(attributeName = "ClickType")
	public String getClickType() {
		return clickType;
	}

	public void setClickType(String clickType) {
		this.clickType = clickType;
	}
	
	

	@Override
	public String toString() {
		return "IotMqttPublishedMsg [id=" + id + ", clickType=" + clickType + "]";
	}
	
	
	
	

}
