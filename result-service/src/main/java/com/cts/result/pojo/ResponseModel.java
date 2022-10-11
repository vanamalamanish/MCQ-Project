package com.cts.result.pojo;

public class ResponseModel {
	
private int noOfCorrectAnswers;
private int totalNoOfQuestions;
private String username;
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
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public ResponseModel(int noOfCorrectAnswers, int totalNoOfQuestions, String username) {
	super();
	this.noOfCorrectAnswers = noOfCorrectAnswers;
	this.totalNoOfQuestions = totalNoOfQuestions;
	this.username = username;
}
public ResponseModel() {
	super();
}

}
