<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="menu.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list all</title>
</head>
<body>
<h2>All leads</h2>
<table>
<tr>
<th>firstname</th>
<th>lastname</th>
<th>email</th>
<th>mobile</th>
<th>delete</th>
<th>update</th>
</tr>  
<c:forEach var="lead" items="${leads}">
<tr>
<td>${lead.firstname}</td>
<td>${lead.lastname}</td>
<td>${lead.email}</td>
<td>${lead.mobile}</td>
<td ><a href="deleteLead?id=${lead.id}">delete</a></td>
<td ><a href="updateLead?id=${lead.id}">update</a></td>
</tr>
</c:forEach>
</table>
<body>
</html>