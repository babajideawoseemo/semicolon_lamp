package com.lamp.entities;

public class QuestionnaireQuestion {
	
	private String question;
	private String answer;
	
	public QuestionnaireQuestion(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
