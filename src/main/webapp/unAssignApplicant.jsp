<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="assignApplicant" method="post">
		<table>
			<tr>
				<td>Enter the Id you want to Assign</td>
				<td><input type="number" name="applicantId"></td>
			</tr>

            <tr>
				<td>Enter the RecruiterId you want to Assign</td>
				<td><input type="number" name="recruiterId"></td>
			</tr>
			<tr>
				<td><input type="submit" value="unAssign"></td>
			</tr>