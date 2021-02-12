<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
label {
  text-shadow: 2px 2px 5px yellow;
}
</style>
<meta charset="ISO-8859-1">
<title>Vehicle Rental</title>
<link href="<c:url value="/resources/css/WelcomeStyle.css"/>" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lora:400,700|Montserrat:300" rel="stylesheet">
</head>
<body>
<nav>
	<label class="logo">Rental Vehicle</label>
	<u1>
		<li>
        <a  href="aboutus.jsp">About Us</a>
      </li>
      <li>
        <a  href="/contactusvendor">Contact Us</a>
      </li>
		<li>
        <a  href="/vendorregister">Sign Up</a>
      </li>
      <li >
        <a href="/vendorlogin">Sign In</a>
      </li>
      </u1>
</nav>
</body>
</html> 

