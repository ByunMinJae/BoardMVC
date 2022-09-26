<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>회원가입</h1>
<hr>

<form action="/board/join" method="post">

<label for="userid">아이디</label>
<input type="text" name="userid" id="userid"><br>

<label for="userpw">패스워드</label>
<input type="text" name="userpw" id="userpw"><br>

<label for="email">이메일</label>
<input type="text" name="email" id="email"><br><br>

<button>가입</button>

</form>

</body>
</html>