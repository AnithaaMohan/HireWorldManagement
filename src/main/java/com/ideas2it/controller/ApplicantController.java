package com.ideas2it.controller;

import java.util.List;

import com.ideas2it.exception.HireWorldException;
import com.ideas2it.model.ApplicantDTO;
import com.ideas2it.service.ApplicantService;
import com.ideas2it.service.impl.ApplicantServiceImpl;

/**
 * Handles the inputs from user 
 * and send to Service class to perform business logics related 
 * to applicants.
 */
public class ApplicantController {

    private ApplicantService applicantService = new ApplicantServiceImpl();

    /**
     * gets all the Applicant details and send 
     * the values to service to create the Applicant and display  
     * Applicant is created with Applicant given details.
     */
    public  ApplicantDTO createApplicant(ApplicantDTO applicantDTO) throws HireWorldException {

        return applicantService.createApplicant (applicantDTO);
    }

    /**
     * gets name given by user 
     * and pass it to service class.
     */
    public boolean isValidName(String name) throws HireWorldException {
        return applicantService.isValidName(name);
    }

    /**
     * gets emailAddress given by user 
     * and pass it to service class.
     */
    public boolean isValidEmailAddress(String emailAddress) throws HireWorldException {
        return applicantService.isValidEmailAddress(emailAddress);
    }

    /**
     * gets mobileNumber given by user 
     * and pass it to service class.
     */   
    public boolean isValidMobileNumber(long mobileNumber) throws HireWorldException {
        return applicantService.isValidMobileNumber(mobileNumber);
    }

    /**
     * gets dateOfBirth given by user 
     * and pass it to service class.
     */ 
    public boolean isValidDateOfBirth(String dateOfBirth) throws HireWorldException {
        return applicantService.isValidDateOfBirth(dateOfBirth);
    }

    /**
     * gets gender given by user
     * and pass it to service class.
     */
    public boolean isValidGender(char gender)throws HireWorldException {
        return applicantService.isValidGender(gender);
    }

    /**
     * used to pass the id given by the user to service class. 
     * to fetch the applicant by given id.
     */
    public ApplicantDTO getApplicantById(int id)throws HireWorldException {
        return applicantService.getApplicantById(id);
    }

    /**
     * used to pass the id given by the user to service class.
     * to update the applicant by given id.
     */
    public ApplicantDTO updateApplicantById(ApplicantDTO updatedApplicantDTO)throws HireWorldException {
       return applicantService.updateApplicantById (updatedApplicantDTO);
    }

    /**
     * used to pass the id given by the user to service class. 
     * to remove the applicant by given id.
     */
    public boolean removeApplicantById(int id) throws HireWorldException {
        return applicantService.removeApplicantById(id);
    }

    /**
     * used to pass the value to see all the applicants.
     * stored in the list.
     */
    public List<ApplicantDTO> displayApplicants() throws HireWorldException {
        return applicantService.displayApplicants();
    }

    /**
     * used to check the presence of the given id in the list.
     * @return boolean.
     */
    public boolean isIdExist (int applicantId) throws HireWorldException {
        return applicantService.isIdExist(applicantId);
    }

    /**
     * <p>
     * To get the Applicants by their recruiterId.
     * And Display the Applicants assigned to the Recruiter.
     * </p>
     */
    public List<ApplicantDTO> getApplicantsByRecruiterId(int recruiterId) throws HireWorldException {
        return applicantService.getApplicantsByRecruiterId(recruiterId);
    }
}
    


































    
       
        
        
        