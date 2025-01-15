<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<thead>
		<tr>
		
		<th>ID</th>
		<th>Name</th>
		<th>Price</th>
		<th>Quantity</th>
		</tr>
		
		</thead>
	
	 	<tbody>
	 	
	 	<tr>
	 		<c:forEach items="${products}" var="p">
	 			<td>${p.pid}</td>
	 			<td>${p.name}</td>
	 			<td>${p.price}</td>
	 			<td>${p.qty}</td>
	 		</c:forEach>
	 	</tr>
	 	
	 	</tbody>
	</table>
</body>
</html>