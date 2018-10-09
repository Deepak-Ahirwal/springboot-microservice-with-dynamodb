package com.cts.microservices.exchangeservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;


@Getter
public class ResponseVO<T> implements ResponseCodes{

private final T data;
	
	@JsonInclude(Include.NON_NULL)
	private final ResponseStatusVO response;
	
	@JsonInclude(Include.NON_NULL)
	private String dataType;
	
	public ResponseVO(T data) {
		super();
		this.data = data;
		this.response = null;
		if (null != data) {
			this.dataType = data.getClass().getSimpleName();
		}
	}

	public ResponseVO(T data, ResponseStatusVO response) {
		super();
		this.data = data;
		this.response = response;
		if (null != data) {
			this.dataType = data.getClass().getSimpleName();
		}
	}

	public static <T> ResponseVO<T> createErrorResponse(T responseObject) {
		return new ResponseVO<>(responseObject, ResponseStatusVO.createResponse(ERROR[0], ERROR[1]));
	}

	public static <T> ResponseVO<T> createErrorResponse(T responseObject, String Message) {
		return new ResponseVO<>(responseObject, ResponseStatusVO.createResponse(ERROR[0], Message));
	}

	public static <T> ResponseVO<T> createSuccessResponse(T responseObject) {
		return new ResponseVO<>(responseObject, ResponseStatusVO.createResponse(SUCCESS[0], SUCCESS[1]));
	}
}
