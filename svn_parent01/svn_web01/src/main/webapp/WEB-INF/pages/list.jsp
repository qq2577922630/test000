<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>查询所有的帐户</h3>

    <%--<c:forEach items="${accounts}" var="account">--%>
        <%--${account.accountName}--%>
    <%--</c:forEach>--%>
    <table border="1" width="300px"> <tr><th>编号</th> <th>账户名称</th> <th>账户金额</th>
    </tr>

        <c:forEach items="${accounts}" var="account" varStatus="vs"> <tr><td>${vs.count}</td> <td>${account.accountName }</td> <td>${account.accountMoney }</td>
        </tr>
        </c:forEach>
    </table>

</body>
</html>
