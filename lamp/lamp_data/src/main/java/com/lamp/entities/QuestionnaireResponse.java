package com.lamp.entities;

import java.util.HashMap;

public class QuestionnaireResponse {

	HashMap<String, String> response;

	public QuestionnaireResponse(HashMap<String, String> response) {
		super();
		this.response = response;
	}

	public HashMap<String, String> getResponse() {
		return response;
	}

	public void setResponse(HashMap<String, String> response) {
		this.response = response;
	}
	
}

