<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.app.model.StudentDTO"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<link type="text/css" href="<c:url value='/static/css/style.css'/>" rel="stylesheet">
<title>StudentDetails.Jsp</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
			<h1 class="heading">Student Details</h1>
<br/>
<table class="table table-striped table-bordered">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th>Id</th>
      <th>Name</th>
      <th>Age</th>
      <th>State</th>
      <th>Country</th>
    </tr>
  </thead>
  <tbody>
 	<tr>
      <th scope="row">1</th>
      <td><%= ((StudentDTO)request.getAttribute("details")).getId() %></td>
      <td><%= ((StudentDTO)request.getAttribute("details")).getName() %></td>
      <td><%= ((StudentDTO)request.getAttribute("details")).getAge() %></td>
      <td><%= ((StudentDTO)request.getAttribute("details")).getState() %></td>
      <td><%= ((StudentDTO)request.getAttribute("details")).getCountry() %></td>
    </tr>						
  </tbody>
</table>
		</div>
	</div>
</div>
</body>
</html>