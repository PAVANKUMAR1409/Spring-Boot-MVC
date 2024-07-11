<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeData</title>
</head>
<body>
	<c:choose>
		<c:when test="${!empty empsList}">
			<h1 style="color: blue;text-align: center">Employee Report</h1>
			<table border="1" align="center" bgcolor="cyan">
				<tr style="color:red"><th>EMPNO</th><th>EMPNAME</th><th>JOB</th><th>SALARY</th><th>DEPTNO</th><th>OPERATIONS</th></tr>
				<c:forEach var="emp" items="${empsList}">
					<tr style="color:blue">
						<td>${emp.empno}</td>
						<td>${emp.ename}</td>
						<td>${emp.job}</td>
						<td>${emp.sal}</td>
						<td>${emp.deptno}</td>
						<td>
							<a href="emp_edit?no=${emp.empno}"><img src="images/edit.png" width="30px" height="30px"/></a>&nbsp;&nbsp;&nbsp;
							<a href="emp_delete?no=${emp.empno}" 
										onclick="return confirm('Do you want delete the employee')"><img src="images/delete.png" width="30px" height="30px"/></a>
						</td>
					</tr>
				</c:forEach>
			
			</table>
		</c:when>
		<c:otherwise>
			<h1 style="color:red;text-align: center">Employee Data NOT FOUND</h1>
		</c:otherwise>
	</c:choose>
	<br/><br/><br/>
	
	<h3 style="color: green;text-align: center">${msg}</h3>
	
	
	<center><a href="register">AddEmployee<img src="images/add.jpg" width="60px" height="60px"/></a> </center>
	
</body>
</html>