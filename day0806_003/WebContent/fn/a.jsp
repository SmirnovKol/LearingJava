<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String[] arr = {"a", "b", "c"};
List<String> list = new ArrayList<String>();
list.add(arr[0]);
pageContext.setAttribute("arr", arr);
pageContext.setAttribute("list", list);
%>
${fn:join(arr, ";") }
${fn:toUpperCase("hello") }
</body>
</html>