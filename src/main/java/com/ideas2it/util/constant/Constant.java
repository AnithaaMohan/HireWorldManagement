package com.ideas2it.util.constant;

public class Constant {

    public final static String NAME_PATTERN               =  "[a-z A-Z]*";
    public final static String DATE_OF_BIRTH_PATTERN      =  "^\\d{2}-\\d{2}-\\d{4}$";
    public final static String EMAILADDRESS_PATTERN       =  "[a-zA-Z0-9.]+@[a-z]+[.][a-z]{2,3}$";
    public final static String MOBILE_NUMBER_PATTERN      =  "[6-9][0-9]{9}";
    public final static String GENDER_PATTERN             =  "[M|F|O]{1}";
   
    public final static int ZERO                          =  0;
    public final static int DISPLAY_APPLICANT             =  1;
    public final static int CREATE_APPLICANT              =  1;
    public final static int CREATE_RECRUITER              =  1;
    public final static int SET_APPLICANT_NAME            =  1;
    public final static int SET_RECRUITER_NAME            =  1;
    public final static int APPLICANT_NEW_NAME            =  1;
    public final static int RECRUITER_NEW_NAME            =  1;
    public final static int DISPLAY_RECRUITER             =  2;
    public final static int DISPLAY_RECRUITERS            =  2;
    public final static int DISPLAY_APPLICANTS            =  2;
    public final static int SET_APPLICANT_EMAIL_ADDRESS   =  2;
    public final static int SET_RECRUITER_EMAIL_ADDRESS   =  2;
    public final static int APPLICANT_NEW_EMAILADDRESS    =  2;
    public final static int RECRUITER_NEW_EMAILADDRESS    =  2;
    public final static int BREAK                         =  3;    
    public final static int GET_APPLICANT                 =  3;    
    public final static int GET_RECRUITER                 =  3;
    public final static int SET_RECRUITER_MOBILE_NUMBER   =  3;
    public final static int SET_APPLICANT_QUALIFICATION   =  3;
    public final static int APPLICANT_NEW_QUALIFICATION   =  3;
    public final static int RECRUITER_NEW_MOBILE_NUMBER   =  3;
    public final static int UPDATE_APPLICANT              =  4;
    public final static int UPDATE_RECRUITER              =  4;
    public final static int SET_APPLICANT_MOBILE_NUMBER   =  4;
    public final static int APPLICANT_NEW_MOBILE_NUMBER   =  4;
    public final static int ASSIGN_APPLICANT              =  4;
    public final static int APPLICANT_NEW_DOB             =  5;
    public final static int UNASSIGN_APPLICANT            =  5;
    public final static int REMOVE_RECRUITER              =  5; 
    public final static int REMOVE_APPLICANT              =  5;
    public final static int SET_APPLICANT_DATE            =  5;
    public final static int SET_APPLICANT_GENDER          =  6;
    public final static int APPLICANT_NEW_GENDER          =  6;
    public final static int EXIT_UPDATE_RECRUITER         =  6;
    public final static int GET_ASSIGNED_APPLICANTS       =  6;
    public final static int GET_ASSIGNED_RECRUITERS       =  6;
    public final static int APPLICANT_BREAK               =  7;
    public final static int RECRUITER_BREAK               =  7; 
    public final static int EXIT_UPDATE_APPLICANT         =  7;  

    public final static String LIST_IS_EMPTY              =  "Your List is Empty";
    public final static String NOT_FOUND                  =  "Person is not found";
    public final static String NOT_ADDED                  =  "Person not added..";
    public final static String NULL_INPUT                 =  "Input is Null"; 
    public final static String INVALID_GENDER             =  "invalid Gender";
    public final static String INVALID_DATE               =  "it is invalid dateOfBirth";
    public final static String SUCECSSFULLY_ADDED         =  "Given Details are Successfully added ";
    public final static String ENTER_NAME                 =  "Enter your name";
    public final static String ENTER_EMAILADDRESS         =  "Enter your emailAddress";
    public final static String ENTER_QUALIFICATION        =  "Enter your qualification";
    public final static String ENTER_MOBILE_NUMBER        =  "Enter your MobileNumber";
    public final static String ENTER_DOB                  =  "Enter your dateOfBirth in DD-MM-YYYY format";
    public final static String ENTER_GENDER               =  "Enter your Gender M/F/O ";
    public final static String ENTER_INTEGERS             =  "Enter Only Integers";        
    public final static String ENTER_LONG                 =  "Enter a valid Long input";
    public final static String ENTER_CHAR                 =  "Enter a valid char input";
    public final static String ENTER_ID                   =  "Enter id: ";
    public final static String ENTER_ID_TO_REMOVE         =  "Enter id to be removed : ";
    public final static String ENTER_ID_TO_UPDATE         =  "Enter the id to be updated: ";
    public final static String APPLICANT_REMOVED          =  "Applicant is Removed";
    public final static String APPLICANT_UPDATED          =  "Applicant Updated";
    public final static String APPLICANT_NOT_FOUND        =  "No such applicants found";
    public final static String APPLICANT_NOT_ASSIGNED     =  "Applicant not Assigned";
    public final static String APPLICANT_NOT_UNASSIGNED   =  "Applicant not UnAssigned";
    public final static String RECRUITER_NOT_FOUND        =  "No such Recruiter found";
    public final static String RECRUITER_REMOVED          =  "Recruiter is Removed";
    public final static String RECRUITER_UPDATED          =  "\n Recruiter Updated ";
    public final static String DETAILS_NOT_FOUND          =  "No details found";

    
    public final static String CHANGE_APPLICANT_DETAILS   =  "Choose your replace detail \n"
                                                                + " 1.Name \n 2.EmailAddress \n 3.Qualification \n"
                                                                + " 4.MobileNumber \n 5.DateOfBirth \n 6.Gender \n"
                                                                + " 7.Exit";

