package com.lamp.entities;

public class QuizQuestion {
	private int questionID;
	private String question;
	private String[] options;
	private int rightOption;
	private int totalQuestions=0;
	
	
	public QuizQuestion(String question, String[] options, int rightOption) {
		totalQuestions++;
		this.question = question;
		this.options = options;
		this.rightOption = rightOption;
		this.questionID = totalQuestions;
	}
	
	
	public QuizQuestion(String question, String[] options, char rightOption) {
		totalQuestions++;
		this.question = question;
		this.options = options;
		this.questionID = totalQuestions;
		switch (Character.toLowerCase(rightOption)) 
		{
			case 'a':
				this.rightOption = 0;
				break;
			case 'b':
				this.rightOption = 1;
				break;
			case 'c':
				this.rightOption = 2;
				break;
			case 'd':
				this.rightOption = 3;
				break;
			case 'e':
				this.rightOption = 4;
				break;
			
		}
	
		
	}
	
	
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public int getRightOptions() {
		return rightOption;
	}
	public void setRightOptions(int rightOption) {
		this.rightOption = rightOption;
	}
	public void setRightOptions(char rightOption) {
		switch (Character.toLowerCase(rightOption)) 
		{
			case 'a':
				this.rightOption = 0;
				break;
			case 'b':
				this.rightOption = 1;
				break;
			case 'c':
				this.rightOption = 2;
				break;
			case 'd':
				this.rightOption = 3;
				break;
			case 'e':
				this.rightOption = 4;
				break;
			
		}
	
	}
	

	
}
