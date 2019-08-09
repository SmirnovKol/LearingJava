<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function createXMLHttpRequest() {
	try {
		return new XMLHttpRequest();
	} catch (e) {
		// TODO: handle exception
		alert("请换用谷歌浏览器！");
		throw e;
	}
}

window.onload = function() {

	var btn = document.getElementById("btn");
	btn.onclick = function() {
		var xmlHttp = createXMLHttpRequest();
		xmlHttp.open("GET", "<c:url value='/AServlet'/>", true);
		xmlHttp.send(null);
		xmlHttp.onreadystatechange = function() {
			if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
				var text = xmlHttp.responseText;
				var h1 = document.getElementById("h1");
				h1.innerHTML = text;
			}
		}
	}
}
</script>
</head>
<body>
<button id="btn">点击这里</button>
<h1 id="h1"></h1>
</body>
</html>