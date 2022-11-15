package com.ideas2it.model;

import java.text.ParseException;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.ideas2it.model.Applicant;

/*
 * Java Program to Create POJO class for Recruiter 
 */
@Entity
@Table(name = "recruiter")
public class Recruiter{

    @Column(nullable = false)
    private String name;

    @Column(name = "email_address", nullable = false)
    private String emailAddress;

    @Column(name = "mobile_number", nullable = false)
    private long mobileNumber; 

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int id;

    @Column(name = "is_deleted", columnDefinition="tinyint(1) default false", nullable = false)
    private boolean isDeleted;

    @ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinTable(name = "applicant_recruiter", joinColumns = @JoinColumn(name = "recruiter_id"), inverseJoinColumns = @JoinColumn(name = "applicant_id"))
    private List<Applicant> applicants;

    public Recruiter() {}

    public Recruiter(
	String name,
        String emailAddress,
        long mobileNumber

    ) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;	
    }

    /*
    * Using the get to define a getter method to get the property value
    *Using the set to define a setter method to set the property value
    */

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

    public List<Applicant> getApplicants () {
        return applicants;
    }
    
    public void setApplicants (List<Applicant> applicants) {
        this.applicants = applicants;
    }

    /**
     * <p>
     * To display the recruiter.
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

    



    