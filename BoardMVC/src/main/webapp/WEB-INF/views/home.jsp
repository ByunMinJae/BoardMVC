<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@	include file="/WEB-INF/views/header.jsp" %>

<style>
table {
	border: 1px solid red;
	border-collapse: collapse;
	text-align: center;
	width: 90%;
    margin: 0 auto;
}

thead {
	border: 1px solid red;
}

#loginBtn {
	float: right;
}
</style>

<a href="/board/login">
	<button id="loginBtn">로그인</button>
</a>

<table>
<thead>
	<tr>
		<th>게시글 번호</th>
		<th>아이디</th>
		<th>게시글 제목</th>
		<th>작성일자</th>
		<th>수정 여부</th>
	</tr>
</thead>
<tbody>
<%-- 	<%=for(int i=0; i<) %> --%>
	<tr>
		<td>1</td>
		<td>2</td>
		<td>3</td>
		<td>4</td>
		<td>5</td>
	</tr>
</tbody>
</table>

<%@	include file="/WEB-INF/views/footer.jsp" %>