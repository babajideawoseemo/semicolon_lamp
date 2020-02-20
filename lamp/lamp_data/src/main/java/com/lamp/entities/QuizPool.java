package com.lamp.entities;

import java.util.ArrayList;
import java.util.Collections;
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

	public void deleteFromQuizPool(QuizQuestion question) {
		generalQuestions.remove(question.getQuestionID());
	}

	public Quiz generateQuiz(int numberOfQuestions, byte timeInSeconds) {
		Collections.shuffle(generalQuestions);
		var quizList = new QuizQuestion[numberOfQuestions];
		for (int i = 0; i < numberOfQuestions; i++) {
			quizList[i] = generalQuestions.get(i);
		}
		return new Quiz(quizList, timeInSeconds);

	}


}
