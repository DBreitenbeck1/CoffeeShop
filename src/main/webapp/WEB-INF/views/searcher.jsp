<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Searcher</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/CoffeeStyle.css" />
</head>

<body>
	<H2>Search the Menu</H2>

	<div class="lab">
		<form action="/nameSearch">
			<label>Search by Name</label>
			<p>
				<input type="text" name="name" />
			</p>
			<button type="submit">Search</button>
		</form>
	</div>
	<p></p>
	<div class="lab">
		<form action="/typeSearch">
			<label>Search by Type (Drink or Pastry)</label>
			<p>
				<input type="text" name="type" />
			</p>
			<button type="submit">Search by Type</button>
		</form>
	</div>
<p></p>
	<div>
		<a href="/">Back to Front</a>
	</div>

</body>
</html>