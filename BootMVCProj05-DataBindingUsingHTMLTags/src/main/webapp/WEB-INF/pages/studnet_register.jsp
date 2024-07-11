<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:brown;text-align: center">STUDENT REGISTER FORM PAGE</h1>
	
	<form action="register" method="post">
		<table align="center" bgcolor="yellow">
			<tr>
				<td>Student Number</td>
				<td><input type="text" name="sno"/></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="sname"/></td>
			</tr>
			<tr>
				<td>Student Address</td>
				<td><input type="text" name="saddo"/></td>
			</tr>
			<tr>
				<td>Student Average</td>
				<td><input type="text" name="avg"/></td>
			</tr>
			<tr>
				<td colspan="2"> <input type="submit" value="Register"/></td>
			</tr>
		</table>
	</form>
</body>
</html>