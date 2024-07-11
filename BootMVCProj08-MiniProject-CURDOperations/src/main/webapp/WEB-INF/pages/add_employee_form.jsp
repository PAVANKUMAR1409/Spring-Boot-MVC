<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
	<h1 style="color: green;text-align: center">Employee Registration Page</h1>
	<frm:form modelAttribute="emp">
		<table align="center" bgcolor="#ADD8E6">
			<tr>
				<td>emp name::</td>
				<td><frm:input path="ename"/></td>
			</tr>
			<tr>
				<td>emp job::</td>
				<td><frm:input path="job"/></td>
			</tr>
			<tr>
				<td>emp salary::</td>
				<td><frm:input path="sal"/></td>
			</tr>
			<tr>
				<td>emp deptno::</td>
				<td><frm:input path="deptno"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="SUBMIT"/></td>
				<td><input type="Reset" value="RESET"/></td>
			</tr>
		</table>
	
	
	</frm:form>
</body>
</html>