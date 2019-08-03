<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>查询</h1>
<a href="<c:url value='/BookServlet?method=findAll'/>">查询全部</a>
<a href="<c:url value='/BookServlet?method=findByCategory&category=1'/>">查询第1类</a>
<a href="<c:url value='/BookServlet?method=findByCategory&category=2'/>">查询第2类</a>
<a href="<c:url value='/BookServlet?method=findByCategory&category=3'/>">查询第3类</a>
</body>
</html>