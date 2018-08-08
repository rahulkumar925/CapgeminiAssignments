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
<div align="center"><h2><b>Login Successfully</b></h2></div><br><br>
<h4>Hello <%=request.getAttribute("UserName") %></h4>
<div align="center">
<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>