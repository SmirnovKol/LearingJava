<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String message = "";
String msg1 = (String)request.getAttribute("msg");
if(msg1 != null) {
	message = msg1;
}
%>
<font color="red"><%=message %></font>
<font color="green">${requestScope.msg}</font>
<%
Cookie[] cookies = request.getCookies();
String username = "";
String password = "";
if(cookies != null) {
	for(Cookie c: cookies){
		String name = c.getName();
	    switch(name){
	    case "username":
	    	username = c.getValue();
	        break;
	    case "password":
	    	password = c.getValue();
	        break;
	    }
	}
}

%>
<h1>请登录</h1>
<form action="/day0805_001/LoginServlet" method="post">
用户名:<input type="text" name="username" value="<%=username %>"><br>
 密码   :<input type="password" name="password" value="<%=password %>"><br>
 验证码:<input type="text" name="verifyCode">
 <img alt="" src="<%=request.getContextPath() %>/VerifyCodeServlet">
 <input type="button" value="看不清？换一个" id="btn">
 <font color="blue">${requestScope.codeError}</font>
<input type="submit" value="登录">
</form>
<script type="text/javascript">
document.getElementById("btn").onclick = function() {
	document.getElementsByTagName("img")[0].src = 
		"/day0805_001/VerifyCodeServlet?time=" + new Date().getTime();
}
</script>
</body>
</html>