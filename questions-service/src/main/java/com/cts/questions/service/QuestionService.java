package com.cts.questions.service;

import java.util.List;

import com.cts.questions.models.Question;

public interface QuestionService {

	public List<Question> allQuestions(String category);
}
