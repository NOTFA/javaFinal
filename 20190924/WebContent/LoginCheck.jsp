<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>

<%
	Date today = new Date();
	SimpleDateFormat sf1 = new SimpleDateFormat("yyyy/MM/dd");
	SimpleDateFormat sf2 = new SimpleDateFormat("hh:mm:ss");
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<%String id = request.getParameter("id");%>


<h2><%out.print("["+id+"]");%>님 접속을 환영합니다.</h2>

<h3>접속하신 날짜 및 시간은 <%=sf1.format(today)%> <%=sf2.format(today)%> 입니다.</h3>

</body>
</html>