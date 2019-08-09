<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:url value="/index.jsp"/><br>
${pageContext.request.contextPath }<br>
<%=((HttpServletRequest)pageContext.getRequest()).getContextPath()%><br>
<c:url value="/index.jsp">
    <c:param name="username" value="张三"></c:param>
    <c:param name="password" value="123"></c:param>
</c:url>
<hr>
<a href="<c:url value='/index.jsp'/>">点击这里</a>
<hr>
<c:if test="${empty param.name }">
    <h2>您没有给出name参数！</h2>
</c:if>
<hr>
<c:choose>
    <c:when test="${empty param.name }">
    您没有给出name参数！
    </c:when>
    <c:otherwise>name参数为 ${param.name}<br></c:otherwise>
</c:choose>
</body>
</html>