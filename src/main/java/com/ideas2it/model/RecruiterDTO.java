package com.ideas2it.model;

import java.text.ParseException;
import java.util.List;

import com.ideas2it.model.Applicant;

/*
 * Java Program to Create POJO class for Recruiter 
 */
public class RecruiterDTO {

    private String name;
    private String emailAddress;
    private long mobileNumber; 
    private int id;
    private boolean isDeleted;
    private List<ApplicantDTO> applicants;

    public RecruiterDTO() {}

    public RecruiterDTO(
	String name,
        String emailAddress,
        long mobileNumber)
    /*
     * distinguishing local variable and instance variable.
     */
    {
        this.name = name;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;	
    }

    /*
    * Using the get to define a getter method to get the property value
    *Using the set to define a setter method to set the property value
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;   
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress; 
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber ) {
         this.mobileNumber = mobileNumber; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;   
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public List<ApplicantDTO> getApplicants () {
        return applicants;
    }
    
    public void setApplicants (List<ApplicantDTO> applicants) {
        this.applicants = applicants;
    }

    /**
     * <p>
     * To display the recruiterDTO.
     * </p>
     */
    public String toString() {
        StringBuilder recruiter = new StringBuilder();
        recruiter.append("\n__Recruiter details__ \n")
                 .append("\n Recruiter's Name          : ")
                 .append(name)
                 .append("\n Recruiter's EmailAddress  : ")
                 .append(emailAddress)
                 .append("\n Recruiter's MobileNumber  : ")
                 .append(mobileNumber)
                 .append("\n Recruiter's Id            : ")
                 .append(id )
                 .append("\n isDeleted                 : ")
                 .append(isDeleted)
                 .append("\n Applicant List            : ")
                 .append(applicants);
        return recruiter.toString();
    }
}

    



    