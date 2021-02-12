<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
/* unvisited link */
a:link {
  color: red;
}

/* visited link */
a:visited {
  color: green;
}

/* mouse over link */
a:hover {
  color: hotpink;
}

/* selected link */
a:active {
  color: blue;
}

h1 {
  text-shadow: 2px 2px 5px red;
}

h2 {
	font-style:oblique;
	font-family: sans-serif;
  text-shadow: 2px 2px 5px aqua;
}
</style>
<meta charset="ISO-8859-1">
<title>List of Vehicles</title>
<link href="<c:url value="/resources/css/TableStyle.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<center>
<h1>Vehicles</h1>
<h2 style="text-align:right"><a href="/logoutVendor" style="text-align:right">Log Out</a></h2>


	<div class="table-wrapper">
	<table class="fl-table">
	<thead>
		<th>Vehicle Name</th>
		<th>Vehicle Status</th>
		<th>Delete Vehicle</th>
		<th>Update</th>
	</thead>
		<c:forEach var="vehicle" items="${listVehicle}" >
			<tr>
				<td>${vehicle.vehicleName}</td>
				<td>${vehicle.vehicleStatus}</td>
				<td><a href="deletevehicle/${vehicle.vehicleName}">Delete</a></td>
				<td><a href="editvehicle/${vehicle.vehicleName}">Update</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>