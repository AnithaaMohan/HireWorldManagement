package com.ideas2it.controller;
/*
 * Java Program to Create controller for recruiter
 */

import java.util.List;

import com.ideas2it.exception.HireWorldException;
import com.ideas2it.model.Recruiter;
import com.ideas2it.model.RecruiterDTO;
import com.ideas2it.service.RecruiterService;
import com.ideas2it.service.impl.RecruiterServiceImpl;

/**
 * class handles the inputs from user 
 * and send to Service class to perform business logic related 
 * to recruiter.
 */
public class RecruiterController {

    private RecruiterService recruiterService = new RecruiterServiceImpl();

    /**
     * gets all the Recruiter details and send 
     * the values to service to create the Recruiter and display  
     * Recruiter is created with Recruiter given details.
     */
    public RecruiterDTO createRecruiter(RecruiterDTO recruiterDTO) throws HireWorldException {

        return recruiterService.createRecruiter( recruiterDTO);
    }

    /**
     * gets name given by user 
     * and pass it to service class
     */
    public boolean isValidName(String name) throws HireWorldException {
        return recruiterService.isValidName(name);
    }

    /**
     * gets emailAddress given by user 
     * and pass it to service class
     */
    public boolean isValidEmailAddress(String emailAddress) throws HireWorldException {
        return recruiterService.isValidEmailAddress(emailAddress);
    }

    /**
     * gets mobileNumber given by user 
     * and pass it to service class
     */     
    public boolean isValidMobileNumber(long mobileNumber) throws HireWorldException {
        return recruiterService.isValidMobileNumber(mobileNumber);
    }

    /**
     * used to pass the id given by the user to service class 
     * to fetch the Recruiter by given id
     */
     public RecruiterDTO getRecruiterById(int id) throws HireWorldException {
        return recruiterService.getRecruiterById(id);
    }

    /**
     * used to pass the id given by the user to service class 
     * to update the Recruiter by given id
     */
    public RecruiterDTO updateRecruiterById(RecruiterDTO recruiterDTO) throws HireWorldException {
       return recruiterService.updateRecruiterById(recruiterDTO);
    }

    /**
     * used to pass the id given by the user to service class 
     * to remove the Recruiter by given id
     */
    public boolean removeRecruiterById(int id) throws HireWorldException {
            return recruiterService.removeRecruiterById(id);      
    }

    /**
     * used to pass the value to see all the Recruiters
     * stored in the list
     */
    public List<RecruiterDTO> displayRecruiters() throws HireWorldException {
        return recruiterService.displayRecruiters();
    }

    /**
     * used to check the presence of the given id in the list.
     * @return boolean.
     */
    public boolean isIdExist (int recruiterId) throws HireWorldException {
        return recruiterService.isIdExist(recruiterId);
    }

    /**
     * used to check the presence of the given ApplicantId.
     * and returns the Id if found true to assign an Applicant.
     */
    public RecruiterDTO assignApplicant(RecruiterDTO recruiterDTO) throws HireWorldException {
        return recruiterService.assignApplicant(recruiterDTO);
    }

    /**
     * <p>
     * To get the recruiters by their applicantId.
     * And Display the Recruiters assigned to the Applicant.
     * </p>
     */
    public List<RecruiterDTO> getRecruitersByApplicantId(int applicantId) throws HireWorldException {
        return recruiterService.getRecruitersByApplicantId(applicantId);
    }
}
    































      
    


























 






























    
       
        
        
        

























    
       
        
        
        



























    
       
        
        
        