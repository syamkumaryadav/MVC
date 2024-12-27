<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.error{
		color:red;
	}
</style>
</head>
<body>

	<form:form action="mapping" modelAttribute="myForm" method="POST">
		<table>
			<tr>
				<td>Id :</td>
				<td>
					<form:input path="field1"/>
					<form:errors path="field1" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td>Age :</td>
				<td>
					<form:input path="field2"/>
					<form:errors path="field2" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td>Name :</td>
				<td>
					<form:input path="field3"/>
					<form:errors path="field3" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td>Money :</td>
				<td>
					<form:input path="field4"/>
					<form:errors path="field4" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td>Email :</td>
				<td>
					<form:input path="Email"/>
					<form:errors path="field4" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td ></td>
				<td ><button>submit</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>