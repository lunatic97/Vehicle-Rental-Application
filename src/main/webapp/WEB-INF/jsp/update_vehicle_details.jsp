<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
input[type=text], input[type=password] {
  width: 50%;
  padding: 7px 9px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

/* unvisited link */
a:link {
  color: red;
}

/* visited link */
a:visited {
  color: green;
}

/* mouse over link */
a:hover {
  color: hotpink;
}

/* selected link */
a:active {
  color: blue;
}

h1 {
  text-shadow: 2px 2px 5px red;
}

h2 {
	font-style:oblique;
	font-family: sans-serif;
  text-shadow: 2px 2px 5px aqua;
}
</style>
<meta charset="ISO-8859-1">
<title>Update Vehicle Details</title>
</head>
<body>
<center>
<h1>Update Vehicle Details</h1>
<h2 style="text-align:right"><a href="/logoutVendor" style="text-align:right">Log Out</a></h2>
<br>
<br>
<br>
	<c:url var="action" value="/update"></c:url>
   
   <form:form action="${action}" method="post"  modelAttribute="vehicle" items="${vehicles}">
      <table>
      <form:hidden path="vehicleName"/>
         <tr>
            <td>Vehicle Availability:</td>
            <td>
            <select name='vehicleStatus'>
            <option>Available</option>
            <option>Unavailable</option>
            </select></td>
         </tr>
         <tr>
            <td>Vendor Name:</td>
            <td><input type='text' name='vendorName' value="${vehicle.vendorName}"></td>
         </tr>
         <tr>
            <td>Price:</td>
            <td><input type='text' name='vehiclePrice' value="${vehicle.vehiclePrice}"></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="Edit" /></td>
         </tr>
      </table>
      </form:form>
</body>
</html>