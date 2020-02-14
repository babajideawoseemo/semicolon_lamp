package com.lamp;

import java.util.ArrayList;

import java.util.List;

public class QuizPool {
	private List<QuizQuestion> generalQuestions = new ArrayList<QuizQuestion>();

	public List<QuizQuestion> getGeneralQuestions() {
		return generalQuestions;
	}

	public void setGeneralQuestions(List<QuizQuestion> generalQuestions) {
		this.generalQuestions = generalQuestions;
	}
	
	public void addToQuizPool(QuizQuestion question) {
		generalQuestions.add(question);
		
	}
	public void deleteFromQuizPool(int questionId) {
		generalQuestions.remove(questionId);
	}
	
	public void deleteFromQuizPool(QuizQuestion question ) {
		generalQuestions.remove(question.getQuestionID());
	}
	
	public Quiz generateQuiz(int noOfQuestion, Applicant applicant, )
	
	
	
	
}
