package com.lamp.entities;

import java.util.HashMap;

public class Questionnaire {
	
	private int id;
	private QuestionList questionList;

	public QuestionList getquestionList() {
		return questionList;
	}

	public void setQuestions(QuestionList questionList) {
		this.questionList = questionList;
	}
	
	public void addQuestion(QuestionnaireQuestion question) {
		questionList.getQuestions().add(question);
	}
	
	public void removeQuestion(QuestionnaireQuestion question) {
		questionList.getQuestions().remove(question);
	}
	
	public void getResponse() {
		
		 QuestionnaireResponse response = new QuestionnaireResponse(new HashMap<String, String>(questionList.getQuestions().size()));
		
		for(QuestionnaireQuestion qst : questionList.getQuestions()) {
			
			response.getResponse().put(qst.getQuestion(), qst.getAnswer());
		}
	}

}
