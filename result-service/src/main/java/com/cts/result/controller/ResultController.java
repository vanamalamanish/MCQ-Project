package com.cts.result.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.result.exceptions.TokenNotValidException;
import com.cts.result.feign.AuthFeignConfig;
import com.cts.result.pojo.ResponseModel;
import com.cts.result.service.ResultService;

@RestController
public class ResultController {
	@Autowired
	private AuthFeignConfig feign;
	@Autowired
	private ResultService resultService;

	@GetMapping("/result")
	public ResponseEntity<Character> getResult(@RequestHeader(name = "Authorization") String token,
			 ResponseModel response) throws TokenNotValidException {

		if (feign.validate(token).getBody())
			return new ResponseEntity<>(resultService.returnGrade(response.getNoOfCorrectAnswers(),
					response.getTotalNoOfQuestions(), response.getUserId()), HttpStatus.OK);

		else
			throw new TokenNotValidException("Invalid Token!");
	}
}
