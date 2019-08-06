<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=((HttpServletRequest)pageContext.getRequest()).getContextPath()%>
<h1>${pageContext.request.contextPath}</h1><br>
<hr>
<%=pageContext.getRequest().getProtocol() %>
<h1>${pageContext.request.protocol }</h1>
<hr>
<%=session.getId() %>
<h1>${pageContext.session.id}</h1>
<hr>
<a href="${pageContext.request.contextPath }/cookie/a.jsp">点击这里</a>
<form action="${pageContext.request.contextPath}/el/a.jsp" method="get">
    用户名：<input type="text" name="user1" value="张三">
    密码：  <input type="password" name="pass1" value="123">
    <input type="submit" value="登录">
</form>
</body>
</html>