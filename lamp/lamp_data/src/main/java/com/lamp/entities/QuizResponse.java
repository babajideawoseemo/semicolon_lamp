package com.lamp.entities;


import java.util.HashMap;

public class QuizResponse {
    private HashMap<String, Byte> quizResponse;


    public QuizResponse(HashMap<String, Byte> quizResponse) {
        super();
        this.quizResponse = quizResponse;
    }

    public HashMap<String, Byte> getResponse() {
        return quizResponse;
    }

    public void setResponse(HashMap<String, Byte> response) {
        this.quizResponse = response;
    }

}



