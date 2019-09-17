<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
</style>
</head>
<body>
<div id="wrap">
<form action="join" method="post">
	이름   <input type="text" name="name" /><br/>
	성별   <select name="gen">
	<option value="남자">남자</option>
	<option value="여자">여자</option>
	</select><br/>
	아이디   <input type="text" name="id"/><br/> 
	비밀번호   <input type="password" name="password" /><br/> 
	비밀번호 확인   <input type="password" name="password_check" /><br/> 
	주소   <input type="text" name="addr" /><br/>
	전화번호   <input type="text" name="phone" /><br/>
	이메일 주소   <input type="text" name="mail" maxlength="30" /><br/>
	취미 
		축구<input type="checkbox" name="hobby" value="축구">
		 야구<input type="checkbox" name="hobby" value="야구">
		 농구<input type="checkbox" name="hobby" value="농구"><br/>
		 수영<input type="checkbox" name="hobby" value="수영">
		 게임<input type="checkbox" name="hobby" value="게임">
		 독서<input type="checkbox" name="hobby" value="독서"><br/>
		 음악<input type="checkbox" name="hobby" value="음악">
		 TV<input type="checkbox" name="hobby" value="TV">
		 영화<input type="checkbox" name="hobby" value="영화"><br/>
		 연극<input type="checkbox" name="hobby" value="연극">
		 뮤지컬<input type="checkbox" name="hobby" value="뮤지컬">
		 전시<input type="checkbox" name="hobby" value="전시"><hr/><br/> 
		 
		<input type="submit" value="회원가입" />
	</form>
	</div>
</body>
</html>