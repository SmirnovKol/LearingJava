<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String username = (String)session.getAttribute("username");
if(username == null) {
    request.setAttribute("msg", "您还未登录！");
    request.getRequestDispatcher("/session/login.jsp").forward(request, response);
    //return;
}
%>
<%
String password = (String)session.getAttribute("password");
%>
<h1>这里是success 2</h1>
<h1>欢迎您，<%=username %>, 密码:<%=password %></h1>
<a href="/day0805_001/session/success1.jsp">success 1</a>
</body>
</html>