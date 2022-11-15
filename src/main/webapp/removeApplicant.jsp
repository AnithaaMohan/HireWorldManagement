<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="removeApplicantById" method="post">
		<table>
			<tr>
				<td>Enter the Id you want to Delete</td>
				<td><input type="number" name="applicantId"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Remove Applicant"></td>
			</tr>

			<%
			if (null != session.getAttribute("isDeleted")) {
				boolean isDeleted = (boolean) session.getAttribute("isDeleted");
				if (isDeleted) {
			%>
			
			<%="Deleted Successfully"%>
			
			<%
			}
			}
			%>
		</table>
	</form>
</body>
</html>