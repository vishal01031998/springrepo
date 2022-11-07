package com.te.bootspring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDto {
	private boolean err;
	private String msg;
	private Object object;

}
