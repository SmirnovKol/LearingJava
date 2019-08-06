<%@page import="cn.itcast.domain.Address"%>
<%@page import="cn.itcast.domain.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Address address = new Address();
address.setCity("北京");
address.setStreet("红旗路");

Employee emp = new Employee();
emp.setName("张三");
emp.setAddress(address);

request.setAttribute("xxx", emp);
%>
${requestScope.xxx.hi }
${xxx.address.hi }
${xxx.address.city }
</body>
</html>