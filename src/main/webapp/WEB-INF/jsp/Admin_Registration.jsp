<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Registration</title>
<link href="/resources/css/RegistrationStyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
<div class="form">
<center>
	<form name='f1' action="/adminregister" method='POST'>
  	<h1>Register</h1>
  
    <label for="adminName"></label>
    <input type="text" placeholder="Enter name" name="adminName" required>
	<br>
    <label for="passWord"></label>
    <input type="password" placeholder="Enter Password" name="passWord" required>
    <br>    
    <button class="submit" type="submit">Register</button>
    <br>
    </form>
  </div>
      <div class="sub-cont">
    <div class="img">
    <div class="img-text">
    <p></p>
    </div>
    </div>
    </div>
  </div>
  </form>
</body>
</html>