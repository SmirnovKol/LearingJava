<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
    var obj = {"name":"zhangSan", "age":18, "gender":"male"};
    var s = obj.name + "," + obj.age + "," + obj.gender;
    alert(s);
    
    var s2 = "1+2";
    console.log(eval(s2));
    
    var obj3 = "{\"name\":\"zhangSan\", \"age\":18, \"gender\":\"male\"}";
    var obj2 = eval("(" + obj3 + ")");
    var s3 = obj2.name + "," + obj2.age + "," + obj2.gender;
    console.log(s3);
</script>
</head>
<body>

</body>
</html>