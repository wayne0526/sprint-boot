<%--
  Created by IntelliJ IDEA.
  User: wayne
  Date: 2022/9/5
  Time: 11:27 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>輸入頁</title>
</head>
<body>
    <form id='testform' action="/test/result" method="POST">
        ${message}<br>
        <input type='hidden' name='num'>
        <input type='hidden' id='act' name='act' value='add'>
        ID:<input type='text' id='id' name='id'><br>
        NAME:<input type='text' name='name'><br>
        <button type="submit" value="提交">送出</button>
    </form>
</body>
</html>
