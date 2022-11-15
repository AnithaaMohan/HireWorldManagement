<%@page import="com.ideas2it.model.RecruiterDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="getRecruiterForUpdate">
		Recruiter Id: <input type="text" name="recruiterId"> <input
			type="submit" value="submit">
	</form>
	<%
	RecruiterDTO recruiterDTO = (RecruiterDTO) session.getAttribute("RecruiterDTO");
	%>
	<form method="post" action="updateRecruiterById">
		<%
		if (null != recruiterDTO) {
		%>
		<table>
			<tr>
				<td>Id</td>
				<td><input name="recruiterId" value="<%=recruiterDTO.getId()%>" readonly>
			</tr>
			<tr>
				<td>Name</td>
				<td><input name="name" value="<%=recruiterDTO.getName()%>">
			</tr>
			<tr>
				<td>EmailAddress</td>
				<td><input name="emailAddress" value="<%=recruiterDTO.getEmailAddress()%>">
			</tr>
			<tr>

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