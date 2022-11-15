package com.ideas2it.dto;

import java.util.ArrayList;
import java.util.List;

import com.ideas2it.model.Applicant;
import com.ideas2it.model.ApplicantDTO;
import com.ideas2it.model.Recruiter;
import com.ideas2it.model.RecruiterDTO;

public class DataTransformation  {
	

    /**
     * Converts the applicant into applicantDTO.
     * 
     * @param  applicant     as DAO Type.
     * @return applicantDTO  as DTO Type.
     */
    public ApplicantDTO convertToApplicantDTO(Applicant applicant) {
        ApplicantDTO applicantDTO = new ApplicantDTO();

        applicantDTO.setName(applicant.getName());
        applicantDTO.setEmailAddress(applicant.getEmailAddress());
        applicantDTO.setQualification(applicant.getQualification());
	    applicantDTO.setMobileNumber(applicant.getMobileNumber());
	    applicantDTO.setGender(applicant.getGender());
        applicantDTO.setDateOfBirth(applicant.getDateOfBirth());
	    applicantDTO.setId(applicant.getId());
	    applicantDTO.setDeleted(applicant.isDeleted());   

        List<Recruiter> employees = applicant.getRecruiters();        
          
        if (null != employees) { 
 
           List<RecruiterDTO> recruiters  = new ArrayList<>();     
       
            for (Recruiter employee: employees) {
            List<Applicant> applicants = employee.getApplicants();
            applicants = null;
            employee.setApplicants(applicants);
            recruiters.add(convertToRecruiterDTO(employee));
            }
            applicantDTO.setRecruiters(recruiters);
        }
        return applicantDTO;	    
    }
	
    /**
     * Converts the applicantDTO into applicant.
     * 
     *@param  applicantDTO  as DTO Type.
     *@return applicant     as DAO Type.  
     */
    public Applicant convertToApplicant(ApplicantDTO applicantDTO) {
        Applicant applicant = new Applicant();

        applicant.setName(applicantDTO.getName());
	applicant.setEmailAddress(applicantDTO.getEmailAddress());
	applicant.setQualification(applicantDTO.getQualification());
	applicant.setMobileNumber(applicantDTO.getMobileNumber());
        applicant.setDateOfBirth(applicantDTO.getDateOfBirth());
	applicant.setGender(applicantDTO.getGender());
	applicant.setId(applicantDTO.getId());
	applicant.setDeleted(applicantDTO.isDeleted());

        List<RecruiterDTO> employees = applicantDTO.getRecruiters();
            
        if (null != employees) {
        List<Recruiter> recruiters = new ArrayList<>();

            for (RecruiterDTO employee: employees) {
            List<ApplicantDTO> applicantsDTO = employee.getApplicants();
            applicantsDTO = null;
            employee.setApplicants(applicantsDTO);
            recruiters.add(convertToRecruiter(employee));
            }
            applicant.setRecruiters(recruiters);
       }	    
        return applicant;		
    }

    /**
     * Converts the recruiter into recruiterDTO.
     * 
     * @param  recruiter     as DAO Type.
     * @return recruiterDTO  as DTO Type.
     */
    public RecruiterDTO convertToRecruiterDTO(Recruiter recruiter) {
        RecruiterDTO recruiterDTO = new RecruiterDTO();

        recruiterDTO.setName(recruiter.getName());
	recruiterDTO.setEmailAddress(recruiter.getEmailAddress());
        recruiterDTO.setMobileNumber(recruiter.getMobileNumber());
	recruiterDTO.setId(recruiter.getId());
        recruiterDTO.setDeleted(recruiter.isDeleted());   

        List<Applicant> aspirant = recruiter.getApplicants();    

        if (null != aspirant) {
        List<ApplicantDTO> candidates = new ArrayList<>(); 

            for (Applicant candidate : aspirant) {
            List<Recruiter> recruiters = candidate.getRecruiters();
            recruiters = null;            
            candidate.setRecruiters(recruiters);
            candidates.add(convertToApplicantDTO(candidate));
            }
        recruiterDTO.setApplicants(candidates);
        }
       return recruiterDTO;
    }
	
    /**
     * Converts the  recruiterDTO into  recruiter.
     * 
     *@param  recruiterDTO   as DTO Type.
     *@return recruiter      as DAO Type.  
     */
    public Recruiter convertToRecruiter(RecruiterDTO recruiterDTO) {
	Recruiter recruiter = new Recruiter();

	recruiter.setName(recruiterDTO.getName());
	recruiter.setEmailAddress(recruiterDTO.getEmailAddress());
	recruiter.setMobileNumber(recruiterDTO.getMobileNumber());
	recruiter.setId(recruiterDTO.getId());	
        recruiter.setDeleted(recruiterDTO.isDeleted());

        List<ApplicantDTO> aspirant = recruiterDTO.getApplicants();

        if (null != aspirant) {

            List<Applicant> candidates = new ArrayList<>();

            for (ApplicantDTO candidate : aspirant) {
            List<RecruiterDTO>  recruitersDTO =  candidate.getRecruiters();
            recruitersDTO = null;
            candidate.setRecruiters(recruitersDTO);
            candidates.add(convertToApplicant(candidate));
            }
            recruiter.setApplicants(candidates);
        }
       return recruiter;
    }


	
}





























    /* public List<ApplicantDTO> getApplicants(List<Applicant> applicants) {
	    List<ApplicantDTO> applicantDTOList = new ArrayList<ApplicantDTO> ();
		
            for(Applicant applicant : applicants) {
		ApplicantDTO applicantDTO = new ApplicantDTO();
		applicantDTO.setName(applicant.getName());
		applicantDTO.setEmailAddress(applicant.getEmailAddress());
		applicantDTO.setQualification(applicant.getQualification());
		applicantDTO.setMobileNumber(applicant.getMobileNumber());
                applicantDTO.setDateOfBirth(applicant.getDateOfBirth());
		applicantDTO.setGender(applicant.getGender());
		applicantDTO.setId(applicant.getId());
	        applicantDTO.setDeleted(applicant.isDeleted());	 
                applicantDTOList.add(applicantDTO);  
            }
	    return applicantDTOList;
	} */	

