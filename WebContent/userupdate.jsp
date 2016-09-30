<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="logincheck.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	document.getElementById("btnUpdateOk").addEventListener("click", updateFunc, false);
	document.getElementById("btnListOk").addEventListener("click", ListFunc, false);
}

function updateFunc(){
	f.action = "updateform.do";
	f.submit();
}


function ListFunc(){
	f.command.value = "list";
	f.action = "userlist.do";
	f.submit();
}
</script>
</head>
<body>
수정<br>
<form name="f" method="post">
<input type="hidden" name="command" value="update">
<input type="hidden" name="userid" value="${user.userid }">
<table border="1" style="border: 1px solid red;">
	<tr><td>아디</td><td>${user.userid }</td></tr>
	
	<tr>
	<td>비번</td>
	<td><input type="text" name="password" value="${user.password }"></td>
	</tr>
	
	<tr>
	<td>이름</td>
	<td><input type="text" name="name" value="${user.name }"></td>
	</tr>
	
	<tr>
	<td>이멜</td>
	<td><input type="text" name="email" value="${user.email }"></td>
	</tr>
	
	<tr>
		<td colspan="2" style="text-align: center;">
			<input type="button" id="btnUpdateOk" value="수정확인">
			<input type="button" id="btnListOk" value="목록">
		</td>
	</tr>
</table>
</form>
</body>
</html>