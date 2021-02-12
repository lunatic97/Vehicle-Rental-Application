<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
label {
  text-shadow: 2px 2px 5px yellow;
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/AdminMainPage.css"/>" rel="stylesheet" type="text/css">
<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>
<div class="wrapper">
    <div class="sidebar">
        <h2><i class="fas fa-align-justify"></i></h2>
        <ul>
            <li><a href="/showusers"><i class="fas fa-user-alt"></i>Customers</a></li>
            <li><a href="/showvendors"><i class="fas fa-user"></i>Vendors</a></li>
            <li><a href="/showallvehicles"><i class="fas fa-car"></i>Vehicles</a></li>
            <li><a href="/addvendor"><i class="fas fa-user-edit"></i>Add Vendors</a></li>
            <li><a href="/addvehicle"><i class="fas fa-car-alt"></i>Add Vehicles</a></li>
            <li><a href="/viewbookingdetails"><i class="fas fa-address-book"></i>Booking Details</a></li>
            <li><a href="/viewuserfeedback"><i class="fas fa-map-pin"></i>Feedbacks</a></li>
        </ul> 
        <div class="social_media">
          <a href="#"><i class="fab fa-facebook-f"></i></a>
          <a href="#"><i class="fab fa-twitter"></i></a>
          <a href="#"><i class="fab fa-instagram"></i></a>
      </div>
    </div>
</div>
</body>
</html>