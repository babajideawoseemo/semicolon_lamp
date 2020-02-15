package com.lamp.entities;

//Chibuzo SCV2003

public class Quiz {
	
	private QuizQuestion[] question;
	private byte[] response = new byte[question.length];
	private byte allocatedSecondsPerQuestion;
	private byte quizScore=0;
	
	
	
	
	
	public QuizQuestion[] getQuestion() {
		return question;
	}
	public void setQuestion(QuizQuestion[] question) {
		this.question = question;
	}
	public byte[] getResponse() {
		return response;
	}
	public void setResponse(byte[] response) {
		this.response = response;
	}
	public byte getAllocatedTimePerQuestion() {
		return allocatedSecondsPerQuestion;
	}
	public void setAllocatedTimePerQuestion(byte allocatedTimeInSeconds) {
		this.allocatedSecondsPerQuestion = allocatedTimeInSeconds ;
	}

	
	
	

}
