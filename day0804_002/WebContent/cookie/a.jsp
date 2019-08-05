<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Set-Cookie: aaa=AAA </h1>
<h1>Set-Cookie: bbb=BBB</h1>
<h1>Set-Cookie: ccc=CCC</h1>
<%
Cookie cookie = new Cookie("aaa", "AAA");
// maxAge= 1 hour
cookie.setMaxAge(60*60);
response.addCookie(cookie);

Cookie cookie2 = new Cookie("bbb", "BBB");
// deleted when the browser is closed
cookie2.setMaxAge(-23);
response.addCookie(cookie2);

Cookie cookie3 = new Cookie("ccc", "CCC");
// deleted immediately
cookie3.setMaxAge(0);
response.addCookie(cookie3);
%>
</body>
</html>