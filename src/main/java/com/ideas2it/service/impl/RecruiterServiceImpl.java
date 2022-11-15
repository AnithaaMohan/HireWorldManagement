package com.ideas2it.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ideas2it.controller.RecruiterController;
import com.ideas2it.dao.impl.RecruiterDaoImpl;
import com.ideas2it.dao.RecruiterDao;
import com.ideas2it.dto.DataTransformation;
import com.ideas2it.exception.HireWorldException;
import com.ideas2it.model.Recruiter;
import com.ideas2it.model.RecruiterDTO;
import com.ideas2it.service.RecruiterService;
import com.ideas2it.util.constant.Constant;
import com.ideas2it.util.Validation;

public class RecruiterServiceImpl implements RecruiterService { 
    private String nameregex = Constant.NAME_PATTERN;
    private String emailAddressregex = Constant.EMAILADDRESS_PATTERN;
    private String mobileNumberregex = Constant.MOBILE_NUMBER_PATTERN;
    private int id = Constant.ZERO;
        
    private RecruiterDao recruiterDao = new RecruiterDaoImpl();
    private DataTransformation scoutDTO = new DataTransformation();

    /**
     *{@inheritDoc}
     */
    public RecruiterDTO createRecruiter ( RecruiterDTO recruiterDTO)throws HireWorldException {
        Recruiter recruiter = recruiterDao.insertRecruiter(scoutDTO.convertToRecruiter(recruiterDTO)); 
        return scoutDTO.convertToRecruiterDTO(recruiter);
    } 

    /**
     *{@inheritDoc}
     */
    public boolean isValidName(String name) throws HireWorldException {
        return Validation.isValidString(name,nameregex);
    }
    
    /**
     *{@inheritDoc}
     */
    public boolean isValidEmailAddress(String emailAddress)throws HireWorldException {
        return Validation.isValidString(emailAddress, emailAddressregex);
    }
    
    /**
     *{@inheritDoc}
     */
    public boolean isValidMobileNumber(long mobileNumber) throws HireWorldException {
        return Validation.isValidMobileNumber(mobileNumber, mobileNumberregex);
    }
    
     /**
     *{@inheritDoc}
     */
    public RecruiterDTO getRecruiterById(int id) throws HireWorldException {
        return scoutDTO.convertToRecruiterDTO(recruiterDao.retrieveRecruiterById(id));
    }
    
    /**
     *{@inheritDoc}
     */
    public RecruiterDTO updateRecruiterById(RecruiterDTO recruiterDTO ) throws HireWorldException {
    Recruiter updatedRecruiter = recruiterDao.updateRecruiterById(scoutDTO.convertToRecruiter(recruiterDTO));
        return scoutDTO.convertToRecruiterDTO(recruiterDao.updateRecruiterById( updatedRecruiter));
    }
    
    /**
     *{@inheritDoc}
     */
    public boolean removeRecruiterById(int recruiterId) throws HireWorldException {
        return recruiterDao.removeRecruiterById(recruiterId);
    }
   
    /**
     *{@inheritDoc}
     */
    public List<RecruiterDTO> displayRecruiters()throws HireWorldException {
        List<RecruiterDTO> recruitersDTO = new ArrayList<>();        
        List<Recruiter> recruiters = recruiterDao.retrieveRecruiters();
  
        if (!recruiters.isEmpty()) {
            for (int i = 0; i < recruiters.size(); i++) {
                recruitersDTO.add(scoutDTO.convertToRecruiterDTO(recruiters.get(i)));
            }
        } else {
            throw new HireWorldException("No Details Found");
        }
        return recruitersDTO;
    }

    /**
     *{@inheritDoc}
     */
    public boolean isIdExist(int recruiterId) throws HireWorldException { 
        if(null != getRecruiterById(recruiterId)) {
            return true;
        }
        return false;
    }

    /**
     *{@inheritDoc}
     */
    public RecruiterDTO assignApplicant(RecruiterDTO recruiterDTO) throws HireWorldException  {
        return scoutDTO.convertToRecruiterDTO(recruiterDao.insertRecruiter(scoutDTO.convertToRecruiter(recruiterDTO)));
    }

    /**
     *{@inheritDoc}
     */
    public List<RecruiterDTO> getRecruitersByApplicantId(int applicantId) throws HireWorldException {
        List<RecruiterDTO> recruitersDTO = new ArrayList<>();        
        List<Recruiter> recruiters = recruiterDao.retriveRecruitersByApplicantId(applicantId);
  
        if (!recruiters.isEmpty()) {
            for (int i = 0; i < recruiters.size(); i++) {
                recruitersDTO.add(scoutDTO.convertToRecruiterDTO(recruiters.get(i)));
            }
        } else {
            throw new HireWorldException("No Details Found");
        }
        return recruitersDTO;
    }   
}

    
    






    



   
 
   
    