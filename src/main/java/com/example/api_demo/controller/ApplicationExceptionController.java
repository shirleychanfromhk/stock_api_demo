package com.example.api_demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.api_demo.exception.ApplicationException;

@ControllerAdvice
public class ApplicationExceptionController {
	@ExceptionHandler(value = ApplicationException.class)
	public ResponseEntity<Object> exception(ApplicationException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}
