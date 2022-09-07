<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>表單</title>
</head>
<body>
    <form  action="/test/test" method="GET" id="back">
        <button id="botton" type="submit">返回首頁</button>
    </form>

    <c:forEach var="data" items="${list}">
        <div>
            ID: ${data.id}<br>
            NAME: ${data.name}<br>
            <hr>
        </div>
    </c:forEach>
</body>
</html>