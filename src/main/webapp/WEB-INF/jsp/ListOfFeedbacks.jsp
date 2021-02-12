<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Feedbacks</title>
</head>
<link href="<c:url value="/resources/css/TableStyle.css"/>" rel="stylesheet" type="text/css">
<body>
<center>
<h1>Feedbacks</h1>
<h2><a href="/logoutAdmin" style="text-align:right">Log Out</a></h2>

	<div class="table-wrapper">
	<table class="fl-table">
	<thead>
		
		<th>User Name</th>
		<th>Vehicle Name</th>
		<th>Feedback</th>
		
	</thead>
		
		

		<c:forEach var="feedback" items="${feedbacks}" >
			<tr>
				
				<td>${feedback.userName}</td>
				<td>${feedback.vehicleName}</td>
				<td>${feedback.userFeedback}</td>
				
				

			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>