<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>

<%
	Date today = new Date();
	SimpleDateFormat sf1 = new SimpleDateFormat("yyyy/MM/dd");
	SimpleDateFormat sf2 = new SimpleDateFormat("hh:mm:ss");
%>
<html>
<head>
<title>날짜 시간 출력</title>
</head>
<body>
	<h2>날짜/시간 출력</h2>

	<h3>
		현재 날짜 :
		<%=sf1.format(today)%>
	</h2>

	<h3>
		현재 시간 :
		<%=sf2.format(today)%>
	</h2>
</body>
</html>