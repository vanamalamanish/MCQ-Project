package com.cts.questions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.questions.models.Question;
import com.cts.questions.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository repo;
	
	@Override
	public List<Question> allQuestions(String category) {

		return repo.findAllByCategory(category);
		 
	}

}
