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
	document.getElementById("btnUpdate").addEventListener("click", updateFunc, false);
	document.getElementById("btnDelete").addEventListener("click", DeleteFunc, false);
	document.getElementById("btnList").addEventListener("click", ListFunc, false);
}

function updateFunc(){
	f.command.value = "updateform";
	f.action = "updateform.do";
	f.submit();
}
function DeleteFunc(){
	if(confirm("삭제할까?")){
	f.command.value = "delete";
	f.action = "delete.do";
	f.submit();
	}
}
function ListFunc(){
	f.command.value = "list";
	f.action = "userlist.do";
	f.submit();
}
</script>
</head>
<body>
상세보기<br>
<table border="1" style="border: 1px solid red;">
	<tr><td>아디</td><td>${user.userid }</td></tr>
	<tr><td>비번</td><td>${user.password }</td></tr>
	<tr><td>이름</td><td>${user.name }</td></tr>
	<tr><td>이멜</td><td>${user.email }</td></tr>
	<tr>
		<td colspan="2" style="text-align: center;">
			<input type="button" id="btnUpdate" value="수정">
			<input type="button" id="btnDelete" value="삭제">
			<input type="button" id="btnList" value="목록">
		</td>
	</tr>
</table>

<form name="f" method="post">
	<input type="hidden" name="command">
	<input type="hidden" name="userid" value="${user.userid }">
</form>
</body>
</html>