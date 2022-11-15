package com.ideas2it.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.ideas2it.dao.ApplicantDao;
import com.ideas2it.exception.HireWorldException;
import com.ideas2it.logger.HireWorldLogger;
import com.ideas2it.model.Applicant;
import com.ideas2it.model.Recruiter;
import com.ideas2it.util.HibernateUtil;


public class ApplicantDaoImpl implements ApplicantDao {
	private SessionFactory factory = HibernateUtil.getSessionFactory();

	/**
	 * {@inheritDoc}
	 */
	public Applicant insertApplicant(Applicant applicant) throws HireWorldException {
		Session session = null;

		try {
			session = factory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(applicant);
			session.getTransaction().commit();

			if (0 != applicant.getId()) {
				HireWorldLogger.displayInfo(applicant.getName() + " Applicant Inserted ");
			}
		} catch (HibernateException hibernateException) {
			System.out.println(hibernateException);
			session.getTransaction().rollback();
			throw new HireWorldException("Error occoured while trying to insert " + applicant.getName());
		} finally {
			try {

				if (null != session) {
					session.close();
				}
			} catch (HibernateException hibernateException) {
				HireWorldLogger.displayError("Error occoured while trying to close the session");
			}
		}
		return applicant;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Applicant> retrieveApplicants() throws HireWorldException {
		List<Applicant> applicants = null;
		Session session = null;

		try {
			session = factory.openSession();
			applicants = (List<Applicant>) session.createQuery("FROM Applicant").list();
			HireWorldLogger.displayInfo("Displaying all the Applicants");
		} catch (HibernateException hibernateException) {
			throw new HireWorldException("Error occoured while trying to fetch all Applicants ");
		} finally {
			try {

				if (null != session) {
					session.close();
				}
			} catch (HibernateException hibernateException) {
				HireWorldLogger.displayError("Error occoured while trying to close the session");
			}
		}
		return applicants;
	}

	/**
	 * {@inheritDoc}
	 */
	public Applicant retrieveApplicantById(int applicantId) throws HireWorldException {
		Applicant applicant = null;
		Session session = null;

		try {
			session = factory.openSession();
			applicant = (Applicant) session.get(Applicant.class, applicantId);
		} catch (HibernateException hibernateException) {
			throw new HireWorldException("Error occoured while trying to fetch " + applicant.getName());
		} finally {
			try {

				if (null != session) {
					session.close();
				}
			} catch (HibernateException hibernateException) {
				HireWorldLogger.displayError("Error occoured while trying to close the session");
			}
		}
		return applicant;
	}

	/**
	 * {@inheritDoc}
	 */
	public Applicant  updateApplicantById(Applicant updatedApplicant) throws HireWorldException {
		Session session = null;
		boolean isUpdated = false;
		try {
			System.out.println(updatedApplicant);
			session = factory.openSession();
			session.beginTransaction();
			session.update(updatedApplicant);
			session.getTransaction().commit();
			isUpdated = true;
		} catch (HibernateException hibernateException) {
			session.getTransaction().rollback();
			throw new HireWorldException(hibernateException.getMessage());
		} finally {
			if (null != session) {
				session.close();
			}
		}
		return updatedApplicant;
	}  

	/**
	 * {@inheritDoc}
	 */
	public boolean removeApplicantById(int applicantId) throws HireWorldException {
		Applicant applicant = null;
		boolean isRemoved = false;
		Session session = null;
		Transaction transaction = null;

		try {
			session = factory.openSession();
			session.beginTransaction();
			applicant = (Applicant) session.get(Applicant.class, applicantId);
			applicant.setDeleted(true);
			System.out.println(applicant);
			session.update(applicant);
			session.getTransaction().commit();

			if (transaction != null) {
				isRemoved = true;
			}
		} catch (HibernateException hibernateException) {
			session.getTransaction().rollback();
			throw new HireWorldException("Error occoured while trying to delete " + applicant.getName());
		} finally {
			try {

				if (null != session) {
					session.close();
				}
			} catch (HibernateException hibernateException) {
				HireWorldLogger.displayError("Error occoured while trying to close the session");
			}
		}
		return isRemoved;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Applicant> retriveApplicantsByRecruiterId(int recruiterId) throws HireWorldException {
		List<Applicant> applicants = null;
		Session session = null;

		try {
			session = factory.openSession();
			session.beginTransaction();
			StringBuilder hqlQuery = new StringBuilder();
			hqlQuery.append("select applicant from Applicant applicant ").append("JOIN applicant.recruiters recruiter ")
					.append("where recruiter.id = :recruiterId ").append("and applicant.isDeleted = false ");

			Query<Applicant> query = session.createQuery(hqlQuery.toString());
			applicants = query.setParameter("recruiterId", recruiterId).getResultList();
		} catch (HibernateException hibernateException) {
			throw new HireWorldException(" \n Error occoured while trying to fetch assigned applicants");
		} finally {
			try {

				if (null != session) {
					session.close();
				}
			} catch (HibernateException hibernateException) {
				HireWorldLogger.displayError("\n Error occoured while trying to close the session");
			}
		}
		return applicants;
	}

}
