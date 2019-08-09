<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="i" begin="1" end="10" step="2">
    ${i }<br>
</c:forEach>

<%
String[] strs = {"one", "two", "three"};
pageContext.setAttribute("s", strs);
%>
<%--varStatus是循环状态变量 --%>
<c:forEach var="str" items="${pageScope.s }" varStatus="vs">
${vs.index} ${vs.count} ${vs.first} ${vs.last} ${vs.current}<br>
${str }<br>
<hr>
</c:forEach>
</body>
</html>