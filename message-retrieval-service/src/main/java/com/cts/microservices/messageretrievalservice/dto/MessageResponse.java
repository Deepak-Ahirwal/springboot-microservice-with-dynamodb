package com.cts.microservices.messageretrievalservice.dto;

public class MessageResponse {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "MessageResponse [msg=" + msg + "]";
	}
	
}
