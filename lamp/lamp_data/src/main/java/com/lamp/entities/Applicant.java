package com.lamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Applicant {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String password;
<<<<<<< HEAD:lamp/lamp_data/src/main/java/com/lamp/entities/Applicant.java
	private ApplicationStatus applicationStatus = ApplicationStatus.APPLIED;
	private  byte AgeRange;
	private Quiz quiz;
	private ApplicantQuizResponse applicantQuizResponse;
	public String getApplicationId() {
		return applicationId;
=======
	private  int ageRange;	
	
	public Applicant() {
		
	}

	public Applicant(String firstName, String lastName, String email, String phone, String password,
		 int ageRange) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.ageRange = ageRange;
	}
	
	public String getId() {
		return id;
>>>>>>> 6f040b984b8809fa5620dfa918f4357c09699d40:lamp/lamp_data/src/main/java/com/lamp/Applicant.java
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAgeRange() {
		return ageRange;
	}
<<<<<<< HEAD:lamp/lamp_data/src/main/java/com/lamp/entities/Applicant.java
	public void setAgeRange(byte ageRange) {
		AgeRange = ageRange;
	}
	public Quiz getQuiz() {
		return quiz;
	}
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	public ApplicantQuizResponse getApplicantQuizResponse() {
		return applicantQuizResponse;
	}
	public void setApplicantQuizResponse(ApplicantQuizResponse applicantQuizResponse) {
		this.applicantQuizResponse = applicantQuizResponse;
	}
	
	
=======
	public void setAgeRange(int ageRange) {
		this.ageRange = ageRange;
	}

	@Override
	public String toString() {
		return "Applicant [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", password=" + password + ", ageRange=" + ageRange + "]";
	}
>>>>>>> 6f040b984b8809fa5620dfa918f4357c09699d40:lamp/lamp_data/src/main/java/com/lamp/Applicant.java
	
	
}
