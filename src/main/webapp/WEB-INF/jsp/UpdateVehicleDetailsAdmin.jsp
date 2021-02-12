<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Vehicle Details</h1>
	<c:url var="action" value="/updateVehicle"></c:url>
   
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