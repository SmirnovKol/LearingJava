<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>get cookie</h1>
    <%
    Cookie[] cookies = request.getCookies();
    if(cookies != null) {
    	for(Cookie c: cookies) {
    		out.println(c.getName() + "=" + c.getValue() + "<br>");
    	}
    }
    String path = request.getScheme() + "://" + request.getServerName()
    + ":" + request.getServerPort() + request.getContextPath();
    out.println(path);
    out.println("page=" + page +"<br>");
    out.println("pageContext=" + pageContext +"<br>");
    out.println("request=" + request +"<br>");
    out.println("response=" + response +"<br>");
    out.println("session=" + session +"<br>");
    out.println("application=" + application +"<br>");
    %>
</body>
</html>