    public final static String CHANGE_RECRUITER_DETAILS   =  "Choose your new detail \n"
                                                                + " 1.name \n 2.emailAddress \n 3.mobileNumber" 
                                                                +  "\n 4.AssignApplicant \n 5.UnAssignApplicant \n 6.Exit";

    public final static String CHOOSE_OPTION              =  "Choose your Option \n 1.Applicant"
                                                                +" \n 2.Recruiter \n 3.Exit ";


    public final static String CHOOSE_QUALIFICATION       =  "Choose : \n1.BE \n2.BTech \n3.BCA \n4.BSC"
                                                                + "\n5.ME \n6.MTech \n7.MCA \n8.MSC \n9.OTHERS";

    public final static String CHOOSE_RECRUITER_OPERATION =  "Choose your options \n 1.Create "
                                                                + "\n 2.Display \n 3.Search \n 4.Update"
                                                                + " \n 5.Delete \n 6.View Applicant Allocations  \n 7.Exit ";

    public final static String CHOOSE_APPLICANT_OPERATION = "Choose your options \n 1.Create \n 2.Display"
                                                               + " \n 3.Search \n 4.Update \n 5.Delete"
                                                               + " \n 6.View Recruiter Allocations \n 7.Exit ";

    public final static String TO_CONTINUE                =  "To go back menu:  press 1"
                                                                + " \n Exit press any number ";

    public final static String TO_CONTINUE_MAIN_MENU      =  "To go back main menu:  press 1"
                                                                + " \n Exit press any number ";

    public final static String TO_CONTINUE_APPLICANT_MENU = "To go back applicant menu:  press 1"
                                                                + " \n Exit press any number ";

    public final static String TO_CONTINUE_RECRUITER_MENU =  "To go back recruiter menu:  press 1"
                                                                + " \n Exit press any number ";

    public final static String INVALID_CHOISE             = "INVALID OPTION "+ "\n Choose correct option ";

    public final static String RECRUITER_ID_TO_ASSIGN            =  "Enter Recruiter Id to assign to selected Applicant";
    public final static String APPLICANT_ID_TO_ASSIGN            =  "Enter Applicant Id to assign to selected Recruiter";
    public final static String RECRUITER_ID_TO_UNASSIGN          =  "Enter Recruiter Id to unassign to selected Applicant";
    public final static String APPLICANT_ID_TO_UNASSIGN          =  "Enter Applicant Id to unassign to selected Recruiter";
    public final static String RECRUITER_ALLOCATION_SUCCESS      =  "Recruiter Alloted Successfully";
    public final static String APPLICANT_ALLOCATION_SUCCESS      =  "  \n Applicant Alloted Successfully";
    public final static String RECRUITER_ALLOCATION_FAILED       =  " \n Recruiter Allocation failed";
    public final static String APPLICANT_ALLOCATION_FAILED       =  "Applicant Allocation failed";
    public final static String RECRUITER_DEALLOCATED_SUCESSFULLY =  "Recruiter DeAllocated Succesfully";
    public final static String RECRUITER_DEALLOCATION_FAILED     =  "Recruiter DeAllocation failed"; 
    public final static String APPLICANT_DEALLOCATED_SUCESSFULLY =  "Applicant DeAllocated Succesfully";
    public final static String APPLICANT_DEALLOCATION_FAILED     =  "Applicant DeAllocation failed";
    public final static String ENTER_VALID_LONG_INPUT            =  "Enter a valid Long input";
    public final static String ENTER_RECRUITER_ID_TO_FETCH_APPLICANTS  =  "Enter a RecruiterId to see assigned Applicants";
    public final static String ENTER_APPLICANT_ID_TO_FETCH_RECRUITERS  =  "Enter a ApplicantId to see assigned Recruiters";

}













