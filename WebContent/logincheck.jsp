<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
session = request.getSession(false);
if(session == null || session.getAttribute("userid") == null){
	//response.sendRedirect("login.jsp");
	out.println("<script>alert('로그인하고 쳐들와')");
	out.println("location.href='login.jsp'</script>");
	return;
}
%>