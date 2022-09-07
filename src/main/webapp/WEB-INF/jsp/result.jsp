<%--
  Created by IntelliJ IDEA.
  User: wayne
  Date: 2022/9/5
  Time: 12:43 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>結果</title>
</head>
<body>
    <form id='form' action="/test/test" method="RequestMapping.POST">
        ${message}<br>
        ID: ${id} <br>
        NAME: ${name} <br>
        <button type="submit" value="確認">確認</button>
    </form>

    <form id='form1' action="/test/details" method="POST">
        <button type="submit" value="確認">詳細</button>
    </form>

</body>
</html>
