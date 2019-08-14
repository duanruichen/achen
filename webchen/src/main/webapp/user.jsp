<%--
  Created by IntelliJ IDEA.
  User: 73993
  Date: 2019/7/30
  Time: 23:17
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>用户展示页面</title>
</head>
<body>
<h2>用户列表sss</h2>
<table width="400px" border="1px" borderColor="red" cellspacing="0" align="center">
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>gender</th>
        <th>create_time</th>
        <th>operation</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.User}" var="user">
        <tr>
            <th>${user.id}</th>
            <th>${user.name}</th>
            <th>${user.gender}</th>
            <th>
                <fmt:formatDate value="${user.create_time}" pattern="yyyy-MM-dd"/>
            </th>
            <th>
                <a href="${pageContext.request.contextPath}/one?id=${user.id}">更新</a>
                <a href="${pageContext.request.contextPath}/add?id=${user.id}">增加</a>

            </th>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
