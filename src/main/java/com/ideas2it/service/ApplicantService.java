package com.ideas2it.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ideas2it.controller.ApplicantController;
import com.ideas2it.dao.ApplicantDao;
import com.ideas2it.dao.impl.ApplicantDaoImpl;
import com.ideas2it.exception.HireWorldException;
import com.ideas2it.model.Applicant;
import com.ideas2it.model.ApplicantDTO;
import com.ideas2it.util.Validation;

/*Controller class CRUD operations are achieved through this Serviceclass.
 *Based on the user choice methods are called accordingly.
 *Java Program to Create service class for applicant.
 */
public interface ApplicantService { 
    /**
    * gets the choice from the user
    * @param name   
    * @param emailAddress
    * @param qualification
    * @param mobileNumber
    * @param DateofBirth
    * @param Gender
    */
    public ApplicantDTO createApplicant (ApplicantDTO applicantDTO) throws HireWorldException;
	
    /**
     * To check the given name is valid or not
     *
     * @param  name  - the name to be validated
     * @return       - true if name matches this pattern "[a-z A-Z]*".
     * otherwise returns false 
     */
    public boolean isValidName(String name) throws HireWorldException;

    /**
     * To check the given EmailAddress is valid or not
     *
     * @param  EmailAddress - the EmailAddress to be validated
     * @return              - true if EmailAddress matches this pattern "[a-zA-Z0-9.]+@[a-z]+[.][a-z]{2,3}$"
     * otherwise returns false 
     *
     */
    public boolean isValidEmailAddress(String emailAddress) throws HireWorldException;

    /**
     * To check the given MobileNumber is valid or not
     *
     * @param  MobileNumber - the MobileNumber to be validated
     * @return              - true if MobileNumber matches this pattern "[6-9][1-9]{9}".
     * otherwise returns false 
     *
     */
    public boolean isValidMobileNumber(long mobileNumber) throws HireWorldException;

    /**
     * To check the given dateOfBirth is valid or not
     *
     * @param  dateOfBirth - the dateOfBirth to be validated
     * @return              - true if dateOfBirth matches this pattern "^\\d{2}-\\d{2}-\\d{4}$".
     * otherwise returns false 
     *
     */
    public boolean isValidDateOfBirth(String dateOfBirth) throws HireWorldException;

    /**
     * To check the given Gender is valid or not
     *
     * @param  Gender - the Gender to be validated
     * @return              - true if Gender matches this pattern "[M|F|O]{1}".
     * otherwise returns false 
     *
     */
    public boolean isValidGender(char gender) throws HireWorldException;

    /**
     * used to pass the id given by the controller to service class 
     * to fetch the applicant by given id
     */
    public ApplicantDTO getApplicantById(int id) throws HireWorldException;

    /**
     * used to pass the id given by the controller to service class 
     * to update the applicant by given id
     */
    public ApplicantDTO updateApplicantById(ApplicantDTO applicantDTO) throws HireWorldException ;

    /**
     * used to pass the id given by the controller to service class 
     * to remove the applicant by given id
     */
    public boolean removeApplicantById(int id) throws HireWorldException ;

    /**
     * used to pass the value from controller 
     * to see all the appliants stored in the list
     */
    public List<ApplicantDTO> displayApplicants() throws HireWorldException;

    /**
     * used to check the presence of the given id in the list.
     * @return boolean.
     */
    public boolean isIdExist(int applicantId) throws HireWorldException ;

    /**
     * gets the Applicants by their RecruiterId.
     * And Displays the Applicants assigned to the Recruiter.
     */
    public List<ApplicantDTO> getApplicantsByRecruiterId(int recruiterId) throws HireWorldException;
  //  public ApplicantDTO getApplicantsByRecruiterId(int recruiterId) throws HireWorldException;

	

	
}





    