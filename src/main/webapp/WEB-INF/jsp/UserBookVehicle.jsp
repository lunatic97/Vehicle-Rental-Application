<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
a:link, a:visited {
  background-color: #3a7bd5;
  color: white;
  padding: 1px 2px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: #00d2ff;
  transition: .5s;
}
</style>
<meta charset="ISO-8859-1">
<title>List of available vehicles</title>
<link href="<c:url value="/resources/css/TableStyle.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<center>
<h1>Available Vehicles</h1>
<h2><a href="/logoutUser" style="text-align:right">Log Out</a></h2>
  <div class="table-wrapper">
	<table class="fl-table">
	<thead>
		
		<th>Vehicle Name</th>
		<th>Vendor Name</th>
		<th>Vehicle Price</th>
		<th>Action</th>
	</thead>
		
		<c:forEach var="vehicle" items="${vehicles}" >
			<tr>
				
				<td>${vehicle.vehicleName}</td>
				<td>${vehicle.vendorName}</td>
				<td>${vehicle.vehiclePrice}</td>
				<td><a href="/bookingdetails/${vehicle.vehicleName}/${vehicle.vendorName}/${vehicle.vehiclePrice }">Book</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>