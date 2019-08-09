<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Date date = new Date();
pageContext.setAttribute("date", date);
%>
<fmt:formatDate value="${pageScope.date }" pattern="yyyy-MM-dd HH:mm:ss"/>
<hr>
<%
double num = Math.acos(0.32);
application.setAttribute("num", num);
%>
<fmt:formatNumber value="${applicationScope.num }" pattern="0.000"/>

</body>
</html>