package com.cts.microservices.exchangeservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(of = { "errorCode", "message", "throwables" })
public class ResponseStatusVO {

	@JsonInclude(Include.NON_NULL)
	private String errorCode;

	private String message;

	@JsonInclude(Include.NON_NULL)
	private Throwable throwable;

	public ResponseStatusVO(String errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.throwable = null;
	}

	public ResponseStatusVO(String errorCode, Throwable throwable) {
		super();
		this.errorCode = errorCode;
		this.message = throwable.getLocalizedMessage();
		this.throwable = throwable;
	}

	public ResponseStatusVO(Throwable throwable) {
		super();
		this.errorCode = "0000";
		this.message = throwable.getLocalizedMessage();
		this.throwable = throwable;
	}

	public static ResponseStatusVO createResponse(String errorCode, String message) {
		return new ResponseStatusVO(errorCode, message);
	}
}
