<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Give Feedback</title>
<link href="<c:url value="/resources/css/UserFeedback.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
<div class="form">
<center>
   <form name='f3' action="/postfeedback" method='POST'>
   <h1>Feedback</h1>
   	<label for="vehicleName"></label>
    <select name='vehicleName'> 
            <c:forEach var="vehicle" items="${listVehicle}">
            	<option>${vehicle.vehicleName}</option>
           	</c:forEach>
     </select>
            
    <div>
    <label for="userFeedback"></label>
    <input type="text" placeholder="Give Feedback" name="userFeedback" required>
    <br>   
    <button class="submit" type="submit">Submit</button>
    <br>
    </div>
    </form>
    </div>
  
  <div class="sub-cont">
    <div class="img">
    <div class="img-text">
    <p>Help Us Improve</p>
    </div>
    </div>
    </div>
  </div>
</body>
</html>