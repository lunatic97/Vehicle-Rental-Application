<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Vendors</title>
<link href="<c:url value="/resources/css/TableStyle.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<center>
<h1>Vendors</h2>
<h2><a href="/logoutAdmin" style="text-align:right">Log Out</a></h2>
	<div class="table-wrapper">
	<table class="fl-table">
	<thead>
		
		<th>Vendor Name</th>
		<th>Vendor Email</th>
		<th>Vendor Password</th>
		<th>Delete Vendor</th>
		<th>Update</th>
	</thead>
		
		

		<c:forEach var="vendor" items="${vendors}" >
			<tr>
				
				<td>${vendor.vendorName}</td>
				<td>${vendor.emailId}</td>
				<td>${vendor.passWord}</td>
				<td><a href="deletevendor/${vendor.vendorName}">Delete</a></td>
				<td><a href="editvendor/${vendor.vendorName}">Update</a></td>
				
				

			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>