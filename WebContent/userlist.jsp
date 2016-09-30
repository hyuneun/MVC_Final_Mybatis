<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="logincheck.jsp" %>
사용자 목록보기<br>
<a href="userinsert.jsp">고객추가</a>
<table border="1">
	<tr><th>아디</th><th>이름</th><th>이멜</th></tr>
	<c:forEach var="c" items="${list }">
	<tr>
		<td>${c.userid }</td>
		<td><a href="userview.do?userid=${c.userid }&command=view">${c.name }</a></td>
		<td>${c.email }</td>
	</tr>
	</c:forEach>
</table>
<a href="out.do?command=out">로그아웃</a>
</body>
</html>