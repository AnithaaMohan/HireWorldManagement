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
	<%
	List<RecruiterDTO> recruitersDTO = (List<RecruiterDTO>) session.getAttribute("RecruiterDTO");
	System.out.println(recruitersDTO);
	if (null != recruitersDTO) {
		System.out.println(recruitersDTO);
		if (!recruitersDTO.isEmpty()) {
	%>
	<%
	for (RecruiterDTO recruiterDTO : recruitersDTO) {
	%>
    <table>
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
		<td>mobileNumber :</td>
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
		<td>ApplicantsDTO :</td>
		<%
		if (null != applicantsDTO && !applicantsDTO.isEmpty()) {
		%>

		<td><%=applicantsDTO.stream().map(applicantDTO -> applicantDTO.getName()).collect(Collectors.joining(","))%></td>
		<%
		} else {
		%>
		<td>applicantDTO not yet assigned</td>
	</tr>
	<%
	}
	%>
	<tr>
		<td>---------------------</td>
	</tr>
	<%
	}
	}
	}
	%>
	</table>
</body>
</html>