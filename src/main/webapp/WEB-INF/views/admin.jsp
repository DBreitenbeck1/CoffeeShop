<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/CoffeeStyle.css" />
</head>
<body>
	<h2>Administrative Page</h2>


	<div>
		<table class = "menu">
			<tr>
				<th>Item</th>
				<th>Price</th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${ products }" var="product">
				<tr>
					<td>${ product.name}</td>
					<td>$<fmt:formatNumber value="${product.price }"
							pattern="0.00" /></td>
					<td><a href="/edit?id=${product.id }">Edit</a></td>
					<td><a href="/remove?id=${product.id }">Delete</a></td>
				</tr>

			</c:forEach>

			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td><a href="/add">Add</a></td>
			</tr>
		</table>

	</div>
	<div></div>
<div> 
<a href ="/">Back to the Homepage</a>
</div>

</body>
</html>