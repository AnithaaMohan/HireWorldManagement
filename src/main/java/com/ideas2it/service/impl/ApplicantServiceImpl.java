package com.ideas2it.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ideas2it.controller.ApplicantController;
import com.ideas2it.dao.ApplicantDao;
import com.ideas2it.dao.impl.ApplicantDaoImpl;
import com.ideas2it.dto.DataTransformation;
import com.ideas2it.enumeration.Qualification;
import com.ideas2it.exception.HireWorldException;
import com.ideas2it.model.Applicant;
import com.ideas2it.model.ApplicantDTO;
import com.ideas2it.service.ApplicantService;
import com.ideas2it.util.constant.Constant;
import com.ideas2it.util.DateUtil;
import com.ideas2it.util.Validation;

public class ApplicantServiceImpl implements ApplicantService { 
    private String nameRegex = Constant.NAME_PATTERN;
    private String emailAddressRegex = Constant.EMAILADDRESS_PATTERN;		
    private String mobileNumberRegex = Constant.MOBILE_NUMBER_PATTERN;
    private String dateOfBirthRegex = Constant.DATE_OF_BIRTH_PATTERN;
    private String genderRegex = Constant.GENDER_PATTERN;
    private int id = Constant.ZERO;
    
    private ApplicantDao applicantDao = new ApplicantDaoImpl();
    private DataTransformation aspirantDTO = new DataTransformation ();   
    
    /**
     *{@inheritDoc}
     */
    public ApplicantDTO createApplicant (ApplicantDTO applicantDTO) throws HireWorldException {     

        Applicant applicant = applicantDao.insertApplicant(aspirantDTO.convertToApplicant(applicantDTO)); 
        
        return aspirantDTO.convertToApplicantDTO(applicant);
    } 

    /**
     *{@inheritDoc}
     */
    public boolean isValidName( String name) throws HireWorldException {
        return Validation.isValidString(name, nameRegex);
    }

    /**
     *{@inheritDoc}
     */
    public boolean isValidEmailAddress(String emailAddress) throws HireWorldException{
        return Validation.isValidString (emailAddress, emailAddressRegex);
    }

    /**
     *{@inheritDoc}
     */
    public boolean isValidMobileNumber(long mobileNumber) throws HireWorldException {
        return Validation.isValidMobileNumber(mobileNumber, mobileNumberRegex);
    }

    /**
     *{@inheritDoc}
     */
    public boolean isValidDateOfBirth(String dateOfBirth)throws HireWorldException {
        return Validation.isValidString(dateOfBirth, dateOfBirthRegex);
    }

    /**
     *{@inheritDoc}
     */
    public boolean isValidGender(char gender) throws HireWorldException {
        return Validation.isValidGender(gender, genderRegex);
    }

    /**
     *{@inheritDoc}
     */
    public ApplicantDTO getApplicantById(int id)throws HireWorldException{
        return aspirantDTO.convertToApplicantDTO(applicantDao.retrieveApplicantById(id));
    }

    /**
     *{@inheritDoc}
     */
    public ApplicantDTO updateApplicantById(ApplicantDTO applicantDTO)throws HireWorldException {
    	Applicant updatedApplicant = applicantDao.updateApplicantById(aspirantDTO.convertToApplicant(applicantDTO)); 
        return aspirantDTO.convertToApplicantDTO(updatedApplicant);
      
    }
 
    /**
     *{@inheritDoc}
     */
    public boolean removeApplicantById(int applicantId) throws HireWorldException {
        return applicantDao.removeApplicantById(applicantId);
    }

    /**
     *{@inheritDoc}
     */
    public List<ApplicantDTO> displayApplicants() throws HireWorldException {
        List<ApplicantDTO> applicantsDTO = new ArrayList<>();        
        List<Applicant> applicants = applicantDao.retrieveApplicants();
  
        if (!applicants.isEmpty()) {
            for (int i = 0; i < applicants.size(); i++) {
                applicantsDTO.add(aspirantDTO.convertToApplicantDTO(applicants.get(i)));
            }
        } else {
            throw new HireWorldException("No Details Found");
        }
        return applicantsDTO;
    }

    /**
     *{@inheritDoc}
     */
    public boolean isIdExist(int applicantId) throws HireWorldException { 
        if(null != getApplicantById(applicantId)) {
            return true;
        }
        return false;
    }

    /**
     *{@inheritDoc}
     */
    public ApplicantDTO assignRecruiter(ApplicantDTO applicantDTO) throws HireWorldException {
        return aspirantDTO.convertToApplicantDTO(applicantDao.insertApplicant(aspirantDTO.convertToApplicant(applicantDTO)));
    }

    /**
     *{@inheritDoc}
     */
    public List<ApplicantDTO> getApplicantsByRecruiterId(int recruiterId) throws HireWorldException {
        List<ApplicantDTO> applicantsDTO = new ArrayList<>();        
        List<Applicant> applicants = applicantDao.retriveApplicantsByRecruiterId(recruiterId);
  
        if (!applicants.isEmpty()) {
            for (int i = 0; i < applicants.size(); i++) {
                applicantsDTO.add(aspirantDTO.convertToApplicantDTO(applicants.get(i)));
            }
        } else {
            throw new HireWorldException("No Details Found");
        }
        return applicantsDTO;
    }
      
	
}    






    