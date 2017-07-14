<html>
	<head>
		<title>Edit Book</title>
	</head>
	
	<body>
		<h3>Edit Book Details:</h3>
		<form action = "/LibraryManagementSystem/editBookDetails.html"  method = "post">
		<table>
			<tr>
				<td>Id : </td> <td>   <input type="text" name="id" value="${book.id}"/> </td>
			</tr>
			<tr>
				<td>Name : </td> <td>   <input type="text" name="name" value="${book.name}"/> </td>
			</tr>
			<tr>
				<td>Author : </td><td> <input type="text" name="author" value="${book.author}"/></td>
			</tr>
			<tr>
				<td>Price : </td><td> <input type="text" name="price" value="${book.price}"/></td>
			</tr>
			<tr>
				<td>Quantity : </td><td> <input type="text" name="quantity" value="${book.quantity}"/></td>
			</tr>
		</table>
		
		<input type="submit" value="Click to Commit Changes"/>
	</form>
	</body>
</html>