<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h2>New Entry</h2>

	<form action="/saveAdd">
		<label> Name</label> <input type="text" name="Name"> <label>
			Type </label> <input type="text" name="Type"> <label> Price </label>
		<input type="number" name="Price" step=".01">
		<button type="submit">Add</button>
	</form>

	<div>
		<a href="/">Back to the Homepage</a>
	</div>

</body>
</html>