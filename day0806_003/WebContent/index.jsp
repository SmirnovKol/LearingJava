<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
pageContext.setAttribute("xxx", "pageContext_xxx");
request.setAttribute("xxx", "request_xxx");
session.setAttribute("xxx", "session_xxx");
application.setAttribute("xxx", "application_xxx");
%>
${xxx }
${pageScope.xxx }
${requestScope.xxx }
${sessionScope.xxx }
${applicationScope.xxx}<br>

</body>
</html>