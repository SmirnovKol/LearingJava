<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>我是 error page</h1>
<h1>在page指令中添加 isErrorPage="true"后，状态码才会变成500</h1>
<%=response.getContentType() %>
<%=request.getContentType() %>
<%
exception.printStackTrace(System.out);
exception.printStackTrace(response.getWriter());
%>
</body>
</html>