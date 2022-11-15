package com.ideas2it.service;

import java.util.ArrayList;
import java.util.List;

import com.ideas2it.dao.RecruiterDao;
import com.ideas2it.dto.DataTransformation;
import com.ideas2it.dao.impl.RecruiterDaoImpl;
import com.ideas2it.exception.HireWorldException;
import com.ideas2it.model.Recruiter;
import com.ideas2it.model.RecruiterDTO;
import com.ideas2it.util.Validation;

/**
 * gets the choice from the user 
 * Based on the user choice methods are called accordingly
 * Controller class CRUD operations are achieved through that class method.
 */ 
public interface RecruiterService { 

    /**
    * gets the choice from the user
    * @param name   
    * @param emailAddress
    * @param mobileNumber
    */
    public RecruiterDTO createRecruiter ( RecruiterDTO recruiterDTO) throws HireWorldException;

    /**
     * To check the given name is valid or not.
     *
     * @param  name  - the name to be validated
     * @return       - true if name matches this pattern "[a-z A-Z]*".
     * otherwise returns false. 
     */
    public boolean isValidName(String name) throws HireWorldException;

    /**
     * To check the given EmailAddress is valid or not.
     *
     * @param  EmailAddress - the EmailAddress to be validated
     * @return              - true if EmailAddress matches this pattern "[a-zA-Z0-9.]+@[a-z]+[.][a-z]{2,3}$"
     * otherwise returns false.
     *
     */
    public boolean isValidEmailAddress(String emailAddress) throws HireWorldException;

     /**
     * To check the given MobileNumber is valid or not.
     *
     * @param  MobileNumber - the MobileNumber to be validated
     * @return              - true if MobileNumber matches this pattern "[6-9][1-9]{9}".
     * otherwise returns false.
     *
     */
    public boolean isValidMobileNumber(long mobileNumber) throws HireWorldException;

    /**
     * used to pass the id given by the controller to service class 
     * to fetch the Recruiter by given id.
     */
    public RecruiterDTO getRecruiterById(int id) throws HireWorldException;

    /**
     * used to pass the id given by the controller to service class 
     * to update the Recruiter by given id.
     */
    public RecruiterDTO updateRecruiterById(RecruiterDTO recruiterDTO) throws HireWorldException;

    /**
     * used to pass the id given by the controller to service class 
     * to remove the Recruiter by given id.
     */
    public boolean removeRecruiterById(int id) throws HireWorldException;

    /**
     * used to pass the value from controller 
     * to see all the Recruiters stored in the list.
     */
    public List<RecruiterDTO> displayRecruiters() throws HireWorldException;

    /**
     * used to check the presence of the given id in the list.
     * @return boolean.
     */
    public boolean isIdExist(int recruiterId) throws HireWorldException ;

    /**
     * used to check the presence of the given id in the list.
     * if found present assigns the Applicant.
     */
    public RecruiterDTO assignApplicant(RecruiterDTO recruiterDTO) throws HireWorldException ;

   /**
     * gets the recruiters by their ApplicantId.
     * And Displays the Recruiters assigned to the Applicant.
     */
    public List<RecruiterDTO> getRecruitersByApplicantId(int applicantId) throws HireWorldException;
}

    
    






    



   
 
   
    