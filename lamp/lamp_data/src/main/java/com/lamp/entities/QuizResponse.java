package com.lamp.entities;


public class QuizResponse {
    private int[] quizResponse;
    private int noOfQuestionsRespondedto = 0;
    //  private HashMap<String, Byte> quizResponse;


    public QuizResponse(int lengthOfQuizQuestions) {
        quizResponse = new int[lengthOfQuizQuestions];

    }

    public int[] getQuizResponse() {
        return quizResponse;
    }

    public void setQuizResponse(int[] quizResponse) {
        this.quizResponse = quizResponse;
    }

    public void setQuizResponse(int quizResponse) {
        this.quizResponse[noOfQuestionsRespondedto] = quizResponse;
        noOfQuestionsRespondedto++;
    }


//    public QuizResponse(HashMap<String, Byte> quizResponse) {
//        super();
//        this.quizResponse = quizResponse;
//    }
//
//    public HashMap<String, Byte> getResponse() {
//        return quizResponse;
//    }
//
//    public void setResponse(HashMap<String, Byte> response) {
//        this.quizResponse = response;
//    }

}



