<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 	<b>Model Attribute Data :: ${name},${age}</b> --%>

	<%-- 
		<h1>Model Attribute Data are :: </h1>
		<b>favColors :: <%=Arrays.toString(((String[])request.getAttribute("favColors"))) %></b><br/>
		<b>Nick Names :: ${nickNames}</b><br/>
		<b>Phone Numbers :: ${phoneNo}</b><br/>
		<b>ID Details :: ${idDetails}</b> 
	--%>

<h1>Model Attribute Data are :: </h1>
<%-- 
	<b>Fav Colrs are ::</b><br/>  
	<c:forEach var="color" items="${favColors}"> Enhanced For Loop
		${color}
	</c:forEach>
	<br/>
	<b>Nick Names are ::</b><br/>
	<c:forEach var="name" items="${nickNames}">
		${name}
	</c:forEach>
	<br/>
	<b>Phone Numbers are ::</b><br/>
	<c:forEach var="phone" items="${phoneNo}">
		${phone}
	</c:forEach>
	<br/>
	<b>Deatisl are ::</b><br/>
	<c:forEach var="id" items="${idDetails}">
		${id}
	</c:forEach> 
--%>
	
<%-- 
	<c:if test="${!empty emp }">
		<b>Employee Information :: ${emp.eno},${emp.ename},${emp.salary},${emp.vaccinated}</b>  <!-- Employee Information :: 101,Pavan,50000.0,true -->
		<br/><br/>
		<b>Employee Information :: ${emp}</b> <!-- Employee(eno=101, ename=Pavan, salary=50000.0, isVaccinated=true) -->
	</c:if> 
--%>
	<c:choose>
		<c:when test="${!empty empList}">
			<table border="1" bgcolor="cyan" align="center">
				<tr><th>eno</th><th>ename</th><th>salary</th><th>isVaccinated</th></tr>
				
				<c:forEach var="emp" items="${empList}">
					<tr>
						<td>${emp.eno}</td>
						<td>${emp.ename}</td>
						<td>${emp.salary}</td>
						<td>${emp.vaccinated}</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<h1 style="color:red;text-align: center">Employee Not Found</h1>
		
		</c:otherwise>
	
	
	</c:choose>

</body>
</html>