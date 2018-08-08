<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<jsp:include page="header.jsp"></jsp:include>
</div>
<div align="center"><h2>Login Here</h2></div>
<form action="LoginController" method="post">
<p>User Name:  <input type="text" name="userName" /><br/><br></p>
<p>Password:   <input type="password" name="password"/><br/><br></p>
<input type="submit" value="Login"/>
</form>
<div align="center">
<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>