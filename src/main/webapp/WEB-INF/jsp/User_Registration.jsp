<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<link href="/resources/css/RegistrationStyle.css" rel="stylesheet" type="text/css">  
</head>
<body>
<div class="container">
<div class="form">
<center>
   <form name='f' action="/userregister" method='POST'>
   <h1>Register</h1>
    <label for="UserName"></label>
    <input type="text" placeholder="Enter Username" name="UserName" required>
	<br>
    <label for="PassWord"></label>
    <input type="password" placeholder="Enter Password" name="PassWord" required>
    <br>   
    <button class="submit" type="submit">Register</button>
    <br>
    </form>
    </div>
  
  <div class="sub-cont">
    <div class="img">
    <div class="img-text">
    <p>Register With Us</p>
    </div>
    </div>
    </div>
  </div>
</body>
</html>