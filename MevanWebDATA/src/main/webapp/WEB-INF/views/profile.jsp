<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcom user</h1>
	<h2>Name: ${muser.getNmae()} </h2>
	<h2>Email: ${muser.getEmail()} </h2>
	<h2>Phone: ${muser.getPhone()} </h2>
	

</body>
</html>