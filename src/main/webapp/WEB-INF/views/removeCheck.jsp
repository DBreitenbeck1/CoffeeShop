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
<div class="lab">
<h2>Are You Sure You Want to Remove this Item?</h2>


<form action = "/delete" method ="post"> 
<input type="hidden" name="id" value="${product.id}" />
<label> ${product.name }</label>

<label> ${ product.type } </label>

<label> ${ product.price }</label>
<p>
<button type="submit">Yes, Delete</button> </p>

 </form>
 <form action ="/admin" method ="post">
 <button type="submit">No, Don't Delete</button>
 </form>
</div>
</body>
</html>