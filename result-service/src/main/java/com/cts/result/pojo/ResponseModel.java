package com.cts.result.pojo;

public class ResponseModel {
	
private int noOfCorrectAnswers;
private int totalNoOfQuestions;
private int userId;
public int getNoOfCorrectAnswers() {
	return noOfCorrectAnswers;
}
public void setNoOfCorrectAnswers(int noOfCorrectAnswers) {
	this.noOfCorrectAnswers = noOfCorrectAnswers;
}
public int getTotalNoOfQuestions() {
	return totalNoOfQuestions;
}
public void setTotalNoOfQuestions(int totalNoOfQuestions) {
	this.totalNoOfQuestions = totalNoOfQuestions;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public ResponseModel(int noOfCorrectAnswers, int totalNoOfQuestions, int userId) {
	super();
	this.noOfCorrectAnswers = noOfCorrectAnswers;
	this.totalNoOfQuestions = totalNoOfQuestions;
	this.userId = userId;
}
public ResponseModel() {
	super();
}

}
