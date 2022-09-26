package com.cts.questions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.questions.models.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	@Query
	public List<Question> findAllByCategory(String Category);
}
