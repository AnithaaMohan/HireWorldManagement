package com.ideas2it.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ideas2it.exception.HireWorldException;
import com.ideas2it.logger.HireWorldLogger;

/**
 * DatabaseConnection a singleton class with the methods to connect to the database
 */
public class DatabaseConnection {  
 
    private static DatabaseConnection databaseConnection;
    private static Connection connection;
    private static String url = "jdbc:mysql://localhost:3306/hireworld"; 
    private static String userName = "root";
    private static String password = "Mohan1997#";

    private DatabaseConnection() throws SQLException {
        connection = DriverManager.getConnection(url,userName,password);
    }

    /**
     * <p>
     * This method creates an object for DataBaseConnection
     * </p>
     *
     * @return - an instance of the class
     */
    public static Connection getConnection() throws SQLException {
       if (null == connection || connection.isClosed()) {
           databaseConnection = new DatabaseConnection();
       } 
       return connection;
    } 

    /**
     * <p>
     * This method closes the DataBaseConnection , Statement.
     * </p>
     *
     * @return - an instance of the class
     */
    public static void closeConnection(PreparedStatement preparedStatement)  {

        try {
            if (null != preparedStatement) {
                preparedStatement.close();
            }
        } catch (SQLException sqlException) {
            HireWorldLogger.displayError(sqlException.getMessage());
        }

        try {
            if(null != connection) {
                connection.close();
            }
        } catch (SQLException sqlException) {
            HireWorldLogger.displayError(sqlException.getMessage());
        }
    }
}