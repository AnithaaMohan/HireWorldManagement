<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="removeRecruiterById" method="post">
		<table>
			<tr>
				<td>Enter the Recruiter id you want to delete</td>
				<td><input type="number" name="recruiterId"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Remove Recruiter"></td>
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