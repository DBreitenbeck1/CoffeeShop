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
	<h2>Results</h2>

	<div class="lab">
		<table class= "menu">
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
<p></p>
	<div>
		<a href="/">Back to Front</a>
	</div>
</body>
</html>