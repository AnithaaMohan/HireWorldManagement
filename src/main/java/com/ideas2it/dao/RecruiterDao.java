package com.ideas2it.dao;

import java.util.ArrayList;
import java.util.List;

import com.ideas2it.exception.HireWorldException;
import com.ideas2it.model.Recruiter;


/*
 * Gets the input from service 
 * and return back to Impl to perform process related
 * to Recruiter
 */
public interface RecruiterDao {

     /**
     * <p>
     * Used to add the Recruiter in the list with Recruiter id as key.
     * </p>
     *
     * @param Recruiter - the Recruiter to be added in the list     
     * @return         - the Recruiter 
     * @throws HireWorldException - when the Recruiter is null       
     */
    public Recruiter insertRecruiter(Recruiter recruiter) throws HireWorldException;

     /**
     * <p>
     * fetching all Recruiters in the list.
     * </p>       
     *
     * @return the Recruiters list
     * @throws HireWorldException - when the Recruiters are empty
     */
    public List<Recruiter> retrieveRecruiters() throws HireWorldException;

     /**
     * <p>
     * getting the Recruiter from the given Recruiter id.
     * </p>
     *
     * @param id - an Recruiter id for which the Recruiter to be returned       
     * @return   - the Recruiter if Recruiter id is found
     *             null otherwise
     * @throws HireWorldException - when the applicantId is null          
     */
    public Recruiter retrieveRecruiterById(int recruiterId) throws HireWorldException;

    /**
     * <p>
     * updating the Recruiter from the given Recruiter id.
     * </p>
     *
     * @param id - an Recruiter id for which the Recruiter to be returned       
     * @return   - the Recruiter if Recruiter id is found
     *             null otherwise
     * @throws HireWorldException - when the RecruiterId is null          
     */
    public Recruiter updateRecruiterById(Recruiter updatedRecruiter) throws HireWorldException;

    /**
     * <p>
     * Used to remove the Recruiter for the given Recruiter id.
     * </p>
     * 
     * @param id - an Recruiter id to be removed       
     * @return   - true if the Recruiter is removed 
     *             false if the Recruiter is not found
     * @throws HireWorldException - when the RecruiterId is null            
     */
    public boolean removeRecruiterById (int recruiterId) throws HireWorldException;

    /**
     * <p>
     * To fetch the Recruiters for the given applicant id.
     * </p>
     *
     * @param applicantId - a applicantId for which the Recruiters to be returned
     * @return   - the list of recruiterss
     * @throws HireWorldException - if any sql exception is occur
     */
    public List<Recruiter> retriveRecruitersByApplicantId(int applicantsId) throws HireWorldException;
}




