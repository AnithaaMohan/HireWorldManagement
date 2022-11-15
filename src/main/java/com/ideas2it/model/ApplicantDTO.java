package com.ideas2it.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ideas2it.model.Recruiter;
import com.ideas2it.model.RecruiterDTO;
/**
 * To create applicant details 
 * @version 1.0. 
 * @author Anitha Mohan
 *
 */
public class ApplicantDTO {
	
    private String name;
    private String emailAddress;  
    private String qualification;
    private long mobileNumber;
    private Date dateOfBirth;
    private char gender;
    private int id;
    private boolean isDeleted;
    private List<RecruiterDTO> recruiters;

    public ApplicantDTO() {}

    public ApplicantDTO(
	String name,
        String emailAddress,
        String qualification,
        Date dateOfBirth,
        long mobileNumber,
        char gender
    ) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.qualification = qualification ;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;
	this.gender = gender;
    }

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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;   
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber ) {
        this.mobileNumber = mobileNumber; 
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth ) {
        this.dateOfBirth = dateOfBirth; 
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;   
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

    public List<RecruiterDTO> getRecruiters() {
        return recruiters;
    }
    
    public void setRecruiters(List<RecruiterDTO> recruiters) {
        this.recruiters = recruiters;
    }

    /**
     * <p>
     * To display the applicantDTO.
     * </p>
     */
    public String toString() {
        StringBuilder applicant = new StringBuilder();

        applicant.append("\n__Applicant details__ \n")
                 .append("\n Applicant's Name           : ")
                 .append(name)
                 .append("\n Applicant's EmailAddress   : ")
                 .append(emailAddress)
                 .append("\n Applicant's Qualification  : ")
                 .append(qualification)
                 .append("\n Applicant's MobileNumber   : ")
                 .append(mobileNumber)
                 .append("\n Applicant's DateOfBirth    : ")
                 .append(dateOfBirth)
                 .append("\n Applicant's Gender         : ")
                 .append(gender)
                 .append("\n Applicant's Id             : ")
                 .append(id )
                 .append("\n isDeleted                  : ")
                 .append(isDeleted);
                // .append("\n Recruiters List            : ")
                // .append(recruiters);
        return applicant.toString();
    }
}
