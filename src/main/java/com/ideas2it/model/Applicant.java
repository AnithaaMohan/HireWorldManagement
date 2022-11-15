/*
 *<p>
 * Java Program to Create POJO class for applicant.
 *<p>
 */ 
package com.ideas2it.model;

import java.text.ParseException;
import java.util.List;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ideas2it.model.Recruiter;

/**
 *Initializing the Variables
 */
@Entity
@Table(name = "applicant")
public class Applicant {

    @Column(nullable = false)
    private String name;

    @Column(name = "email_address", nullable = false)
    private String emailAddress;

    @Column(nullable = false)
    private String qualification;

    @Column(name = "mobile_number", nullable = false)
    private long mobileNumber;

    @Column(name = "dateofbirth", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column(name = "gender", nullable = false)
    private char gender;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int id;

    @Column(name = "is_deleted", columnDefinition="tinyint(1) default false", nullable = false)
    private boolean isDeleted;

    @ManyToMany(mappedBy = "applicants", cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Recruiter> recruiters;

    public Applicant() {}

    public Applicant(
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

    /**
     * gets the name input given by user
     */
    public String getName() {
        return name;
    }

    /**
     * sets the name input given by user
     */
    public void setName(String name) {
        this.name = name;   
    }

    /**
     * gets the emailAddress parameter given by user
     */ 
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * sets the emailAddress given by the user
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress; 
    } 

    /**
     * gets the qualification choosen by the user
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * sets the qualification choosen by the user
     */
    public void setQualification(String qualification) {
        this.qualification = qualification;   
    }

    /**
     * gets the mobileNumber given by the user
     */
    public long getMobileNumber() {
        return mobileNumber;
    }

    /**
     * sets the mobileNumber given by the user
     */
    public void setMobileNumber(long mobileNumber ) {
        this.mobileNumber = mobileNumber; 
    }

    /**
     * gets the dateOfBirth given by the user
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * sets the dateOfBirthgiven by the user
     */
    public void setDateOfBirth(Date dateOfBirth ) {
        this.dateOfBirth = dateOfBirth; 
    }

    /**
     * gets the gender given by the user
     */
    public char getGender() {
        return gender;
    }

    /**
     * sets the gender given by the user
     */
    public void setGender(char gender) {
        this.gender = gender;   
    }

    /**
     * gets the id generated
     */
    public int getId() {
        return id;
    }

    /**
     * sets the id generated
     */
    public void setId(int id) {
        this.id = id; 
    } 

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public List<Recruiter> getRecruiters() {
        return recruiters;
    }
    
    public void setRecruiters(List<Recruiter> recruiters) {
        this.recruiters = recruiters;
    }

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

    



    