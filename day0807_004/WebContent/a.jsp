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
                    if(xmlHttp.readyState == 4 && xmlHttp.status == 200){
                        var xml = xmlHttp.responseXML;
                        var stu = xml.getElementsByTagName("student")[0];
                        var attr = stu.getAttribute("id");
                        var name = stu.getElementsByTagName("name")[0].textContent;
                        var age = stu.getElementsByTagName("age")[0].textContent;
                        var sex = stu.getElementsByTagName("sex")[0].textContent;
                        var result = "attr=" + attr + ",name=" + name + ",age=" + age + ",sex=" + sex;
                        var h1 = document.getElementById("h1");
                        h1.innerHTML = result;
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