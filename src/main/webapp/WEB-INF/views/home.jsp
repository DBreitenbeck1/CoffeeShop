<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coffee Shop</title>
</head>
<body>
	<h2>Welcome to the Java Hovel</h2>

<div>
	<a href="/register">Would you like to Register?</a>
</div>

<div>
	<p>Or You Can Peruse our Tasty Menu</p>

	<a href="/search">Looking for something specific?</a>
</div>
<p></p>
<div> 
	<table>
		<tr>
			<th>Item</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${ products }" var="product">
			<tr>
				<td>${ product.name}</td>
				<td>$<fmt:formatNumber value="${product.price }"
						pattern="0.00" /></td>
			</tr>

		</c:forEach>
	</table>
	</div>

</body>
</html>