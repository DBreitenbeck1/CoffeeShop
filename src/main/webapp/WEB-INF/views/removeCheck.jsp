<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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

</body>
</html>