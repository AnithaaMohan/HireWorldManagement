<%@page import="java.util.stream.Collectors"%>
<%@page import="com.ideas2it.model.ApplicantDTO"%>
<%@page import="com.ideas2it.model.RecruiterDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="getApplicantById" method="post">
		<table>
			<tr>
				<td>Enter the id </td>
				<td><input type="number" name="recruiterId"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Display Recruiter By Id"></td>
			</tr>
			
			<%
			RecruiterDTO recruiterDTO  = (RecruiterDTO ) session.getAttribute("RecruiterDTO ");
			if (null != recruiterDTO ) {
			%>
			
			<tr>
				<td>Id :</td>
				<td><%=recruiterDTO.getId()%></td>
			</tr>

			<tr>
				<td>Name :</td>
				<td><%=recruiterDTO.getName()%></td>
			</tr>

			<tr>
				<td>EmailAddress :</td>
				<td><%=recruiterDTO.getEmailAddress()%></td>
			</tr>
			
			<tr>
				<td>MobileNumber :</td>
				<td><%=recruiterDTO.getMobileNumber()%></td>
			</tr>

			<tr>
				<td>Delete Status :</td>
				<td><%=recruiterDTO.isDeleted()%></td>
			</tr>

			<%
			List<ApplicantDTO> applicantsDTO = recruiterDTO.getApplicants();
			%>
			
			<tr>
				<td>Applicants :</td>
				<%
				if (null != applicantsDTO && !applicantsDTO.isEmpty()) {
				%>
				<td><%=applicantsDTO.stream().map(applicantDTO-> applicantDTO.getName()).collect(Collectors.joining(","))%></td>
				<%
				} else {
				%>
				<td>Applicant not yet assigned</td>
			</tr>
			<%
			}
			}
			%>
		</table>
	</form>
</body>
</html>