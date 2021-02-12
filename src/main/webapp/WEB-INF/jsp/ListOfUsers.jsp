<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
<link href="<c:url value="/resources/css/TableStyle.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<center>
<h1>Users</h1>
<h2><a href="/logoutAdmin" style="text-align:right">Log Out</a></h2>
	<div class="table-wrapper">
	<table class="fl-table">
	<thead>
		
		<th>User Name</th>
		<th>User Password</th>
	</thead>
		
		<c:forEach var="user" items="${users}" >
			<tr>
				<td>${user.userName}</td>
				<td>${user.passWord}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>