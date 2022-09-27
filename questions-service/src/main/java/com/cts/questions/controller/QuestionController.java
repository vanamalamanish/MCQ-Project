package com.cts.questions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.questions.exception.TokenNotValidException;
import com.cts.questions.models.Question;
import com.cts.questions.openFeign.AuthFeignConfig;
import com.cts.questions.service.QuestionService;

@RestController
public class QuestionController {

	@Autowired
	private QuestionService service;

	@Autowired
	private AuthFeignConfig feign;

	@GetMapping("/questions/{category}")
	public ResponseEntity<List<Question>> getQuestions(@RequestHeader(name = "Authorization") String token,
			@PathVariable String category) {
		try {
			if (feign.validate(token).getBody())
				return new ResponseEntity<>(service.allQuestions(category), HttpStatus.OK);

		} catch (Exception e) {
			throw new TokenNotValidException("Invalid Token!");
		}
		return null;
	}

}
