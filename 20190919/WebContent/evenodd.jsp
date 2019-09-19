<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홀수 짝수 여부 출력</title>
</head>
<body>
	<h2>1~10 까지 홀수 짝수 여부 출력</h2>
	<div>
		<table border="1">
		<tr>
			<%
				for (int i = 0; i < 11; i++) {
			%>
				<td><%= i %></td>
				<td>
					<% if (i % 2 == 0) %> 짝수입니다
					 
					<% if (i % 2 != 0) %> 홀수입니다
				</td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>