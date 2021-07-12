<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model cars</title>
</head>
<body>
 <form:form method="POST" action="allmodels">  
<form:label path="model">Model of Car </form:label>
<form:select path="model" items="${models}"/>

<input type="submit" value="Submit"/>


</form:form>



            



</body>
</html>