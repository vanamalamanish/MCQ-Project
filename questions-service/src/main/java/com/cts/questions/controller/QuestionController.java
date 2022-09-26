package com.cts.questions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.questions.models.Question;
import com.cts.questions.service.QuestionService;

@RestController
public class QuestionController {

	@Autowired
	private QuestionService service;
	
	
	@GetMapping("/questions/{category}")
	public List<Question> getQuestions(@PathVariable String category){
		return service.allQuestions(category);
	}

}
