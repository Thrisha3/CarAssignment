<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Cars</title>
</head>
<body>

<p> Car Added: </p><c:out value="${rowAdded}"/>

<form:form method="post" action="cars"> 

<form:label path="model">Model of Car </form:label>
<form:input path = "model"/>

<form:label path="yom">Year of Manufacture </form:label>
<form:input path = "yom"/>

<form:label path="kmsTravelled">Kilometers Traveled </form:label>
<form:input path = "kmsTravelled"/>

<form:label path="price">Price of Car </form:label>
<form:input path = "price"/>

<form:label path="status">Status </form:label>

<form:select path="status" items="${carStatus}"/>


<input type="submit" value="Add"/>
</form:form>

</body>
</html>