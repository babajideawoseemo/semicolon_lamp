package com.lamp.entities;

public class Interview {
    private String applicantId;
    private String interviewerId;
    private String interviewerComment;

    public Interview(Applicant applicant, Admin admin) {
        this.applicantId = applicant.getApplicationId();
        this.interviewerId = admin.getAdminId();

    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(String interviewerId) {
        this.interviewerId = interviewerId;
    }

    public String getInterviewerComment() {
        return interviewerComment;
    }

    public void setInterviewerComment(String interviewerComment) {
        this.interviewerComment = interviewerComment;
    }
}
