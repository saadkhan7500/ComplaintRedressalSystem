<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<br>
<div class="container">
	<form action="submitForm" method="post">
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> 
			<input
			    name="email"
				type="email" 
				class="form-control" 
				id="exampleInputEmail1"
				aria-describedby="emailHelp" 
				placeholder="Enter email">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Name</label> 
			<input
			    name="name"
				type="text" 
				class="form-control" 
				id="exampleInputPassword1"
				placeholder="Password">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> 
			<input
			    name="password"
				type="password" 
				class="form-control" 
				id="exampleInputPassword1"
				placeholder="Password">
		</div>
		<div class="container text-center">
		
		<button type="submit" class="btn btn-primary">Submit</button>
		</div>
		
	</form>
	</div>
</body>
</html>