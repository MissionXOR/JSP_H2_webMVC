<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	
	<form:form action="save" modelAttribute="product" >
	
		<table>
		
		<tr>
			<td>NAME : <form:input path="name"/></td>
		</tr>
		<tr>
			<td>PRICE : <form:input path="price"/></td>
		</tr>
		<tr>
			<td>QUANTITY : <form:input path="qty"/></td>
		</tr>
		<tr>
			<td> <input type="submit" value="saveDATA"> </td>
		</tr>
		</table>
		
	</form:form>
	<a href="view"> view products </a>

</body>
</html>