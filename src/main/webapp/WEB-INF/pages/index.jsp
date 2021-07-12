<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
       pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cars Sales</title>
</head>
<body>
<h1>

<c:out value="${welcome}"></c:out></h1>

<a href="/cars"> Sell Car</a>

<a href="/cars/all"> View All Cars</a>

<a href="/cars/all/sale"> View Cars for Sale</a>

 <a href="/cars/model"> View Car by Model</a> 

</body>
</html>