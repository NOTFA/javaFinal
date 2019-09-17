<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1. jsp 파일에서 구구단 처리</h2>

	<form action="ST04" method="get">
		구구단 번호 : <input type="text" name="dansu" /><br /> <input type="submit"
			value="구구단확인" />
	</form>
	
	<h2>2. 파라메타 여러개 보내는거</h2>
	<form action="ST04" method="post">

		이름 : <input type="text" name="name" /> 비밀번호 : <input type="password"
			name="password" /><br /> 성별 <br /> <input type="radio" name="gender"
			value="male" />남자 <input type="radio" name="gender" value="famale" />여자<br />
		<input type="submit" value="파라메타확인" />
	</form>
</body>
</html>