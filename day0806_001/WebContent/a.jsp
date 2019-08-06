<%@ page language="java" import="java.net.*,java.awt.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="b.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>在page指令中添加了errorPage="b.jsp", 该页面出错（抛出异常）时，会转到b.jsp</h1>

<%
int a = 2/0;
//throw new ServletException("我抛出异常");
%>
</body>
</html>