<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg}</h1>
	
	<h1>Data.....</h1>
	<table border="1">
		<thead>
			<tr>
				<th>Book Name</th>
				<th>Book Id</th>
				<th>Book Price</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${msg.bookId}</td>
				<td>${msg.bookName}</td>
				<td>${msg.bookPrice}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>