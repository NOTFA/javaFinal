<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

 <% String pw = request.getParameter("pw");
	String pwcon = request.getParameter("pwcon");
 %>
<% if (pw.equals(pwcon)) {
	
	out.println("<h2>작성하신 내용은 아래와 같습니다.</h2>");
	
	String name = request.getParameter("name");
	out.println("이름 = "+name);
	out.println("<br/><hr>");
	String gender = request.getParameter("gender");
	out.println("성별 = "+gender);
	out.println("<br/><hr>");
	String id = request.getParameter("id");
	out.println("아이디 = "+id);
	out.println("<br/><hr>");
	
	String addr = request.getParameter("addr");
	out.println("주소 = "+addr);
	out.println("<br/><hr>");
	String phone = request.getParameter("phone");
	out.println("전화번호 = "+phone);
	out.println("<br/><hr>");
	String email = request.getParameter("email");
	out.println("이메일주소 = "+email);
	out.println("<br/><hr>");


out.println("취미 :"); 

	String[] inter= request.getParameterValues("interest");
	if ( inter != null ){

	out.println("<table border=\"1\">");
 
		for(String temp : inter){
			out.println("<tr>");
			out.println("<th width=\"100\">"+ temp+"</th>");
			out.println("</tr>");
		}

	out.println("</table>");
	
	}
	else{
		out.println("[선택한 취미가 없습니다.]");
	}
}
%>
<%
if (!pw.equals("pwcon")){
	out.print("<h2>비밀번호 틀림</h2>");
}
%>

</body>
</html>