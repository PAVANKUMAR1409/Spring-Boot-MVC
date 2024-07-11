<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:brown;text-align: center">STUDENT REGISTER FORM PAGE</h1>
	
	<form:form action="register"  modelAttribute="stud">
		<table align="center" bgcolor="yellow">
			<tr>
				<td>Student Number</td>
				<td><form:input path="sno"/></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><form:input type="text" path="sname"/></td>
			</tr>
			<tr>
				<td>Student Address</td>
				<td><form:input type="text" path="sadd"/></td>
			</tr>
			<tr>
				<td>Student Average</td>
				<td><form:input type="text" path="avg"/></td>
			</tr>
			<tr>
				<td colspan="3"> <input type="submit" value="Register"/></td>
				<td colspan="3"> <input type="reset" value="RESET"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>