package com.cts.questions.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global Exception Handler class
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(TokenNotValidException.class)
	public ResponseEntity<CustomErrorResponse> handlesTokenNotValidException(
			TokenNotValidException tokenNotValidException) {
		CustomErrorResponse response = new CustomErrorResponse();
		response.setDateTime(LocalDateTime.now());
		response.setMessage(tokenNotValidException.getMessage());

		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}

}
