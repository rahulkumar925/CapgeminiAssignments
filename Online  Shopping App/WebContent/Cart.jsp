<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center"><jsp:include page="header.jsp"></jsp:include></div>
<h3><b>Books added in the Cart</b></h3>
<div align="right"><a href="cart.app">Cart: ${sessionScope.count.size()}</a></div>
<table border="1" align="center">
<tr>
<th>Product ID</th>
<th>Product Name</th>
<th>Product Description</th>
<th>Cost</th>
</tr>
<jstl:forEach var="book" items="${requestScope.book}">
<tr>
<td>${book.productId}</td>
<td>${book.productName}</td>
<td>${book.productDescription}</td>
<td>${book.cost}</td>
<td><a href="delete.app?productId=${book.productId}">Remove Book</a></td>
</tr>
</jstl:forEach>
</table>
<div align="right">Total: ${sessionScope.sum}</div>
<div align="center"><jsp:include page="footer.jsp"></jsp:include></div>
</body>
</html>