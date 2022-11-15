<%@page import="com.ideas2it.model.ApplicantDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="getApplicantForUpdate">
		Applicant Id: <input type="text" name="applicantId"> <input
			type="submit" value="submit">
	</form>
	<%
	ApplicantDTO applicantDTO = (ApplicantDTO) session.getAttribute("ApplicantDTO");
	%>
	<form method="post" action="updateApplicantById">
		<%
		if (null != applicantDTO) {
		%>
		<table>
			<tr>
				<td>Id</td>
				<td><input name="applicantId" value="<%=applicantDTO.getId()%>" readonly>
			</tr>
			<tr>
				<td>Name</td>
				<td><input name="name" value="<%=applicantDTO.getName()%>">
			</tr>
			<tr>
				<td>EmailAddress</td>
				<td><input name="emailAddress" value="<%=applicantDTO.getEmailAddress()%>">
			</tr>
			<tr>
				<td>Qualification</td>
				<%
				String option = applicantDTO.getQualification().toString();
				%>
				<td><select name="qualification" required>
						<option value="BE" <%if (option.equals("BE")) {%>
							<%="selected"%> <%}%>>BE</option>
						<option value="BTech" <%if (option.equals("BTech")) {%>
							<%="selected"%> <%}%>>BTech</option>
						<option value="BCA" <%if (option.equals("BCA")) {%>
							<%="selected"%> <%}%>>BCA</option>
						<option value="BSC" <%if (option.equals("BSC")) {%>
							<%="selected"%> <%}%>>BSC</option>
						<option value="ME" <%if (option.equals("ME")) {%>
							<%="selected"%> <%}%>>ME</option>
						<option value="MTech" <%if (option.equals("MTech")) {%>
							<%="selected"%> <%}%>>MTech</option>
						<option value="MCA" <%if (option.equals("MCA")) {%>
							<%="selected"%> <%}%>>BTech</option>
						<option value="MSC" <%if (option.equals("MSC")) {%>
							<%="selected"%> <%}%>>MSC</option>	
						<option value="OTHERS" <%if (option.equals("OTHERS")) {%>
							<%="selected"%> <%}%>>OTHERS</option>		
						<option value="BE"
							<%if (option.equals("BE")) {%> <%="selected"%> <%}%>>BE</option>
						<option value="BTech"
							<%if (option.equals("BTech")) {%> <%="selected"%> <%}%>>BTech</option>
						<option value="BCA"
							<%if (option.equals("BCA")) {%> <%="selected"%> <%}%>>BCA</option>
						<option value="BSC"
							<%if (option.equals("BSC")) {%> <%="selected"%> <%}%>>BSC</option>
						<option value="ME"
							<%if (option.equals("ME")) {%> <%="selected"%> <%}%>>ME</option>
						<option value="MTech"
							<%if (option.equals("MTech")) {%> <%="selected"%> <%}%>>MTech</option>
						<option value="MCA"
							<%if (option.equals("MCA")) {%> <%="selected"%> <%}%>>MCA</option>
						<option value="MSC"
							<%if (option.equals("MSC")) {%> <%="selected"%> <%}%>>MSC</option>
						<option value="OTHERS" <%if (option.equals("OTHERS")) {%>
							<%="selected"%> <%}%>>OTHERS</option>
				</select></td>
			</tr>

			<tr>
				<td>Date of Birth</td>
				<td><input type="date" name="dateOfBirth"
					value="<%=applicantDTO.getDateOfBirth()%>" required></td>
			</tr>

			<tr>
				<td>Gender</td>
				<td><input type="gender" name="gender"
					value="<%=applicantDTO.getGender()%>" required></td>
			</tr>

			<tr>
				<td>Gender</td>
				<td><input type="radio" name="Male" value="M">male</td> 
				    <%if (option.equals("M")) {%> <%="checked"%> <%}%>>Male</td>
				<td><input type="radio" name="Female" value="F">female</td>
				     <%if (option.equals("F")) {%> <%="checked"%> <%}%>>Female</td>
				<td><input type="radio" name="Other" value="O">others</td>
				     <%if (option.equals("O")) {%> <%="checked"%> <%}%>>Other</td>
			</tr>

			<tr>
				<td><input type="submit" value="update"></td>
			</tr>
		</table>
		<%
		if (null != session.getAttribute("isUpdated")) {
			boolean isUpdated = (boolean) session.getAttribute("isUpdated");
			if (isUpdated) {
		%>
		<%="updated successfully"%>
		<%
		}
		}
		}
		%>
	</form>
</body>
</html>