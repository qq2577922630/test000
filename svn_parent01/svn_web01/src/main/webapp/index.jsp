<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/3
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>测试查询</h2>
<a href="account/findAll_1">查询所有用户1</a><br>
<a href="account/findAll_2">查询所有用户2</a><br>

<h2>测试保存</h2>
<form method="post" action="account/saveAccount">
    姓名: <input type="text" name="accountName">
   金额: <input type="text" name="accountMoney">
    <input type="submit" value="保存">
</form>

</body>
</html>
