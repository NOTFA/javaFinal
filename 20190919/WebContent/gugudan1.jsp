<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
<title>구구단 출력</title>
</head>
<body>
<div>
	<h2>구구단 출력</h2>
	<table border=1>
			<%
				for (int j = 2; j < 10; j++) {
			%>
			<td><%=j + "단"%></td>
			<%
				}
			%>
		<tr>
			<%
				for (int i = 1; i < 10; i++) {

				for (int j = 2; j < 10; j++) {
			%>
			<td><%=j + " X " + i + " = " + (j * i)%> 
	<%
		}
	%>
		</tr>
		<%
			}
		%>
	</table>
</div>
</body>
</html>