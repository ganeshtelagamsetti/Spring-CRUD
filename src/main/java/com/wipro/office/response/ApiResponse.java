package com.wipro.office.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
	private boolean status;
	private String msg;
	private Object data;
	
	public ApiResponse(boolean status, String msg)
	{
		this.status=status;
		this.msg=msg;
	}
	public ApiResponse(boolean status, Object data)
	{
		this.status=status;
		this.data=data;
	}
}
