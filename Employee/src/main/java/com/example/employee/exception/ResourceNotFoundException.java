package com.example.employee.exception;

import javax.management.RuntimeErrorException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeErrorException {
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Error e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

}
