<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Leads</title>
</head>
<body bg color="pink">
<h2>List All Leads</h2>

<table border=2>
<tr>
<th> First name</th>
<th> Last name</th>
<th> Email</th>
<th> mobile</th>
<th> delete</th>
<th> update</th>

</tr>
<c:forEach var="leads" items="${leads}">
<tr>
<td>${leads.fname}</td>
<td>${leads.lname}</td>
<td>${leads.email}</td>
<td>${leads.mobile}</td>
<td><a href="deletelead?id=${leads.id}">delete</a></td>
<td><a href="updatepass?id=${leads.id}">update</a></td>

</tr>

</c:forEach>
</table>
</body>
</html>