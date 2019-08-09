<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function createXMLHttpRequest(){
    try {
        return new XMLHttpRequest();
    } catch (error) {
        alert("请用谷歌浏览器！");
        throw error;
    }
}
window.onload = function(){
    var usernameElem = document.getElementById("username");
    usernameElem.onblur = function() {
        var xmlHttp = createXMLHttpRequest();
        xmlHttp.open("POST", "<c:url value='/BServlet'/>", true);
        xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        xmlHttp.send("username=" + usernameElem.value);
        xmlHttp.onreadystatechange = function(){
            if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                var text = xmlHttp.responseText;
                var spanElem = document.getElementById("errorName");
                if(text == "1"){
                    spanElem.innerHTML = "该用户已被注册！";
                } else {
                    spanElem.innerHTML = "";
                }
            }
        }
    }
}
</script>
</head>
<body>
    <button id="btn">点击这里</button>
    <form action="" method="post">
    用户名：<input type="text" name="username" value="张三" id="username"><span id="errorName"></span><br>
    密码:<input type="password" name="password" value="123"><br>
    <input type="submit" value="注册">
    </form>
</body>
</html>