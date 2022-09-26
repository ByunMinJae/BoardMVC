<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>로그인</h1>
<hr>

<form action="/board/loginHome" method="post">

<label for="userid">아이디</label>
<input type="text" name="userid" id="userid"><br>

<label for="userpw">패스워드</label>
<input type="text" name="userpw" id="userpw"><br><br>

<button>로그인</button>

</form>

</body>
</html>