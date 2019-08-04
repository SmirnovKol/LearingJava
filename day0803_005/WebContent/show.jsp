<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">search result</h1>
<table align="center" border="1" width="60%">
    <tr>
        <th>book name</th>
        <th>price</th>
        <th>category</th>
    </tr>
<c:forEach items="${requestScope.result }" var="book">
    <tr>
        <td>${book.name }</td>
        <td>${book.price }</td>
        <td>${book.category }</td>
    </tr>
</c:forEach>
</table>
</body>
</html>