<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome! Enter Your Information Below</h2>

<div>
<form action ="/isReg" method="post"> 
<p> <label>First Name:</label> <input type ="text" name ="First_Name"/></p>
<p> <label>Last Name:</label> <input type ="text" name = "Last_Name"/></p>
<p><label>Email</label> <input type="email" name ="Email"/></p>
<p><label>Phone Number</label> <input type="number" name ="Phone"/></p>
<p><label>Password</label> <input type="password" name = "Password"/></p>

	<p><button type="submit">Submit Info</button></p>
	</form>
</div>
<p></p>
	<div>
		<a href="/">Back to Front</a>
	</div>

</body>
</html>