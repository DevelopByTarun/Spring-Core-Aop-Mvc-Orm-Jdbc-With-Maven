<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<link type="text/css" href="<c:url value='/static/css/style.css'/>" rel="stylesheet">
<title>Index.jsp</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<br/>
			<h1 class="idx">Student Task</h1>
<br/>
<ul class="list-group">  
<li class="list-group-item list-group-item-warning">
<h3>
<a href="welcome">
Add Student
</a>
</h3>
</li>

<li class="list-group-item list-group-item-dark">
<h3>
<a href="fetch">
Fetch Student
</a>
</h3>
</li>
</ul>
		</div>
	</div>
</div>
</body>
</html>