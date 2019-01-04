<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/4
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>员工编号</th>
        <th>员工名称</th>
        <th>密码</th>
        <th>邮箱</th>
        <th>等级</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${userlist}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.password}</td>
            <td>${u.email}</td>
            <td>${u.lv}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
