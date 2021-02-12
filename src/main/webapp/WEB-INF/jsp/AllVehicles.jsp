<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Vehicles</title>
<link href="<c:url value="/resources/css/TableStyle.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<center>
<h1>Vehicles</h1>
<h2><a href="/logoutAdmin" style="text-align:right">Log Out</a></h2>

	<div class="table-wrapper">
	<table class="fl-table">
	<thead>
		
		<th>Vehicle Name</th>
		<th>Vehicle Status</th>
		<th>Vehicle Price</th>
		<th>Vendor Name</th>
		<th>Delete Vehicle</th>
		<th>Update</th>
	</thead>
		
		

		<c:forEach var="Vehicle" items="${vehicles}" >
			<tr>
				
				<td>${Vehicle.vehicleName}</td>
				<td>${Vehicle.vehicleStatus}</td>
				<td>${Vehicle.vehiclePrice}</td>
				<td>${Vehicle.vendorName}</td>
				<td><a href="deletevehicles/${Vehicle.vehicleName}">Delete</a></td>
				<td><a href="editvehicles/${Vehicle.vehicleName}">Update</a></td>
				
				

			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>