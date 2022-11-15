package com.ideas2it.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ideas2it.exception.HireWorldException;

/**
 * DateUtil class handles the date related functions 
 */
public class DateUtil {

    /**
     * To get the parsed dateOfBirth;. 
     *
     * @param dateOfBirth; - a dateOfBirth; to be parsed.
     * @return     - parsed ddateOfBirth;
     * @throws HireWorldException - when the given date is not in dd-MM-yyyy format
     */
    public static Date getParsedDateOfBirth(String value) throws HireWorldException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dateOfBirth = null;
        formatter.setLenient(false);

        try {
            dateOfBirth = formatter.parse(value);  
        } catch (ParseException parseException) {
            throw new HireWorldException("Date range exceeds");
        }
        return dateOfBirth;
    }


}