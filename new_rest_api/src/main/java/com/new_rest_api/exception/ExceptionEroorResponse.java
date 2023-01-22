package com.new_rest_api.exception;

import java.util.List;

public class ExceptionEroorResponse {
	
	String message;
	List<String> details;
	
	public ExceptionEroorResponse(String message, List<String> details) {
		super();
		this.message = message;
		this.details = details;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	 	
}
