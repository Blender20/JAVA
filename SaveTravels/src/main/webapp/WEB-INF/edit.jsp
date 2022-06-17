<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body>

	<form:form class="grid" action="/edit/${expense.id}" method="POST" modelAttribute="expense">
	
			<form:errors class="col_red" path="name" ></form:errors>
		<form:input placeholder="Name" path="name"></form:input>
		
			<form:errors class="col_red" path="vendor" ></form:errors>
		<form:input placeholder="Vendor" path="vendor"></form:input>
		
			<form:errors class="col_red" path="price" ></form:errors>
		<form:input placeholder="Price" type="number" path="price"></form:input>
		
			<form:errors class="col_red" path="description" ></form:errors>
		<form:input placeholder="Description" path="description"></form:input>
		
		<input type="submit" value="Edit Expense!" />
	
	</form:form >
		<c:forEach var="expense" items="${expenses}">
			<p> ${expense.name}</p>
			<p> ${expense.vendor}</p>
			<p> ${expense.price}</p>
			<p> ${expense.description}</p>
		</c:forEach>
</html>