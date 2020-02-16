package com.lamp.entities;

//Chibuzo SCV2003

public class Quiz {

    private QuizQuestion[] question;
    private QuizResponse quizResponse;
    private byte allocatedSecondsPerQuestion;
    private byte quizScore = 0;


    public Quiz(QuizQuestion[] quizQuestion, byte allocatedSecondsPerQuestion){
    	this.question = quizQuestion;
    	this.allocatedSecondsPerQuestion = allocatedSecondsPerQuestion;

	}

    public QuizQuestion[] getQuestion() {
        return question;
    }

    public void setQuestion(QuizQuestion[] question) {
        this.question = question;
    }

    public QuizResponse getQuizResponse() {
        return quizResponse;
    }

    public void setQuizResponse(QuizResponse quizResponse) {
        this.quizResponse = quizResponse;
    }

    public byte getAllocatedSecondsPerQuestion() {
        return allocatedSecondsPerQuestion;
    }

    public void setAllocatedSecondsPerQuestion(byte allocatedSecondsPerQuestion) {
        this.allocatedSecondsPerQuestion = allocatedSecondsPerQuestion;
    }

    public byte getQuizScore() {
        return quizScore;
    }

    public void setQuizScore(byte quizScore) {
        this.quizScore = quizScore;
    }

    public byte getAllocatedTimePerQuestion() {
        return allocatedSecondsPerQuestion;
    }

    public void setAllocatedTimePerQuestion(byte allocatedTimeInSeconds) {
        this.allocatedSecondsPerQuestion = allocatedTimeInSeconds;
    }


}
