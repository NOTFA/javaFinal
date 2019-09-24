<%@ page language="java" contentType="text/html; charset=utf-8"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>

	<%
		try {
			String nullString = null;
	%>
	<%=nullString.length()%>
	<%
		} catch (NullPointerException e) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("NullPointerErrorHandling.jsp");
			dispatcher.forward(request, response);
		}
	%>
</body>
</html>
