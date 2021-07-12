<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Cars By Model</title>
</head>
<body>

<table>
<tr> 
<th>Model</th>
<th>Year of Manufacture</th>
<th>Kilometers Travelled</th>
<th>Car Price</th>
<th>Status<th>

</tr>



<c:forEach items ="${list2}"  var="eachItem">

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