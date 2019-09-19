<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%! %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>오칙연산 메소드 사용</title>
</head>
<body>
<h2>10, 3의 오칙 연산 결과</h2>
<%
int a = 10;
int b = 3;
%>
<%= a %>과 <%= b %>3의 덧셈 결과는 <%= "[" + (a+b) + "] 입니다." %><br/>
<%= a %>과 <%= b %> 뺄셈 결과는 <%= "[" + (a-b) + "] 입니다." %><br/>
<%= a %>과 <%= b %> 곱셈 결과는 <%= "[" + (a*b) + "] 입니다." %><br/>
<%= a %>과 <%= b %> 나눗셈 결과는 <%= "[" + (a/b) + "] 입니다." %><br/>
<%= a %>과 <%= b %> 나머지 연산 결과는 <%= "[" + (a%b) + "] 입니다." %><br/>

</body>
</html>