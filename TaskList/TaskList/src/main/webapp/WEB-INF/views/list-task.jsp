<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <div class="container">
		<div class="container">
		
		<h1>Task Lists</h1>
		<form action="task-list">
		<table border="1">
			<thead>
				<tr>
					<th>Team Member</th>
					<th>Due Date</th>
					<th>Description</th>
					<th>Complete Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${lists}" var="task">
					<tr>
						<td>${task.teamMember}</td>
						<td>${task.dueDate}</td>
						<td>${task.description}</td>
						<td><input type="checkbox">Completed</td>
						<td><a href="/delete-task?taskid=${task.id}" onclick="return confirm('Are you sure you want to delete?');">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
		</form>
	</div>
	
	<a class="btn btn-primary" href="go-create-tasks">Create a New Task</a>
	
	</div>
</body>
</html>