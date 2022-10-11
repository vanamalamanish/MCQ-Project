package com.cts.result.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.result.models.ResultModel;
import com.cts.result.repository.ResultRepository;

@Service
public class ResultServiceImpl implements ResultService {
	@Autowired
	private ResultRepository resultRepo;
	
	private ResultModel result=new ResultModel();
	
	@Override
	public char returnGrade(int noOfCorrectAnswers, int totalNoOfQuestions,String username) {
		System.out.println(totalNoOfQuestions);
		System.out.println(noOfCorrectAnswers);
		float perc = ( (float)noOfCorrectAnswers / totalNoOfQuestions) * 100;
		char grade;
		if (perc >= 90)
			grade='A';
		else if (perc >= 80 && perc < 90)
			grade='B';
		else if (perc >= 70 && perc < 80)
			grade='C';
		else if (perc >= 60 && perc < 70)
			grade='D';
		else if (perc >= 50 && perc < 60)
			grade='E';
		else

			grade='F';
		result.setUsername(username);
		result.setPercentage(perc);
		
		System.out.println(result.toString());
		System.out.println(perc);
		resultRepo.save(result);
		return grade;
	}

}
