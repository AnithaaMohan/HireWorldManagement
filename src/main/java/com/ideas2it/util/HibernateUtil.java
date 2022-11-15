package com.ideas2it.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ideas2it.model.Applicant;
import com.ideas2it.model.Recruiter;

/**
 * <p>
 * This is a utility class for getting the hibernate session object.
 * </p>
 */
public class HibernateUtil {
    private static SessionFactory factory;

    private HibernateUtil() throws HibernateException {
        Configuration configuration = new Configuration()
                .configure();
	factory = configuration.buildSessionFactory();
    }

    /**
     * <p>
     * Creating an object for SessionFactory
     * </p>
     *
     * @return - the session factory object
     */
    public static SessionFactory getSessionFactory() {
        if (null == factory || factory.isClosed()) {
        new HibernateUtil();
        }
        return factory;
    }
}
