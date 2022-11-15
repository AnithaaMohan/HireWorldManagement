<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="createApplicant">
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
				<td>Date of Birth</td>
				<td><input type="date" name="dateOfBirth" required></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="Male" value="M">male</td> 
				<td><input type="radio" name="Female" value="F">female</td>
				<td><input type="radio" name="Other" value="O">others</td>
			</tr>
			
			<tr>
				<td>Qualification</td>
				<td><select name="qualification" required>
						<option value="BE">BE</option>
						<option value="BTech">BTech</option>
						<option value="BCA">BCA</option>
						<option value="BSC">BSC</option>
						<option value="ME">ME</option>
						<option value="MTech">MTech</option>
						<option value="MCA">MCA</option>
						<option value="MSC">MSC</option>
						<option value="OTHERS">OTHERS</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Insert"></td>
			</tr>
		</table>
	</form>
</body>
<% if(null != session.getAttribute("Applicant")) { %>
    <h1>Insert successfully</h1>
<% } %>
</html>