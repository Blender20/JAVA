<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	<h1>Save travel</h1>
	
	<table>
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Description</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var ="expense" items="${expenses}">
			
			<tr>
				<td><a href="/show/${expense.id}">${expense.name}</a></td>
				<td>${expense.vendor}</td>
				<td>${expense.price}</td>
				<td>${expense.description}</td>
				<td>
					<a href="/edit/${expense.id}">Edit</a>
					<form class="flex grap2" action="/delete/${expense.id}" method="POST">
						<input type="submit" value="Delete" />
					</form>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<form:form class="grid" action="/" method="POST" modelAttribute="expense">
	
			<form:errors class="col_red" path="name" ></form:errors>
		<form:input placeholder="Name" path="name"></form:input>
		
			<form:errors class="col_red" path="vendor" ></form:errors>
		<form:input placeholder="Vendor" path="vendor"></form:input>
		
			<form:errors class="col_red" path="price" ></form:errors>
		<form:input placeholder="Price" type="number" path="price"></form:input>
		
			<form:errors class="col_red" path="description" ></form:errors>
		<form:input placeholder="Description" path="description"></form:input>
		
		<input type="submit" value="Create Expense!" />
	
	</form:form >
		<c:forEach var="expense" items="${expenses}">
			<p> ${expense.name}</p>
			<p> ${expense.vendor}</p>
			<p> ${expense.price}</p>
			<p> ${expense.description}</p>
		</c:forEach>
</body>
</html>
