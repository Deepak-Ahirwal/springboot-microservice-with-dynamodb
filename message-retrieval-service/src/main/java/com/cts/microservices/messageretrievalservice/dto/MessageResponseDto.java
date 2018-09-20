package com.cts.microservices.messageretrievalservice.dto;

import java.io.Serializable;

public class MessageResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -990851564421765120L;
	private String id;
	private String type;
	private String status;

	public MessageResponseDto() {
		super();
	}

	public MessageResponseDto(String id, String type, String status) {
		super();
		this.id = id;
		this.type = type;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MessageResponseDto [id=" + id + ", type=" + type + ", status=" + status + "]";
	}

}
