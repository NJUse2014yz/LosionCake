<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是一个测试页面</title>
    <table>
        <th>
            <tr>姓名</tr>
            <tr>年纪</tr>
        </th>
        <c:forEach var="user" items="${list}" >
            <td>
                <tr>11</tr>
                <tr>11</tr>
            </td>
        </c:forEach>
    </table>
</head>
<body>

</body>
</html>
