<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>Book List</title>
		<style type ="text/css">
			body{font-family: verdana;
				 font-size: 12px;
				 margin: 40px;
			}
			.bookTable, .bookTable td{
				border-collapse: collapse;
				border: 1px solid #aaa;
				margin: 2px;
				padding: 2px 2px 2px 10px;
				font-size: 12px;
			}
			.bookTable th {
				font-weight: bold;
				font-size: 12px;
				background-color: #5C82FF;
				color: white;
				}
				.bookLabel {
				font-family: verdana;
				font-size: 12px;
				font-weight: bold;
			}
		</style>
		<script type="text/javascript">
			function deleteBook(bookId){
				if(confirm("Do you want to delete this book ??")){
					var url = 'delete/'+bookId;
					window.location.href = url;
				}
			}
		</script>
	</head>
	
	<body>
		<h3>List of Books in Library</h3>
		<c:if test="${!empty bookList}">
			<table class="bookTable">
				<tr>
					<th width="200">Book Id</th>
					<th width="200">Book Name</th>
					<th width="150">Author</th>
					<th width="70">Price</th>
					<th width="90">Quantity</th>
					<th width="120">Action</th>
				</tr>
				<c:forEach items="${bookList}" var="book">
					<tr>
						<td> ${book.id} </td>
						<td> <a href="/LibraryManagementSystem/edit/${book.id}">${book.name}</a> </td>
						<td> ${book.author} </td>
						<td> ${book.price} </td>
						<td> ${book.quantity} </td>
						<td>
							 <input type="button" onclick="location.href='/LibraryManagementSystem/edit/${book.id}';" 
							 		value="Edit" />
							 <input type="button" onclick="javascript:deleteBook(${book.id})" 
							 		value="Delete" />
						</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<br>
		<br>
		<a href="addBook.html">Click to Add another Book</a>
	</body>
</html>