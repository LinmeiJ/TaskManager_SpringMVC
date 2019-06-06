<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Task Manager</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"> 

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form action="/">
			<h1> User Login</h1>
		</form>
		
		<form action="log-in">
			 <div class="form-group">
				 <label for="name">User Name:</label>
	     		 <input type="text" class="form-control" id="name" placeholder="User name" name="name">
	   		</div>
	    	<div class="form-group">
	      		<label for="pwd">Password:</label>
	      		<input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
	    	</div>
	    	<div class="checkbox">
	      		<label><input type="checkbox" name="remember"> Remember me</label>
	    	</div> 
	    	<input class="btn btn-primary" type="submit" value="Log In">
		</form>
		
		
	</div>
</body>
</html>