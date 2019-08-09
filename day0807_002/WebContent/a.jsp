<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="it"  uri="/WEB-INF/tld/itcast.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>测试MyTag4</h1>
<it:mytag5 test="${not empty param.xxx }">
    ${param.xxx }<br>
    <it:mytag4/>
</it:mytag5>
<%
pageContext.setAttribute("xxx", "pageContext_xxxxxx");
%>
<it:mytag3>
    ${pageScope.xxx }
</it:mytag3>
<h1>
<it:mytag3>
你好
</it:mytag3>
</h1>
</body>
</html>