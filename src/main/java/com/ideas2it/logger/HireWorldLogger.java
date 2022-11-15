package com.ideas2it.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * gives logic for multiple level of log messages.
 *
 */ 
public class HireWorldLogger {

    public static final Logger logger =  LogManager.getLogger(HireWorldLogger.class);

    /**
     * To display the Info level logs in the console and log file.
     */
    public static void displayInfo(String message) {
        logger.info(message);
    }
  
    /**
     * To display the Error level logs in the console and log file.
     */
    public static void displayError (String message) {
        logger.error(message);
    }
}


    