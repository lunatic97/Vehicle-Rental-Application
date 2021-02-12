<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Vendor Details</title>
</head>
<body>
<h1>Update Vendor Details</h1>
	<c:url var="action" value="/updateVendor"></c:url>
   
   <form:form action="${action}" method="post"  modelAttribute="vendor" items="${vendors}">
      <table>
      <form:hidden path="vendorName"/>
     
         <tr>
            <td>Email Id:</td>
            <td><input type='text' name='emailId' value="${vendor.emailId}"></td>
         </tr>
         <tr>
            <td>Password:</td>
            <td><input type='password' name='passWord' value="${vendor.passWord}"></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="Edit" /></td>
         </tr>
      </table>
      </form:form>
</body>
</html>