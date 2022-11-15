package com.ideas2it.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ideas2it.model.ApplicantDTO;
import com.ideas2it.service.ApplicantService;
import com.ideas2it.service.impl.ApplicantServiceImpl;
import com.ideas2it.util.DateUtil;
import com.ideas2it.exception.HireWorldException;
import com.ideas2it.logger.HireWorldLogger;

/**
 * Servlet implementation class Applicant
 */
@WebServlet(urlPatterns = { "/createApplicant", "/displayApplicants", "/getApplicantById", "/updateApplicantById",
		"/removeApplicantById", "/getApplicantsByRecruiterId" })

public class ApplicantServlet extends HttpServlet {

	private ApplicantService applicantService = new ApplicantServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		switch (action) {
		case "/createApplicant":
			createApplicant(request, response);
			break;
		case "/displayApplicants":
			displayApplicants(request, response);
			break;
		case "/getApplicantById":
			getApplicantById(request, response);
			break;
		case "/updateApplicantById":
			updateApplicantById(request, response);
			break;
		case "/removeApplicantById":
			removeApplicantById(request, response);
			break;
		case "/getApplicantsByRecruiterId":
			getApplicantsByRecruiterId(request, response);
			break;
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		switch (action) {
		case "/createApplicant":
			createApplicant(request, response);
			break;
		case "/displayApplicants":
			displayApplicants(request, response);
			break;
		case "/getApplicantById":
			getApplicantById(request, response);
			break;
		case "/updateApplicantById":
			updateApplicantById(request, response);
			break;
		case "/removeApplicantById":
			removeApplicantById(request, response);
			break;
		case "/getApplicantsByRecruiterId":
			getApplicantsByRecruiterId(request, response);
			break;
		}
	}

	private void createApplicant(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		try {

			String name = request.getParameter("name");
			String emailAddress = request.getParameter("emailAddress");
			Long mobileNumber = Long.parseLong(request.getParameter("mobileNumber"));
			String qualification = request.getParameter("qualification");
			String gen = request.getParameter("gender");
			char gender = gen.charAt(0);
			Date dateOfBirth = DateUtil.getParsedDateOfBirth(request.getParameter("dateOfBirth"));

			ApplicantDTO applicantDTO = new ApplicantDTO();

			applicantDTO.setName(name);
			applicantDTO.setMobileNumber(mobileNumber);
			applicantDTO.setEmailAddress(emailAddress);
			applicantDTO.setDateOfBirth(dateOfBirth);
			applicantDTO.setGender(gender);
			applicantDTO.setQualification(qualification);
			ApplicantDTO createdApplicantDTO = applicantService.createApplicant(applicantDTO);

			HttpSession session = request.getSession();

			if (0 != createdApplicantDTO.getId()) {
				session.setAttribute("Applicant", createdApplicantDTO);
			} else {
				session.setAttribute("Applicant", "Failed to Create Applicant ");
			}
			response.sendRedirect("createApplicant.jsp");
		} catch (HireWorldException hireWorldException) {
			HireWorldLogger.displayError(hireWorldException.getMessage());
		}
	}

