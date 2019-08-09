<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
    	var btn = document.getElementById("btn");
        btn.onclick = function(){
            var xmlHttp = createXMLHttpRequest();
            xmlHttp.open("GET", "<c:url value='/AServlet'/>", true);
            xmlHttp.send(null);
            xmlHttp.onreadystatechange = function(){
                if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                    var text = xmlHttp.responseText;
                    var obj = eval("(" + text + ")");
                    var h1 = document.getElementById("h1");
                    h1.innerHTML = obj.name + "," + obj.age + "," + obj.gender;
                }
            };
        };
    };
    
    </script>
</head>
<body>
<button id="btn">点击这里</button>
<h1 id="h1"></h1>
</body>
</html>