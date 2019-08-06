<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Cookie cookie = new Cookie("a20190807001", "hello08087");
cookie.setMaxAge(60*60);
response.addCookie(cookie);
Cookie[] cookies = request.getCookies();
for(Cookie c: cookies) {
	out.print("<h1>" + c.getName() + "=" + c.getValue() + "</h1><br>");
}
%>
<%--EL:  cookie 是 Map<String, Cookie>类型 --%>
${cookie.JSESSIONID}<br>
${cookie.a20190807001}<br>
${cookie.JSESSIONID.name }= ${cookie.JSESSIONID.value }<br>
${cookie.a20190807001.name }= ${cookie.a20190807001.value }<br>
</body>
</html>