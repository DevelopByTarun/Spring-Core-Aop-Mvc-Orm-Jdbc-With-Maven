<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.app.model.StudentLoginDTO"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<link type="text/css" href="<c:url value='/static/css/style.css'/>" rel="stylesheet">
<title>Welcome.Jsp</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
			<h1 class="show">Student Login Record</h1>
<br/>
<table class="table table-striped table-bordered">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th>Username</th>
      <th>Password</th>
    </tr>
  </thead>
  <tbody>
 	<tr>
      <th scope="row">1</th>
      <td><%= ((StudentLoginDTO)request.getAttribute("values")).getUsername() %></td>
      <td><%= ((StudentLoginDTO)request.getAttribute("values")).getPassword() %></td>
    </tr>					
  </tbody>
</table>
<br/><br/>
<h2 class="repeat">
Add Student Detail
</h2>
<br/>
<form action="addStudent" method="post">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>Id&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="id" class="form-control" id="inputEmail3" placeholder="Enter Student Id">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong>Name&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="name" class="form-control" id="inputPassword3" placeholder="Enter Student Name">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong>Age&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="age" class="form-control" id="inputPassword3" placeholder="Enter Student Age">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong>State&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="state" class="form-control" id="inputPassword3" placeholder="Enter Student State">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong>Country&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="country" class="form-control" id="inputPassword3" placeholder="Enter Student Country">
    </div>
  </div>
  <div class="form-group row">
  	<label for="inputPassword3" class="col-sm-2 col-form-label"></label>
    <div class="col-sm-10">
      <button type="submit" class="btn btn-warning">Add Student Details</button>
    </div>
  </div>
</form>
		</div>
	</div>
</div>
</body>
</html>