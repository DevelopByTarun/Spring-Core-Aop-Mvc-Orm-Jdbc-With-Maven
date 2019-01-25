<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<link type="text/css" href="<c:url value='/static/css/style.css'/>" rel="stylesheet">
<title>Fetch.jsp</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
			<h1 class="show">Students Records</h1>
<br/>
<table class="table table-striped table-bordered">
  <thead class="thead-dark">
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Age</th>
      <th>City</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
  </thead>
  <tbody> 
  <c:forEach var="student" items="${studList}">			
	   <tr>
       <td>${student.id}</td>
       <td>${student.name}</td>
       <td>${student.age}</td>
       <td>${student.city}</td>
       <td>
       <button type="button" class="btn btn-warning btnOne">
       	<a href="edit/${student.id}">Edit</a>
       </button>
       </td>
       <td>
       <button type="button" class="btn btn-danger btnTwo">
       	<a href="delete/${student.id}">Delete</a>
       </button>
       </td>
    </tr>						
</c:forEach>
  </tbody>
</table>
<br/><br/>
<h2 class="alert alert-info" role="alert">
Add More Student <a href="welcome">Click Here</a>
</h2>
		</div>
	</div>
</div>
</body>
</html>