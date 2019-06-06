<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Tasks</title>
</head>
<body>

	<div class="container">
		<div class="form-group">
		<h1>Create a New Task</h1>
			<form action="create">
				<div class="form-group">
					<label for="teamM">Team Member:</label> <input type="text"
						class="form-control" name="teamMemberid">
				</div>
				<div class="form-group">
					<label for="date">Due Date:</label> <input type="date"
						class="form-control" name="dueDate">
				</div>
				<div class="form-group">
					<label for="descrp">Description:</label> <input type="text"
						class="form-control" name="description">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>	
	</div>
	
	
</body>
</html>