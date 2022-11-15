package com.ideas2it.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.ideas2it.exception.HireWorldException;

/**
 * Validation class gets the input from service and validated the input     
 */

public class Validation {

    /**
     * This method is used to validate the String Inputs.
     *      
     * @return     - true if pattern matches 
     * @throws HireWorldException - when the given input does not matches                  
     */
    public static boolean isValidString(String value, String regex) throws HireWorldException {
        Pattern stringPattern = Pattern.compile(regex);
        Matcher matcher = stringPattern.matcher(value);
        if (matcher.matches()) {
            return true;
        } else {
            throw new HireWorldException ("Wrong format !!! Enter the Correct format"); 
        }  
     }

    /**
     * This method is used to validate the MobileNumber Inputs.
     *      
     * @return     - true if pattern matches 
     * @throws HireWorldException - when the given input does not matches                  
     */
    public static boolean isValidMobileNumber(long value, String regex) throws HireWorldException  {
        String mobileNumber = Long.toString(value);
        Pattern stringPattern = Pattern.compile(regex);
        Matcher matcher = stringPattern.matcher(mobileNumber);
        if (matcher.matches()) {
            return true;
        } else {
            throw new HireWorldException ("Wrong format !!! Enter your 10 digit number"); 
        } 
    }
 
    /**
     * This method is used to validate the Gender Inputs.
     *      
     * @return     - true if pattern matches 
     * @throws HireWorldException- when the given input does not matches                  
     */
    public static boolean isValidGender(char value, String regex) throws HireWorldException {
        String gender = Character.toString(value);
        Pattern charPattern = Pattern.compile(regex);
        Matcher matcher = charPattern.matcher(gender);
        if (matcher.matches()) {
            return true;
        } else {
            throw new HireWorldException ("Enter 'M' for male / 'F' for female / 'O' for other"); 
        } 
    }    
}




   

    

    
   
    
   
    