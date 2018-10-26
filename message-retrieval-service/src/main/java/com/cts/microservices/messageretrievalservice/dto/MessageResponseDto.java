package com.cts.microservices.messageretrievalservice.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"id","type"})
public class MessageResponseDto implements Serializable {

	private String id;
	private String type;
}
