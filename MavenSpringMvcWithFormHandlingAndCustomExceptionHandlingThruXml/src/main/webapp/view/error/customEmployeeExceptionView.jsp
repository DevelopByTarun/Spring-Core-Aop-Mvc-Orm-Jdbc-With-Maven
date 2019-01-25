<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>CustomEmployeeExceptionView.Jsp</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<br/><br/><br/>
			<h2>Exception occured at :: ${exception.date}</h2>
			<br/>
			<h2>Exception Message :: ${exception.message}</h2>
			<br/>
		</div>
	</div> 
</div>
</body>
</html>