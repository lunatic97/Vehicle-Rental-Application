<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserMainPage</title>
<link href="<c:url value="/resources/css/UserMainPage.css"/>" rel="stylesheet" type="text/css">
<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body>
<div class="wrapper">
    <div class="sidebar">
        <h2><i class="fas fa-align-justify"></i></h2>
        <ul>
            <li><a href="/feedback"><i class="fas fa-map-pin"></i>Feedback</a></li>
            <li><a href="/bookvehicle"><i class="fas fa-car"></i>Vehicles</a></li>
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