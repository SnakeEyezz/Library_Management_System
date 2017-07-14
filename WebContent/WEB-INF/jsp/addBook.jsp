<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h1> Book Details for Library Management</h1>
	<br>
	<br>
	<h3>Please Enter Book Details</h3>
	<br>
	<form:errors path="book.*" />
	
	<form action = "/LibraryManagementSystem/addBookDetails.html"  method = "post">
		<table>
			<!-- <tr>
				<td>Id : </td> <td>   <input type="text" name="id"/> </td>
			</tr> -->
			<tr>
				<td>Name : </td> <td>   <input type="text" name="name"/> </td>
			</tr>
			<tr>
				<td>Author : </td><td> <input type="text" name="author"/></td>
			</tr>
			<tr>
				<td>Price : </td><td> <input type="text" name="price"/></td>
			</tr>
			<tr>
				<td>Quantity : </td><td> <input type="text" name="quantity"/></td>
			</tr>
		</table>
		
		<input type="submit" value="Click to Add Book"/>
	</form>
</body>
</html>