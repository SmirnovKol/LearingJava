<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>省市联动案例</title>
    <script type="text/javascript">
    function createXMLHttpRequest() {
        try {
            return new XMLHttpRequest();
        } catch (error) {
            alert("请用谷歌浏览器！");
            throw error;
        }
    }

    window.onload = function(){
        var xmlHttp = createXMLHttpRequest();
        xmlHttp.open("GET", "<c:url value='/ProvinceServlet'/>", true);
        xmlHttp.send(null);
        xmlHttp.onreadystatechange = function(){
            if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                var text = xmlHttp.responseText;
                var provinceList = text.split(",");
                var proSelect = document.getElementById("p");
                for(var i=0; i < provinceList.length; i++){
                	var e = provinceList[i];
                    var op = document.createElement("option");
                    op.value = e;
                    op.appendChild(document.createTextNode(e));
                    proSelect.appendChild(op);
                }
            }
        };
        
        
        var proSelect = document.getElementById("p");
        proSelect.onchange = function(){
            var xmlHttp = createXMLHttpRequest();
            xmlHttp.open("POST", "<c:url value='/CityServlet'/>", true);
            xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            xmlHttp.send("province=" + proSelect.value);
            xmlHttp.onreadystatechange = function(){
                if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                    var citySelect = document.getElementById("c");
                    var cityOptions = citySelect.getElementsByTagName("option");
                    while(cityOptions.length > 1) {
                        citySelect.removeChild(cityOptions[1]);
                    }
                    var xml = xmlHttp.responseXML;
                    var cityElemList = xml.getElementsByTagName("city");
                    
                    for(var i=0; i<cityElemList.length; i++) {
                        var cityElem = cityElemList[i];
                        var op = document.createElement("option");
                        op.value = cityElem.textContent;
                        op.appendChild(document.createTextNode(cityElem.textContent));
                        citySelect.appendChild(op);
                    }
                }
            }
        };

    };
    
    </script>
</head>
<body>
    <select name="province" id="p">
        <option>===请选择省份====</option>
    </select>
    <select name="city" id="c">
        <option>===请选择城市====</option>
    </select>
</body>
</html>