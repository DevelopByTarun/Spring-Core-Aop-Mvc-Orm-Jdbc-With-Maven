<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.app.model.StudentDTO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<link type="text/css" href="<c:url value='/static/css/style.css'/>" rel="stylesheet">
<title>Update.jsp</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
			<h1 class="enter">Student Updation Form</h1>
<br/>
<form action="/MavenSpringMvcCrudWithJdbcTemplateLog4jAndMysqlThruAnnotation/updt" method="post">
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>Id&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="hidden" name="id" value="<%= ((StudentDTO)request.getAttribute("values")).getId() %>" class="form-control is-valid" id="inputEmail3" placeholder="Enter Name">
    </div>
  </div>
    
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>Name&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="name" value="<%= ((StudentDTO)request.getAttribute("values")).getName() %>" class="form-control is-valid" id="inputEmail3" placeholder="Enter Name">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label"><strong>Age&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="age" value="<%= ((StudentDTO)request.getAttribute("values")).getAge() %>" class="form-control is-valid" id="inputEmail3" placeholder="Enter City">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label"><strong>City&nbsp;::</strong></label>
    <div class="col-sm-10">
      <input type="text" name="city" value="<%= ((StudentDTO)request.getAttribute("values")).getCity() %>" class="form-control is-valid" id="inputPassword3" placeholder="Enter Salary">
    </div>
  </div>
  
  <div class="form-group row">
  	<label for="inputPassword3" class="col-sm-2 col-form-label"></label>
    <div class="col-sm-10">
      <button type="submit" class="btn btn-success">Update Student</button>
    </div>
  </div>
</form>
		</div>
	</div>
</div>
</body>
</html>