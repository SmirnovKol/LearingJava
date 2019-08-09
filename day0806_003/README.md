# jsp EL表达式 ${requestScope.属性名} 
# EL函数库, 在JSP文件中添加<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"%>， 使用示例如下：
<body>
<% 
String[] arr = {"a", "b", "c"};
List<String> list = new ArrayList<String>();
list.add(arr[0]);
pageContext.setAttribute("arr", arr);
pageContext.setAttribute("list", list);
%>
${fn:join(arr, ";") }
${fn:toUpperCase("hello") }
</body>