	/**
	 * <p>
	 * To display all the Applicants stored in the Applicants table. if the
	 * applicants table is empty, display no record found.
	 * </p>
	 */
	private void displayApplicants(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<ApplicantDTO> applicantsDTO = applicantService.displayApplicants();
			HttpSession session = request.getSession();
			if (!applicantsDTO.isEmpty()) {
				session.setAttribute("Applicants", applicantsDTO);
			} else {
				session.setAttribute("Applicants", "No Record Found");
			}
			response.sendRedirect("displayApplicants.jsp");
		} catch (HireWorldException hireWorldException) {
			HireWorldLogger.displayError(hireWorldException.getMessage());
		}
	}

	/**
	 * Gets the Applicant form database using Applicant id
	 *
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 * @throws HireWorldException
	 */
	public void getApplicantById(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		try {

			int applicantId = Integer.parseInt(request.getParameter("applicantId"));
			ApplicantDTO applicantDTO = applicantService.getApplicantById(applicantId);
			HttpSession session = request.getSession();

			if (null != applicantDTO) {
				session.setAttribute("applicantDTO", applicantDTO);
				if (request.getServletPath().equals("/getApplicantForUpdate")) {
					System.out.println(applicantDTO);
					response.sendRedirect("updateApplicant.jsp");
				} else {
					response.sendRedirect("getApplicantById.jsp");
					session.setAttribute("applicantDTO", "No Applicant Found in Given ID");
				}
			}
		} catch (HireWorldException hireWorldException) {
			HireWorldLogger.displayError(hireWorldException.getMessage());
		}
	}

	/**
	 * Update the applicant details form database based on the request
	 *
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ParseException
	 * @throws ServletException
	 * @throws HireWorldException
	 */
	private void updateApplicantById(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		ApplicantDTO applicantDTO = new ApplicantDTO();

		try {

			String name = request.getParameter("name");
			String emailAddress = request.getParameter("emailAddress");
			Long mobileNumber = Long.parseLong(request.getParameter("mobileNumber"));
			String qualification = request.getParameter("qualification");
			String gen = request.getParameter("gender");
			char gender = gen.charAt(0);
			Date dateOfBirth = DateUtil.getParsedDateOfBirth(request.getParameter("dateOfBirth"));

			int applicantId = Integer.parseInt(request.getParameter("applicantId"));
			applicantDTO = applicantService.getApplicantById(applicantId);

			applicantDTO.setName(name);
			applicantDTO.setMobileNumber(mobileNumber);
			applicantDTO.setEmailAddress(emailAddress);
			applicantDTO.setDateOfBirth(dateOfBirth);
			applicantDTO.setGender(gender);
			applicantDTO.setQualification(qualification);
			HttpSession session = request.getSession();

			if (applicantService.updateApplicantById(applicantDTO) != null) {
				session.setAttribute("Applicant", "Applicant Successfully updated..." + applicantDTO);
			} else {
				session.setAttribute("Applicant", "Applicant not updated...");
			}
			response.sendRedirect("updateApplicant.jsp");
		} catch (HireWorldException hireWorldException) {
			HireWorldLogger.displayError(hireWorldException.getMessage());
		}
	}

	/**
	 * Delete the Applicant form database based on the requested applicant id
	 *
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 * @throws HireWorldException
	 */
	private void removeApplicantById(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		try {

			int applicantId = Integer.parseInt(request.getParameter("applicantId"));
			ApplicantDTO applicantDTO = applicantService.getApplicantById(applicantId);

			HttpSession session = request.getSession();

			if (null != applicantDTO) {
				boolean isDeleted = applicantService.removeApplicantById(applicantId);

				if (isDeleted) {
					session.setAttribute("isDeleted", "Applicant Deleted Sucessfully");
					response.sendRedirect("removeApplicant.jsp");
				} else {
					session.setAttribute("isDeleted", "Applicant Not Deleted");
				}
			} else {
				session.setAttribute("isDeleted", "No Such Applicant Found");
				response.sendRedirect("No Applicant Found.jsp");
			}
		} catch (HireWorldException hireWorldException) {
			HireWorldLogger.displayError(hireWorldException.getMessage());
		}
	}

	private void getApplicantsByRecruiterId(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		try {

			int applicantId = Integer.parseInt(request.getParameter("applicantId"));
			List<ApplicantDTO> applicantsDTO = applicantService.getApplicantsByRecruiterId(applicantId);

			HttpSession session = request.getSession();

			if (null != applicantsDTO) {
				session.setAttribute("applicantDTO", applicantsDTO);
			} else {
				session.setAttribute("applicantDTO", "Applicants Not found");
			}
			response.sendRedirect("displayApplicantsByRecruiterId.jsp");
		} catch (HireWorldException hireWorldException) {
			HireWorldLogger.displayError(hireWorldException.getMessage());
		}
	}
}
