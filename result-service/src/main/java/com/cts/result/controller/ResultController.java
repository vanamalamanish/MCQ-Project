package com.cts.result.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cts.result.service.ResultService;

@RestController
public class ResultController {
	@Autowired
	private ResultService resultService;
	
	
}
