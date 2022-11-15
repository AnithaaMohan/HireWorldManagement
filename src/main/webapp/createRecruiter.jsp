<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="createRecruiter">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" pattern="[^\\s][a-zA-Z\\s]*"
					title=" Please Enter Alphanumeric and Space Only"
					required></td>
			</tr>
			<tr>
				<td>MobileNumber</td>
				<td><input type="text" name="mobileNumber" pattern="[6-9][0-9]{9}"
					title=" Please Enter Valid Number"
					required></td>
			</tr>
			<tr>
				<td>EmailAddress</td>
				<td><input type="text" name="emailAddress" pattern="[a-zA-Z0-9.]+@[a-z]+[.][a-z]{2,3}$"
					title=" Example : name@gmail.com"
					required></td>
			</tr>
			<tr>
				<td><input type="submit" value="Insert"></td>
			</tr>
		</table>
	</form>
</body>
<% if(null != session.getAttribute("Recruiter")) { %>
    <h1>Insert successfully</h1>
<% } %>
</html>