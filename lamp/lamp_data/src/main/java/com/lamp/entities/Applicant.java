package com.lamp;

public class Applicant {

	private String applicationId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String password;
	private ApplicationStatus applicationStatus = ApplicationStatus.APPLIED;
	private  byte AgeRange;
	private Quiz quiz;
	private ApplicantQuizResponse applicantQuizResponse;
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
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
	public ApplicationStatus getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(ApplicationStatus applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public int getAgeRange() {
		return AgeRange;
	}
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
	
	
	
	
}
