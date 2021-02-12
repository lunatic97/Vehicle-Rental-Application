<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link href="/resources/css/LoginStyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
<div class="form">
<center>
    <form method="post" >
    <h1>Sign In</h1>
  	<font color="red">${errorMessage}</font>
    <label for="UserName"></label>
    <input type="text" placeholder="Enter Username" name="UserName" required>
	<br>
    <label for="PassWord"></label>
    <input type="password" placeholder="Enter Password" name="PassWord" required>
    <br>
    <button class="submit" type="submit">Login</button>
    <br>
    </form>
    </div>
    
    <div class="sub-cont">
    <div class="img">
    <div class="img-text">
    <p>Explore With Us</p>
    </div>
    </div>
    </div>
  </div>
</body>
</html>