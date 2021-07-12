<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Cars</title>

<style type="text/css">
table{
border:2px solid red;
border-collapse:collapse;
margin-left:auto;
margin-right:auto;
}
tr,th,td{
border:2px solid red;
}
</style>
</head>
<body>

<table>
<tr> 
<th>Model</th>
<th>Year of Manufacture</th>
<th>Kilometers Travelled</th>
<th>Car Price</th>
<th>Car Status</th>
</tr>

<c:forEach items ="${list}"  var="eachItem">

<tr> 
<td><c:out value ="${eachItem.model}"></c:out></td>
<td><c:out value ="${eachItem.yom}"></c:out></td>
<td><c:out value ="${eachItem.kmsTravelled}"></c:out></td>
<td><c:out value ="${eachItem.price}"></c:out></td>
<td><c:out value ="${eachItem.status}"></c:out></td>

</tr>
</c:forEach>


<c:forEach items ="${list1}"  var="eachItem">

<tr> 
<td><c:out value ="${eachItem.model}"></c:out></td>
<td><c:out value ="${eachItem.yom}"></c:out></td>
<td><c:out value ="${eachItem.kmsTravelled}"></c:out></td>
<td><c:out value ="${eachItem.price}"></c:out></td>
<td><c:out value ="${eachItem.status}"></c:out></td>

</tr>
</c:forEach>



</table>
</body>
</html>