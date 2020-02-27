<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${title }</h2>

<form action = "/saveEdit" method ="post"> 
<input type="hidden" name="id" value="${product.id}" />
<label> Name</label>
<input type="text" name ="Name" value = ${ product.name }>
<label> Type </label>
<input type="text" name ="Type" value = ${ product.type }>
<label> Price </label>
<input type="number" name ="Price" value = ${ product.price } step =".01">
<button type="submit">Add</button>
 </form>
 
 
<div> 
<a href ="/admin">Cancel</a>
</div>

<div> 
<a href ="/">Back to the Homepage</a>
</div>

</body>
</html>