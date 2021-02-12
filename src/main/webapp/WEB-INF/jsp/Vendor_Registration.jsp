<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vendor Registration</title>
<link href="/resources/css/RegistrationStyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
<div class="form">
<center>
	<form name='f1' action="/vendorregister" method='POST'>
  	<h1>Register</h1>
  
    <label for="vendorName"></label>
    <input type="text" placeholder="Enter name" name="vendorName" required>
	<br>
	<label for="emailId"></label>
    <input type="text" placeholder="Enter valid email Id" name="emailId" required>
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
  </form>
</body>
</html>