<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function _change(){
	var vcode = document.getElementById("vcode");
	vcode.src = "<c:url value='/VerifyCodeServlet'/>?xxx=" + new Date().getTime();
}
</script>
</head>
<body>
<h1>注册 课时11、12未看！！！</h1>
<p style="color:red; font-weight:1000">${requestScope.msg }</p>
<form action="<c:url value='/RegisterServlet'/>" method="POST">
用户名:<input type="text" name="username" value="${requestScope.user.username }"/><br>
密    码:<input type="password" name="password" value="${requestScope.user.password }"/><br>
验证码:<input type="text" name="verifyCode" value="${requestScope.user.verifyCode}" size="4"/>
	<img id="vcode" src="<c:url value='/VerifyCodeServlet'/>">
	<a href="javascript:_change()">换一张</a>
<input type="submit" value="注册">
</form>
</body>
</html>