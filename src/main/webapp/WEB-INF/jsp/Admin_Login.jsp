<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link href="/resources/css/LoginStyle.css" rel="stylesheet" type="text/css">
</head>
<div class="container">
<div class="form">
<center>
	<form method="post" >
    <h1>Login</h1>
  	<font color="red">${errorMessage}</font>
  	<label for="adminName"></label>
    <input type="text" placeholder="Enter name" name="adminName" required>
	<br>
    <label for="passWord"></label>
    <input type="password" placeholder="Enter Password" name="passWord" required>
    <br>    
    <button class="submit" type="submit">Login</button>
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
</body>
</html>