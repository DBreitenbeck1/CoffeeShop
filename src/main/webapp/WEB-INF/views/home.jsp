<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coffee Shop</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/CoffeeStyle.css" />
</head>
<body>
	
<%@ include file="partials/header.jsp" %>

	
	<div>
		

	
	</div>


	<div class="fav">
	<p>Your Favorite:</p>
		<table class="menu">
		<tr>
		<th>Name</th>
		<th>Price</th>
		</tr>
		<tr>
		<td>${favName }</td>
		<td><fmt:formatNumber value="${favPrice }"
							pattern="0.00" /></td></td>
		</tr>
		</table>
	
		<form action="/clear" method ="post"><button type="submit">Clear</button></form>
	</div>
	


	<div>
	<h5>Please Peruse our Tasty Menu</h5>
		<table class="menu">
			<tr>
				<th>Item</th>
				<th>Price</th>
				<th>Set Favorite</th>
			</tr>
			<c:forEach items="${ products }" var="product">
				<tr>
					<td>${ product.name}</td>
					<td>$<fmt:formatNumber value="${product.price }"
							pattern="0.00" /></td>
					<td><form action="/fav?id=${product.id }" method="post"><button type="submit">favorite</button> </form></td>
				</tr>
			

			</c:forEach>
		</table>
		<div>
			<h4>Looking For Something Specific?</h4>
			<form action="/search"><button type="submit">Search</button></form>
			
			</div>
	</div>
	
	<div >
	<h4>Like What you See? Register as a Regular Customer</h4>
	<form action="/register"><button type="submit">Sign Up Here</button></form>
		
	</div>
	

<%@ include file="partials/footer.jsp" %>
</body>
</html>