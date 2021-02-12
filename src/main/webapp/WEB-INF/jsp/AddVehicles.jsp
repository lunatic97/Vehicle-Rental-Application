<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Vehicle</title>
<link href="<c:url value="/resources/css/UserFeedback.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
<div class="form">
<center>
	<a href="/logoutVendor">Log Out</a>
   <form name='f3' action="/addvehicledetails" method='POST'>
   <h1>Register Vehicle Details</h1>
      <label for="vehicleName"></label>
    <input type="text" placeholder="Enter Vehicle Name" name="vehicleName" required>
    <br>   
      <label for="vehicleStatus"></label>
    	<select name='vehicleStatus'> 
            <option>Available</option>
            <option>Unavailable</option>
     	</select>
    <div>
    <label for="vendorName"></label>
    <input type="text" placeholder="Enter Your Name" name="vendorName" required>
    <br>
    <label for="vehiclePrice"></label>
    <input type="text" placeholder="Enter Vehicle Price" name="vehiclePrice" required>
    <br>   
    <button class="submit" type="submit">Submit</button>
    <br>
    </div>
    </form>
    </div>
    
    <div class="sub-cont">
    <div class="img">
    <div class="img-text">
    <p>Register Your Vehicle</p>
    </div>
    
    </div>
  </div>
  </div>
</body>
</html>