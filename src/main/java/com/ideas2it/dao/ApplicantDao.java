package com.ideas2it.dao;

import java.util.ArrayList;
import java.util.List;

import com.ideas2it.exception.HireWorldException;
import com.ideas2it.model.Applicant;

/*
 * Gets the input from service 
 * and return back to Impl to perform process related
 * to Applicant
 */
public interface ApplicantDao {

    /**
     * <p>
     * Used to add the applicant in the list with applicant id as key.
     * </p>
     *
     * @param applicant - the applicant to be added in the list     
     * @return         - the applicant 
     * @throws HireWorldException - when the applicant is null       
     */
    public Applicant insertApplicant(Applicant applicant) throws HireWorldException;

    /**
     * <p>
     * fetching all applicants in the list.
     * </p>       
     *
     * @return the applicants list
     * @throws HireWorldException - when the applicants are empty
     */
    public List<Applicant> retrieveApplicants() throws HireWorldException;

    /**
     * <p>
     * getting the applicant from the given applicant id.
     * </p>
     *
     * @param id - an applicant id for which the applicant to be returned       
     * @return   - the applicant if applicant id is found
     *             null otherwise
     * @throws HireWorldException - when the applicantId is null          
     */
    public Applicant retrieveApplicantById(int applicantId) throws HireWorldException; 

    /**
     * <p>
     * updating the applicant from the given applicant id.
     * </p>
     *
     * @param id - an applicant id for which the applicant to be returned       
     * @return   - the applicant if applicant id is found
     *             null otherwise
     * @throws HireWorldException - when the applicantId is null          
     */ 
    public Applicant updateApplicantById(Applicant updatedApplicant) throws HireWorldException; 

    /**
     * <p>
     * Used to remove the applicant for the given applicant id.
     * </p>
     * 
     * @param id - an applicant id to be removed       
     * @return   - true if the applicant is removed 
     *             false if the applicant is not found
     * @throws HireWorldException - when the applicantId is null            
     */
    public boolean removeApplicantById (int applicantId) throws HireWorldException;

    /**
     * <p>
     * To fetch the applicants for the given recruiter id.
     * </p>
     *
     * @param RecruiterId - a RecruiterId for which the Applicants to be returned
     * @return   - the list of applicants
     * @throws HireWorldException - if any sql exception is occur
     */
    public List<Applicant> retriveApplicantsByRecruiterId(int recruiterId) throws HireWorldException;
}


    