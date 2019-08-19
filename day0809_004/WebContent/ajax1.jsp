<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <script type="text/javascript" src="<c:url value='/ajax-lib/ajaxutils.js'/>">
   </script>
   <script type="text/javascript">
    window.onload = function(){
        var btn = document.getElementById("btn");
        btn.onclick = function(){
            ajax({
                method: "GET",
                url: "<c:url value='/AServlet'/>",

                params: null,
                responseType: "json",
                callback: function(data){
                    var h1 = document.getElementById("h1");
                    h1.innerHTML = "姓名:" + data.name + "," + data.age + "," + data.gender;
                }
            }); 
        };
    };
    </script>
</head>
<body>
<button id="btn">点击这里</button>
<h1 id="h1"></h1>

</body>
</html>