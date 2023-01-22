package com.new_rest_api.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionInBootHandler extends ResponseEntityExceptionHandler {

	private String INCORRECT_REQUEST = "INCORRECT Student Roll";
	
	
	@ExceptionHandler(InvaliStudentException.class)
	public ResponseEntity<ExceptionEroorResponse> wrongRollHandler(InvaliStudentException ex, WebRequest request) {

		List<String> details =new ArrayList<>();

		details.add(ex.getLocalizedMessage());

		ExceptionEroorResponse er = new ExceptionEroorResponse(INCORRECT_REQUEST, details);
		return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);

	}
}
