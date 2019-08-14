<%--
  Created by IntelliJ IDEA.
  User: 73993
  Date: 2019/8/2
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
xmlns:c="http://www.w3.org/1999/XSL/Transform" xmlns:c="http://www.w3.org/1999/XSL/Transform"
<%@page pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>增加界面</h2>

<form action="${pageContext.request.contextPath}/add" method="post">
    <input type="hidden" value="${requestScope.user.id}" name="id">
    name: <input type="text" name="name" value="${requestScope.user.name}"/><br/>
    gender:
    <c:if test="${requestScope.user.gender==true}">
        <input type="radio" name="gender" value="true" checked>男
        <input type="radio" name="gender" value="false">女
        <br/>
    </c:if>
    <c:if test="${requestScope.user.gender==false}">
        <input type="radio" name="gender" value="true" >男
        <input type="radio" name="gender" value="false" checked>女
        <br/>
    </c:if>

    birth: <input type="text" name="create_time" value='<fmt:formatDate value="${requestScope.user.create_time}"
                                                                            pattern="yyyy-MM-dd"/>'/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
