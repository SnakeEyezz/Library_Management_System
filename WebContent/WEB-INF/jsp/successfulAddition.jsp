<html>
	<body>
		<h1>${headerMessage}</h1>
		<br>
		<h2> Congratulations!!! The book has been successfully added to the list.</h2>
		<br>
		<h3>Details Submitted by you:</h3>
		<br>
		<table>
			<%-- <tr>
				<td>Book Id: </td>
				<td>${book.id}</td>
			</tr> --%>
			<tr>
				<td>Book Name: </td>
				<td>${book.name}</td>
			</tr>
			<tr>
				<td>Book Author: </td>
				<td>${book.author}</td>
			</tr>
			<tr>
				<td>Book Price: </td>
				<td>${book.price}</td>
			</tr>
			<tr>
				<td>Book Quantity: </td>
				<td>${book.quantity}</td>
			</tr>
		</table>
		<br>
		<br>
		<a href="addBook.html">Click to Add another Book</a>
		<br>
		<a href="bookList.html">Click to See the Books in Library</a>
	</body>
</html>